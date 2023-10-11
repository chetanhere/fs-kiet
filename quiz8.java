import java.util.Scanner;

public class quiz8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        while (i<N){
            int x = sc.nextInt();
            System.out.println("a new number:" +x);
            i = i+1;
        }
    }
}
