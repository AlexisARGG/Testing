import java.util.Scanner;

public class numberFun {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Num 1: ");
        num1 =input.nextInt();
        System.out.print("Num 2: ");
        num2 =input.nextInt();
        int result = num1 - num2;
        System.out.println("Result: " + result);


    }
}
