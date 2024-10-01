import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = sc.nextDouble();
        System.out.println("sin x: "+ Math.sin(n));
        System.out.println("Cos x: "+ Math.cos(n));
        System.out.println("Can bac hai cua x: "+ Math.sqrt(n));
    }
}

