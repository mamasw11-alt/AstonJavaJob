import java.util.List;

public class PhoneBookDemo {
    public static void main(String[] args) {
        System.out.println(" ЗАДАНИЕ 2: ТЕЛЕФОННЫЙ СПРАВОЧНИК \n");
        
        PhoneBook phoneBook = new PhoneBook();
        
        // Добавляем записи
        System.out.println(" Добавление записей ");
        phoneBook.add("Иванов", "+7-912-345-67-89");
        phoneBook.add("Петров", "+7-913-456-78-90");
        phoneBook.add("Иванов", "+7-916-789-01-23");
        phoneBook.add("Сидорова", "+7-914-567-89-01");
        phoneBook.add("Иванов", "+7-917-890-12-34");
        phoneBook.add("Петров", "+7-918-901-23-45");
        phoneBook.add("Смирнов", "+7-919-012-34-56");
        
        // Выводим весь справочник
        phoneBook.printAll();
        
        // Поиск по фамилии
        System.out.println("\n--- Поиск телефонов ---");
        String surname = "Иванов";
        List<String> phones = phoneBook.get(surname);
        System.out.println("Телефоны для " + surname + ": " + String.join(", ", phones));
        
        surname = "Петров";
        phones = phoneBook.get(surname);
        System.out.println("Телефоны для " + surname + ": " + String.join(", ", phones));
        
        surname = "Сидоров";
        phones = phoneBook.get(surname);
        System.out.println("Телефоны для " + surname + ": " + (phones.isEmpty() ? "не найдены" : String.join(", ", phones)));
        
        // Тестирование удаления
        System.out.println("\n--- Удаление телефона ---");
        phoneBook.removePhone("Иванов", "+7-916-789-01-23");
        phoneBook.printAll();
        
        System.out.println("\n--- Удаление записи ---");
        phoneBook.removeEntry("Сидорова");
        phoneBook.printAll();
        
        // Добавление существующего номера
        System.out.println("\n--- Добавление существующего номера ---");
        phoneBook.add("Иванов", "+7-912-345-67-89");
        
        // Финальный вывод
        phoneBook.printAll();
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Программа завершена успешно!");
    }
}
