import java.util.Scanner;

 class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Side A: ");
        int A = input.nextInt();
        System.out.println("Side B: ");
        int B = input.nextInt();
        System.out.println("Side C: ");
        int C = input.nextInt();
        System.out.println("Side D: ");
        int D = input.nextInt();

        System.out.println("Perimeter of rectangle ABCD: ");
        System.out.println(A + B + C + D );

    }
}
