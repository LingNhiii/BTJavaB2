package btvn;

import java.util.Scanner;

public class btvnb2b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Day la tam giac vuong!");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can!");
            } else if ((a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) && (a == b || a == c || b == c)) {
                System.out.println("Day la tam giac vuong can!");
            } else if (a == b && b== c) {
                System.out.println("Day la tam giac deu!");
            } else {
                System.out.println("Day la tam giac thuong!");
            }
        }
        else {
            System.out.println("Ba canh a,b,c khong phai la ba canh cua mot tam giac");
        }
    }
}
