public class test1_5 {
    public static void main(String[] args) {
        b1_5 inv1 = new b1_5("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1.toString());
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1.toString());
        System.out.println("id la:" + inv1.getId());
        System.out.println(" desc la:" + inv1.getDesc());
        System.out.println(" qty la:" + inv1.getQty());
        System.out.println(" unitPrice la " + inv1.getUnitPrice());
        System.out.println("Tong so la:" + inv1.getTotal());


    }

}
