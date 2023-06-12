package bai2;
import java.util.Scanner;
public class Mainb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập giá trị c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.calculateRoots();
    }
}
