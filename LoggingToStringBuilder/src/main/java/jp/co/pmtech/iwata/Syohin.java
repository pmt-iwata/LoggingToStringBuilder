package jp.co.pmtech.iwata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Syohin {
  
    /** 商品ID */
    private int id;
    /** 商品名 */
    private String name;
    /** 価格 */
    @LogIgnore
    @JsonIgnore
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
 
}
