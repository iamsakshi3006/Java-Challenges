import java.util.Scanner;

 class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Sum of the numbers: ");
        System.out.println(a + b);
        System.out.println("Difference of the numbers: ");
        System.out.println(a - b);
        System.out.println("Product of the numbers: ");
        System.out.println(a * b);
        System.out.println("Division of the numbers: ");
        System.out.println(a / b);
        System.out.println("Modulus of the numbers: ");
        System.out.println(a % b);


    }
}
