package jp.co.pmtech.iwata;

import java.util.List;

public class Cart {

    /** カートID */
    private int id;
    /** カートの中の商品 */
    private List<Syohin> syohinList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Syohin> getSyohinList() {
        return syohinList;
    }

    public void setSyohinList(List<Syohin> syohinList) {
        this.syohinList = syohinList;
    }
}
