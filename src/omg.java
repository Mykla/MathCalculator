import java.text.ParseException;
import java.util.Scanner;

/**
 * С помощью консоли пользователь вводит
 * математическое выражение типа "1+33-4*7". Написать
 * программу для подсчета его значения. Приоритет
 * операций не учитывается.
 * Created by user on 22.03.2015.
 */
public class omg {
    public static void main(String args[]) throws ParseException {
        double fnum; // Определение результирующей переменной
        String strtype; // Выражение, введенное из командной строки

        Scanner scan = new Scanner(System.in); // Ввод выражения для расчета
        System.out.println("Введите выражение для расчета: ");
        strtype = scan.nextLine();

        String[] numerics = strtype.split("[+-/*]"); // Вычленение "подстрок" заданного типа [+-/*]

        double[] numbers = new double[numerics.length]; // Задание массива для преебразованиея в double
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.valueOf(numerics[i]);  // Заполнение массива преобразованными к double значениями
        }

        //Задаем первый аргумент для вычисления
        fnum = numbers[0];

        // Определяется массив имевших место операторов в выражении
        String[] operators = strtype.split("\\d+");

        int b = 1;
        while (b < operators.length) {
                        // Сложение
            if (operators[b].compareTo("+") == 0) {
                fnum = fnum + numbers[b];
                b++;
                         // Вычитание
            } else if (operators[b].compareTo("-") == 0) {
                fnum = fnum - numbers[b];
                b++;
                         // Умножение
            } else if (operators[b].compareTo("*") == 0) {
                fnum = fnum * numbers[b];
                b++;
                          // Деление
            } else if (operators[b].compareTo("/") == 0) {
                fnum = fnum * numbers[b];
                b++;
            }
        }
        System.out.println();
        System.out.println("Результат: " + fnum);
    }
}


