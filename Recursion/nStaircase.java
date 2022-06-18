import java.util.Scanner;
public class nStaircase {

    public static int fibInt(int n){
        if(n == 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }

        return fibInt(n-1) + fibInt(n-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(fibInt(n));
    }
}