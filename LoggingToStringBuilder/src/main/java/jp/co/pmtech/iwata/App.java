package jp.co.pmtech.iwata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {
        
        Syohin syohin1 = new Syohin();
        syohin1.setId(1);
        syohin1.setName("ボールペン");
        syohin1.setPrice(new BigDecimal(120));

        Syohin syohin2 = new Syohin();
        syohin2.setId(2);
        syohin2.setName("ティッシュ");
        syohin2.setPrice(new BigDecimal(298));

        List<Syohin> list = new ArrayList<>();
        list.add(syohin1);
        list.add(syohin2);

        Cart cart = new Cart();
        cart.setId(1);
        cart.setSyohinList(list);

        // LoggingToStringBuilderでシリアライズ
        String str = LoggingToStringBuilder.reflectionToString(cart, new LoggingToStringStyle("jp.co.pmtech.iwata"));
        System.out.println(str);

        // JSONにしてみる
        ObjectMapper mapper = new ObjectMapper();
        String str2 = mapper.writeValueAsString(cart);
        System.out.println(str2);

        // RecursiveToStringStyleでシリアライズ
        String str3 = ReflectionToStringBuilder.toString(cart, new RecursiveToStringStyle());
        System.out.println(str3);
    }
}
