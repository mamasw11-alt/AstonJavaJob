public class Main {
    public static void main(String[] args) {
        System.out.println("========== Животные ==========\n");

        // Создаем животных
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Dog dog3 = new Dog("Рекс");

        // Тестируем методы бега и плавания
        System.out.println("--- Тестирование движений ---");
        cat1.run(150);
        cat1.run(250);
        cat1.swim(5);
        
        dog1.run(400);
        dog1.run(600);
        dog1.swim(8);
        dog1.swim(15);

        System.out.println("\n--- Статистика ---");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        System.out.println("\n========== Кормление котов ==========\n");

        // Создаем массив котов
        Cat[] cats = {
            new Cat("Мурзик"),
            new Cat("Барсик"),
            new Cat("Васька"),
            new Cat("Рыжик"),
            new Cat("Снежок")
        };

        // Создаем миску с едой
        Bowl bowl = new Bowl(25);
        System.out.println("Изначальное состояние миски:");
        bowl.printInfo();

        System.out.println("\n--- Коты пытаются поесть ---");
        // Каждый кот ест разное количество
        cats[0].eat(bowl, 10); // Мурзик ест 10
        cats[1].eat(bowl, 8);  // Барсик ест 8
        cats[2].eat(bowl, 12); // Васька хочет 12, но в миске осталось 7
        cats[3].eat(bowl, 5);  // Рыжик ест 5
        cats[4].eat(bowl, 3);  // Снежок ест 3

        System.out.println("\n--- Состояние миски после кормления ---");
        bowl.printInfo();

        System.out.println("\n--- Информация о сытости котов ---");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.isFull() ? "Сыт(а)" : "Голоден(на)"));
        }

        System.out.println("\n--- Добавляем еду в миску ---");
        bowl.addFood(20);
        bowl.printInfo();

        System.out.println("\n--- Голодные коты пробуют снова ---");
        // Пусть голодные коты попробуют поесть еще раз
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        System.out.println("\n--- Итоговое состояние ---");
        bowl.printInfo();
        System.out.println("\n--- Итоговая сытость котов ---");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.isFull() ? "Сыт(а)" : "Голоден(на)"));
        }

        System.out.println("\n========== ФИНАЛЬНАЯ СТАТИСТИКА ==========");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
    }
}
