import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        int bill1, bill2, bill3, bill4, bill5, bill = 0;
        int cal1 = 2 * 100; // 0 < unit <= 100
        int cal2 = 3 * 100; // 100 < unit <= 200
        int cal3 = 4 * 100; // 200 < unit <= 300
        int cal4 = 5 * 200; // 300 < unit <= 500
        // if unit > 500 , then INR 7 / unit

        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        if(unit > 500){
            bill = cal1 + cal2 + cal3 + cal4 + (unit-500) * 7;
        }
        else if(unit > 300 && unit <= 500){
            bill = cal1 + cal2 + cal3 + (unit-300) * 5;
        }
        else if
    }



}
