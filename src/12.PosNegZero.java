import java.util.Scanner;

 class PosNegZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Determining if a number is positive,negative or zero");

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("Positive");
        }

        else if(num == 0) {
            System.out.println("Zero");
        }
            else{
                System.out.println("Negative");
            }




    }
}
