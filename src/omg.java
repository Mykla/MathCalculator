import java.util.Scanner;

/**
 * С помощью консоли пользователь вводит
 * математическое выражение типа "1+33-4*7". Написать
 * программу для подсчета его значения. Приоритет
 * операций не учитывается.
 * Created by user on 22.03.2015.
 */
public class omg {
    public static void main(String args[]) {
        int fnum = 0;
        String strtype; // Выражение, введенное из командной строки
        char[] testchar; // Массив символов после преобразования введенного выражения (тип String)
        char currentchar; // Промежуточная символьная переменная для обработки массива символов в цикле
        String tempnumstr = null; //Промежуточная строчная переменная для преобразования в int

        Scanner scan = new Scanner(System.in); // Ввод выражения для расчета
        System.out.println("Введите выражение для расчета: ");
        strtype = scan.nextLine();

        testchar = strtype.toCharArray(); //преобразования введенного выражения в массив символов

        //Задаем первый аргумент для вычисления
        String charToString = Character.toString(testchar[0]);
        fnum = Character.getNumericValue(charToString.charAt(0));

        int b = 1;
        while (b < testchar.length) {
            currentchar = testchar[b];
                        // Сложение
            if (currentchar == '+') {
                tempnumstr = Character.toString(testchar[b + 1]);
                fnum = fnum + Integer.parseInt(tempnumstr);
                tempnumstr = null;
                b = b + 2;
                         // Вычитание
            } else if (currentchar == '-') {
                tempnumstr = Character.toString(testchar[b + 1]);
                fnum = fnum - Integer.parseInt(tempnumstr);
                tempnumstr = null;
                b = b + 2;
                         // Умножение
            } else if (currentchar == '*') {
                tempnumstr = Character.toString(testchar[b + 1]);
                fnum = fnum * Integer.parseInt(tempnumstr);
                tempnumstr = null;
                b = b + 2;
                          // Деление
            } else if (currentchar == '/') {
                tempnumstr = Character.toString(testchar[b + 1]);
                fnum = fnum / Integer.parseInt(tempnumstr);
                tempnumstr = null;
                b = b + 2;
            } else {
                tempnumstr = tempnumstr + currentchar; // Попытка создать символбную переменную для n-разрядного числа
                b++;
            }
        }
        System.out.println();
        System.out.println("Результат: " + fnum);
    }
}


