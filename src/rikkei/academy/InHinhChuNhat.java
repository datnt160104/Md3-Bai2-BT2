package rikkei.academy;

import java.util.Scanner;

public class InHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        int length = sc.nextInt();

        System.out.print("Nhập chiều rộng: ");
        int width = sc.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
