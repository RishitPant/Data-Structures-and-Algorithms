import java.util.Scanner;
public class Factorial {
    public static int calcFactorial(int n){
        if (n == 0){
            return 1;
        }

        return n * calcFactorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(calcFactorial(n));
    }
}