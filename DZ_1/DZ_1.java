// Задача 1

import java.util.Scanner;
public class DZ_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите n-ое число: ");
        int num = iScanner.nextInt();
        int res = (num * (num + 1)) / 2;
        System.out.println(res);
    }
}

//Задача 2
//public class DZ_1 {
//    public static void main(String[] args) {
//        for (int i = 1; i < 1001; i++) {
//            System.out.println(i);
//        }
//    }
//}

//Задача 3
//import java.util.Scanner;
//public class DZ_1 {
//    public static void main(String[] args) {
//        double num1;
//        double num2;
//        double ans;
//        char op;
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Введите два числа через пробел: ");
//        num1 = reader.nextDouble();
//        num2 = reader.nextDouble();
//        System.out.print("\nВведите оператор (+, -, *, /): ");
//        op = reader.next().charAt(0);
//        switch (op) {
//            case '+':
//                ans = num1 + num2;
//                break;
//            case '-':
//                ans = num1 - num2;
//                break;
//            case '*':
//                ans = num1 * num2;
//                break;
//            case '/':
//                ans = num1 / num2;
//                break;
//            default:
//                System.out.print("Введен некорректный оператор");
//                return;
//        }
//        System.out.println();
//        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
//    }
//}