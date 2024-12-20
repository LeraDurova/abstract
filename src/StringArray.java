import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringArray {
    private ArrayList<String> strings;

    // Конструктор
    public StringArray() {
        strings = new ArrayList<>();
    }

    // Метод для добавления элемента
    public void add(String item) {
        strings.add(item);
        // Сортировка по длине строки
        Collections.sort(strings, Comparator.comparingInt(String::length));
    }

    // Метод для получения строки максимальной длины
    public String getMaxElement() {
        if (strings.isEmpty()) {
            throw new IllegalStateException("Массив пуст.");
        }
        return Collections.max(strings, Comparator.comparingInt(String::length));
    }

    // Метод для вычисления средней длины строк
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0;
        }
        int totalLength = 0;
        for (String s: strings) {
            totalLength +=  s.length();
        }
        return (double) totalLength / strings.size();
    }

    // Тестирование класса
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();

        stringArray.add("apple");
        stringArray.add("banana");
        stringArray.add("kiwi");
        stringArray.add("strawberry");

        System.out.println("Строка максимальной длины: " + stringArray.getMaxElement());
        System.out.println("Средняя длина строк: " + stringArray.getAverageLength());

        System.out.println("Список строк:");
        for (String s : stringArray.strings) {
            System.out.println(s);
        }
    }
}