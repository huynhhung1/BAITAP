import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = scanner.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);


        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = scanner.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);


        System.out.println("First complex number: " + complex1);
        System.out.println("Second complex number: " + complex2);


        System.out.println("Is the first complex number real? " + complex1.isReal());
        System.out.println("Is the first complex number imaginary? " + complex1.isImaginary());
        System.out.println("Is the second complex number real? " + complex2.isReal());
        System.out.println("Is the second complex number imaginary? " + complex2.isImaginary());


        System.out.println("Are the two complex numbers equal? " + complex1.equals(complex2));


        System.out.println("Addition: " + complex1.addNew(complex2));
        System.out.println("Subtraction: " + complex1.SubtractNew(complex2));
        System.out.println("Multiplication: " + complex1.multiply(new MyComplex(real2, imag2)));
        System.out.println("Division: " + complex1.divide(new MyComplex(real2, imag2)));


        System.out.println("Conjugate of the first complex number: " + complex1.conjugate());
        System.out.println("Conjugate of the second complex number: " + complex2.conjugate());

        scanner.close();
    }
}






