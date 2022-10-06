import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Ta co phuong trinh 'a * x + b = c', dien vao cac gia tri a, b, c");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("nghiem cua phuong trinh x = %f\n",answer);
        } else {
            if (b == c) {
                System.out.print("vo so nghiem");
            } else {
                System.out.print("vo nghiem");
            }
        }
    }
}