package rikkei.academy;

import java.util.Scanner;

public class InHinhTamGiacVuongTopLeft {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số hàng n: ");
        int n = scanner.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
