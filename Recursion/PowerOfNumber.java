import java.util.Scanner;

class PowerOfNumber {

    public static int Power(int n) {
        if(n == 0){
            return 1;
        }

        return 10 * Power(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(Power(n));
    }
}