public class BonusMilesService {
    public int calculate(int price) {
        int calcMiles;
        if (price > 1000) {
            calcMiles = (price / 20);
        } else {
            calcMiles = 0;
        }
        return (calcMiles);

    }
}
/*
int minimalSummForBonus = 1000;
int bonus = minimalSummForBonus > 1000 ? payment / 100 : 0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сервис расчета начисления бонусных миль за купленный билет");
        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int ticetCost = (13676); // стоимость билета
        int mileCost = (20); // стоимость одной бонусной мили
        System.out.println("Стоимость билета " + ticetCost); // вывод информации о стоимости билета
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество покупаемых билетов: ");
        int number = scanner.nextInt(); // ожидание от пользователя ввода количества покупаемых билетов

        System.out.println("Вы приобрели " + number + " билетов");

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int miles = (ticetCost * number / mileCost); // расчет бонусных миль
        System.out.println("За покупку билета Вам будет начислено " + miles + " миль");
    }
}

 */