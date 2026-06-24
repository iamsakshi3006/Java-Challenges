import java.util.Scanner;

 class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Base of triangle B in cms: ");
        double B = input.nextDouble();
        System.out.println(" Height of triangle H cms: ");
        double H = input.nextDouble();


        double area = 0.5 * B * H ;

        System.out.println("Area of triangle: " + area + "cms2" );
    }
}
