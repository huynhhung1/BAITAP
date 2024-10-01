import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        int width;
        int heigh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = sc.nextInt();
        System.out.println("Enter height: ");
        heigh = sc.nextInt();
        System.out.println(" Dien tich hcn :"+ width*heigh);
        System.out.println(" Chu vi hcn :"+ (width+heigh)*2);;
    }
}
