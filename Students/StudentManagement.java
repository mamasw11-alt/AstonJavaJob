import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        // Создаем студентов
        Set<Student> students = new HashSet<>();
        
        // Студент 1 - хорошист
        students.add(new Student("Иванов Иван", "Группа А", 1, 
                                 Arrays.asList(4, 5, 3, 4, 5)));
        
        // Студент 2 - отличник
        students.add(new Student("Петрова Анна", "Группа Б", 2, 
                                 Arrays.asList(5, 5, 5, 4, 5)));
        
        // Студент 3 - двоечник
        students.add(new Student("Сидоров Сергей", "Группа А", 1, 
                                 Arrays.asList(2, 3, 2, 2, 3)));
        
        // Студент 4 - троечник
        students.add(new Student("Козлова Мария", "Группа В", 3, 
                                 Arrays.asList(3, 3, 3, 3, 3)));
        
        // Студент 5 - хорошист
        students.add(new Student("Михайлов Алексей", "Группа Б", 2, 
                                 Arrays.asList(4, 4, 4, 5, 4)));
        
        // Студент 6 - двоечник
        students.add(new Student("Новикова Елена", "Группа В", 3, 
                                 Arrays.asList(2, 2, 3, 2, 2)));
        
        System.out.println("========== ЗАДАНИЕ 1: УПРАВЛЕНИЕ СТУДЕНТАМИ ==========\n");
        
        // 1. Показываем всех студентов
        StudentService.printAllStudents(students);
        
        // 2. Выводим студентов на курсе 2
        StudentService.printStudents(students, 2);
        
        // 3. Пытаемся перевести студентов на следующий курс
        System.out.println("\n" + "=".repeat(40));
        StudentService.promoteStudents(students);
        
        // 4. Показываем студентов после перевода
        StudentService.printAllStudents(students);
        
        // 5. Удаляем студентов со средним баллом < 3
        System.out.println("\n" + "=".repeat(40));
        StudentService.removeLowPerformingStudents(students);
        
        // 6. Показываем итоговый список
        System.out.println("\n" + "=".repeat(40));
        System.out.println("=== ИТОГОВЫЙ СПИСОК СТУДЕНТОВ ===");
        StudentService.printAllStudents(students);
        
        // 7. Выводим студентов на курсе 3 после всех операций
        StudentService.printStudents(students, 3);
    }
}
