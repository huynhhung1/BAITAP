public class test1_3 {
    public static void main(String[] args) {
        b1_3 r1= new b1_3(1.2f,3.4f);
        System.out.println(r1);
        b1_3 r2= new b1_3();
        System.out.println(r2);
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is:" + r1.getLength());
        System.out.println("width is:" + r1.getWidth());
        System.out.printf("Area is %.2f%n :", r1.getArea());
        System.out.printf("chu vi la : %2f%n ", r1.getPerimeter());

    }
}
