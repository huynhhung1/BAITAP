public class b1_5 {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public b1_5(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;

    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }
    public String getDesc() {
        String desc1 = desc;
        return desc1;

    }
    public void setDesc(String desc) {
        this.desc = desc;

    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;

    }
    public double getUnitPrice() {
        return unitPrice;

    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;

    }
    public double getTotal() {
        return qty * unitPrice;
    }
    @Override

    public String toString() {
        return "InvoiceItem [Id= "+ id+",description= "+ desc +", quatity="+ qty +",unitPrice=" + unitPrice + ",total="+ getTotal()+"]";

    }
}
