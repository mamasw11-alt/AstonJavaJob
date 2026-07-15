import java.util.*;

public class StudentService {
    
    // Метод для удаления студентов со средним баллом < 3
    public static void removeLowPerformingStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        int removedCount = 0;
        
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                System.out.println("Удален студент: " + student.getName() + 
                                 " (средний балл: " + student.getAverageGrade() + ")");
                iterator.remove();
                removedCount++;
            }
        }
        
        if (removedCount == 0) {
            System.out.println("Нет студентов для удаления");
        } else {
            System.out.println("Всего удалено: " + removedCount + " студентов");
        }
    }
    
    // Метод для перевода студентов на следующий курс
    public static void promoteStudents(Set<Student> students) {
        System.out.println("\n--- Перевод студентов ---");
        int promotedCount = 0;
        
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.promoteToNextCourse();
                promotedCount++;
            }
        }
        
        if (promotedCount == 0) {
            System.out.println("Нет студентов для перевода");
        } else {
            System.out.println("Всего переведено: " + promotedCount + " студентов");
        }
    }
    
    // Метод для печати студентов на заданном курсе
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\n--- Студенты на " + course + " курсе ---");
        boolean found = false;
        
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("  - " + student.getName() + " (группа: " + student.getGroup() + 
                                 ", средний балл: " + student.getAverageGrade() + ")");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Нет студентов на " + course + " курсе");
        }
    }
    
    // Дополнительный метод для вывода всех студентов
    public static void printAllStudents(Set<Student> students) {
        System.out.println("\n=== ВСЕ СТУДЕНТЫ ===");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
