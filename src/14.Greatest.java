import java.util.Scanner;
class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest of three numbers");
        System.out.print("Enter the first number A:");
        int A = input.nextInt();
        System.out.print("Enter the second number B:");
        int B = input.nextInt();
        System.out.print("Enter the third number C:");
        int C = input.nextInt();
         if(A > B && A > C){
             System.out.println("A is the greatest");
         }
         else if(B > A && B > C){
             System.out.println("B is the greatest");
         }
         else{
             System.out.println("C is the greatest");
         }

    }
}
