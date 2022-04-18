import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger log = Logger.getLogger();
        log.info("...Програма стартовала...");
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        log.info("Просим пользователя ввести исходные данные");
        System.out.print("Введите размер списка: ");
        int arraySize = scanner.nextInt();
        System.out.println("Введите верхнюю границу значений: ");
        int arrayLimit = scanner.nextInt();
        log.info("Создаём список");

        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(arrayLimit));
        }
        System.out.println("Случайный список: " + list);
        System.out.println("Введите число для фильтрации: ");
        int f = scanner.nextInt();

        log.info("Запуск фильтрации");
        Filter filter = new Filter(f);
        System.out.println("Отфильтрованный список: " + filter.filterOut(list));
        log.info("Вывод результата");
        log.info("...Завершение программы...");
    }
}
