import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.println("the number user has input:" + num);

        if (num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }


}
