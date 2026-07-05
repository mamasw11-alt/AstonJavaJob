public class Main {
    public static void main(String[] args) {
      
        System.out.println("========== ТОВАРЫ ==========\n");

        // Создаем массив из 5 товаров
        Product[] productsArray = new Product[5];
        
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", 
                                       "Samsung Corp.", "Korea", 5599, true);
        
        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025", 
                                       "Apple Inc.", "USA", 6999, false);
        
        productsArray[2] = new Product("Xiaomi 14T", "10.01.2025", 
                                       "Xiaomi", "China", 3999, true);
        
        productsArray[3] = new Product("Google Pixel 9", "20.02.2025", 
                                       "Google", "USA", 4999, false);
        
        productsArray[4] = new Product("OnePlus 12", "05.04.2025", 
                                       "OnePlus", "China", 4599, true);

        // Выводим информацию о каждом товаре
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар #" + (i + 1));
            productsArray[i].printInfo();
        }

    
        System.out.println("\n========== ПАРК ==========\n");

        // Создаем парк
        Park park = new Park("Центральный парк культуры и отдыха");

        // Добавляем аттракционы 
        park.addAttraction("Колесо обозрения", "10:00 - 22:00", 350);
        park.addAttraction("Американские горки", "11:00 - 21:00", 500);
        park.addAttraction("Автодром", "10:00 - 20:00", 250);
        park.addAttraction("Комната страха", "12:00 - 23:00", 400);

        // Выводим все аттракционы
        park.printAttractions();

        System.out.println("\n=== Работа с конкретным аттракционом ===");

        Park.Attraction newAttraction = park.new Attraction("Водная горка", "11:00 - 19:00", 600);
        newAttraction.printInfo();

        newAttraction.setWorkingHours("10:00 - 20:00");
        newAttraction.setPrice(550);
        System.out.println("После изменения:");
        newAttraction.printInfo();
    }
}
