package btvn;

import java.util.Scanner;

public class btvnb2b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date, month, year;
        do {
            System.out.println("nhap ngay, thang, nam: ");
            date = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();
            System.out.println("ngay: " + date + " thang: " + month + " nam: " + year);
            if (date < 0 || date > 31 || month < 0 || month > 12) {
                System.out.println("ngay sinh va thang sinh khong hop le!");
            }
            else if((date>=20 && month==1) || (date <=18 && month==2) ){
                System.out.println("Thuoc cung bao binh!");
            }
            else if((date>=19 && month==2) || (date <=20 && month==3) ){
                System.out.println("Thuoc cung song ngu!");
            }
            else if((date>=21 && month==3) || (date <=20 && month==4) ){
                System.out.println("Thuoc cung bach duong!");
            }
            else if((date>=21 && month==4) || (date <=20 && month==5) ){
                System.out.println("Thuoc cung kim nguu!");
            }
            else if((date>=21 && month==5) || (date <=21 && month==6) ){
                System.out.println("Thuoc cung song tu!");
            }
            else if((date>=22 && month==6) || (date <=22 && month==7) ){
                System.out.println("Thuoc cung cu giai!");
            }
            else if((date>=23 && month==7) || (date <=23 && month==8) ){
                System.out.println("Thuoc cung su tu!");
            }
            else if((date>=23 && month==8) || (date <=23 && month==9) ){
                System.out.println("Thuoc cung xu nu!");
            }
            else if((date>=23 && month==9) || (date <=23 && month==10) ){
                System.out.println("Thuoc cung thien binh!");
            }
            else if((date>=24 && month==10) || (date <=22 && month==11) ){
                System.out.println("Thuoc cung bo cap!");
            }
            else if((date>=23 && month==11) || (date <=21 && month==12) ){
                System.out.println("Thuoc cung nhan ma!");
            }
            else{
                System.out.println("Thuoc cung ma ket");
            }
        }
        while (date < 0 || date > 31 || month < 0 || month > 12);
    }
}
