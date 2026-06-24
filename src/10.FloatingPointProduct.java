import java.util.Scanner;

class FloatingPointProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = input.nextFloat();
        System.out.println("Enter the second number: ");

        float b = input.nextFloat();
        System.out.println("Product of two floating point numbers: ");
        System.out.println(a * b);

    }
}
