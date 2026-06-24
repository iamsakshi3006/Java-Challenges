import java.util.Scanner;

 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate compound interest: ");
        System.out.println("Principle P: ");
        int P = input.nextInt();
        System.out.println("Rate R: ");
        int R = input.nextInt();
        System.out.println("Time t: ");
        int t = input.nextInt();
        System.out.println("Compound Interest: ");

        int CompoundInterest = P*(1+R/100)^t;
        System.out.println(P*(1+R/100)^t );




    }
}
