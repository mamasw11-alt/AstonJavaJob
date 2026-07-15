import java.util.*;

public class PhoneBook {
    // Map: фамилия -> список телефонов
    private Map<String, List<String>> phoneBook;
    
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    
    // Метод для добавления записи
    public void add(String surname, String phoneNumber) {
        // Приводим фамилию к нижнему регистру для унификации
        String key = surname.toLowerCase();
        
        // Если фамилия уже есть, добавляем номер к существующему списку
        if (phoneBook.containsKey(key)) {
            List<String> phones = phoneBook.get(key);
            if (!phones.contains(phoneNumber)) {
                phones.add(phoneNumber);
                System.out.println("Добавлен телефон " + phoneNumber + " для " + surname);
            } else {
                System.out.println("Телефон " + phoneNumber + " уже существует для " + surname);
            }
        } else {
            // Иначе создаем новую запись
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            phoneBook.put(key, phones);
            System.out.println("Добавлена новая запись: " + surname + " -> " + phoneNumber);
        }
    }
    
    // Метод для поиска телефонов по фамилии
    public List<String> get(String surname) {
        String key = surname.toLowerCase();
        
        if (phoneBook.containsKey(key)) {
            return new ArrayList<>(phoneBook.get(key)); // Возвращаем копию списка
        } else {
            return new ArrayList<>(); // Возвращаем пустой список
        }
    }
    
    // Метод для получения всех записей
    public void printAll() {
        System.out.println("\n ТЕЛЕФОННЫЙ СПРАВОЧНИК ");
        if (phoneBook.isEmpty()) {
            System.out.println("Справочник пуст");
            return;
        }
        
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String surname = entry.getKey();
            // Восстанавливаем оригинальное написание фамилии
            String originalSurname = findOriginalSurname(surname);
            List<String> phones = entry.getValue();
            System.out.println(originalSurname + ": " + String.join(", ", phones));
        }
    }
    
    // Вспомогательный метод для восстановления оригинальной фамилии
    private String findOriginalSurname(String lowerCaseSurname) {
        // Так как мы храним все в нижнем регистре, ищем оригинал в мапе
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(lowerCaseSurname)) {
                // Возвращаем фамилию с большой буквы (для красоты)
                String[] parts = lowerCaseSurname.split(" ");
                StringBuilder result = new StringBuilder();
                for (String part : parts) {
                    if (part.length() > 0) {
                        result.append(Character.toUpperCase(part.charAt(0)));
                        result.append(part.substring(1));
                        result.append(" ");
                    }
                }
                return result.toString().trim();
            }
        }
        return lowerCaseSurname;
    }
    
    // Метод для удаления номера
    public boolean removePhone(String surname, String phoneNumber) {
        String key = surname.toLowerCase();
        if (phoneBook.containsKey(key)) {
            List<String> phones = phoneBook.get(key);
            if (phones.remove(phoneNumber)) {
                if (phones.isEmpty()) {
                    phoneBook.remove(key);
                }
                System.out.println("Телефон " + phoneNumber + " удален для " + surname);
                return true;
            }
        }
        System.out.println("Телефон " + phoneNumber + " не найден для " + surname);
        return false;
    }
    
    // Метод для удаления всей записи по фамилии
    public boolean removeEntry(String surname) {
        String key = surname.toLowerCase();
        if (phoneBook.containsKey(key)) {
            phoneBook.remove(key);
            System.out.println("Запись для " + surname + " удалена");
            return true;
        }
        System.out.println("Запись для " + surname + " не найдена");
        return false;
    }
}
