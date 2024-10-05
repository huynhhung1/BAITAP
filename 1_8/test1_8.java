public class test1_8 {
    public static void main(String[] args) {
        b1_8 t1= new b1_8(1,2,3);
        System.out.println(t1.toString());
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1.toString());
        System.out.println("Gio:"+ t1.getHour());
        System.out.println("phut:"+ t1.getMinute());
        System.out.println("Giay:"+t1.getSecond());
        b1_8 t3= new b1_8(23,59,58);
        System.out.println(t3);
        t3.nextSecond();
        System.out.println(t3);
        t3.nextSecond();
        System.out.println(t3);


        t3.previousSecond();
        System.out.println(t3);
        t3.previousSecond();
        System.out.println(t3);

    }
}
