package ua.dp.levelup.homework.lesson2;

/**
 * Created by andreypo on 11/9/2016.
 */
public class Operators
{
    public static void main(String[] args)
    {
        //  1.  С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?
        int passedDays = 234;
        int passedWeeks = passedDays / 7;
        System.out.println("Passed " + passedDays + " days correspond to " + passedWeeks + " weeks");

        //  2. Дан прямоугольник с размерами 543 130 мм. Сколько квадратов со стороной 130 мм можно отрезать от него?
        int rectangleSide = 543;
        int squareSide = 130;
        int squareCount = rectangleSide / 130;
        System.out.println(squareCount + " squares with squareSide = " + squareSide + " are available from rectangleSide " + rectangleSide);

/*        3. Дано двузначное число. Найти:
        а) число десятков в нем;
        б) число единиц в нем;
        в) сумму его цифр;
        г) произведение его цифр.*/
        int number = 47;
        int decCount = number / 10;
        int unitCount = number % 10 ; // number
        int sum = (number / 10) + (number % 10);
        int multiply = (number / 10) * (number % 10);
        System.out.println(decCount + " " + unitCount + " " + sum + " " + multiply);

//        4. Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа.
        int number2 = 38;
        int reverseNumber = (number2 % 10) * 10 + (number2 / 10);
        System.out.println(reverseNumber);

/*        5. Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь:
        а) не А и В; б) А или не В; в) А и В или С.*/
        boolean A = true;
        boolean B = false;
        boolean C = false;
        System.out.println(!A && B);
        System.out.println(A || !B);
        System.out.println((A && B) || C);

/*        6. Вычислить значение логического выражения при следующих значениях логических величин X, Y и Z: X = Ложь, Y = Ложь, Z = Истина:
        а) X или Y и не Z;
        б) не X и не Y;
        в) не (X и Z) или Y;
        г) X и не Y или Z;
        д) X и (не Y или Z);
        е) X или (не (Y или Z)).*/

        boolean X = false;
        boolean Y = false;
        boolean Z = true;
        System.out.println((X || Y) && !Z);
        System.out.println(!X && !Y);
        System.out.println(!(X && Z) || Y);
        System.out.println((X && !Y) || Z);
        System.out.println(X && (!Y || Z));
        System.out.println(X || (!(Y || Z)));

/*        7. Вычислить значение логического выражения:
        а) x2 + y2 <= 4 при x =1, y =-1;
        б) (x => 0) или (y2 != 4) при x = 1, y = 2;
        в) (x => 0) и (y2 !+ 4) при x = 1, y = 2;
        г) (x * y != 0) и (y > x) при x = 2, y = 1;
        д) (x * y != 0) или (y < x) при x = 2, y = 1;
        е) (не(x * y < 0)) и (y > x) при x = 2, y = 1;
        ж) (не(x * y < 0)) или (y > x) при x = 1, y = 2.*/
        int x, y;
        x = 1;
        y = -1;
        System.out.println(x * x + y * y <= 4);
        x = 1;
        y = 2;
        System.out.println((x >= 0) || (y * y != 4));
        System.out.println((x >= 0) && (y * y != 4));
        x = 2;
        y = 1;
        System.out.println((x * y != 0) && (y > x));
        System.out.println((x * y != 0) || (y > x));
        System.out.println(!(x * y < 0) && (y > x));
        x = 1;
        y = 2;
        System.out.println(!(x * y < 0) || (y > x));

    }
}
