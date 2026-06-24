import java.util.Scanner;

 class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Principle P: ");
        int P = input.nextInt();
        System.out.println("Rate R: ");
        double R = input.nextDouble();
        System.out.println("Time T: ");
        double T = input.nextDouble();
        System.out.println("Simple Interest:  ");
        double SimpleInterest = (P * R * T)/100;
        System.out.println(P * R * T / 100);

    }
}
