import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Nam: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " La nam nhuan");
                } else {
                    System.out.println(year + " Khong phai nam nhuan");
                }
            } else {
                System.out.println(year + " La nam Nhuan");
            }
        } else {
            System.out.println(year + " Khong phai nam nhuan");
        }
    }
}