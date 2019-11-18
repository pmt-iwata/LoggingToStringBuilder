package jp.co.pmtech.iwata;

import java.lang.reflect.Field;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LoggingToStringBuilder extends ReflectionToStringBuilder {

    public LoggingToStringBuilder(final Object object, final ToStringStyle style) {
        super(object, style);
    }

    public static String reflectionToString(final Object object, final ToStringStyle style) {
        LoggingToStringBuilder builder = new LoggingToStringBuilder(object, style) {
            @Override
            protected boolean accept(final Field field) {
                if (!super.accept(field)) {
                    return false;
                }
                if (field.getAnnotation(LogIgnore.class) != null) {
                    return false;
                }
                return true;
            }
        };

        return builder.toString();
    }
}
