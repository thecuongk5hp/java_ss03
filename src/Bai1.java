
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println(number + "la So khong phai chan cung khong phai le");
        }  else if (number % 2 == 0) {
            System.out.println(number + "la so chan");
        } else {
            System.out.println(number + "la so le");
        }
        scanner.close();
    }
}
