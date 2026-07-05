public class Cat extends Animal {
    private boolean isFull; // сытость
    private static int catCount = 0;

    // Константы для ограничений
    private static final int CAT_RUN_LIMIT = 200;
    private static final int CAT_SWIM_LIMIT = 0; // коты не умеют плавать

    public Cat(String name) {
        super(name, CAT_RUN_LIMIT, CAT_SWIM_LIMIT);
        this.isFull = false; // при создании кот голоден
        catCount++;
    }

    // Переопределяем метод плавания, что коты не умеют плавать
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    // Метод для поедания из миски
    public void eat(Bowl bowl, int amount) {
        if (isFull) {
            System.out.println(name + " уже сыт(а) и не хочет есть.");
            return;
        }

        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " поел(а) " + amount + " еды и теперь сыт(а).");
        } else {
            System.out.println(name + " не стал(а) есть, так как в миске недостаточно еды (нужно " + amount + ", а в миске " + bowl.getFood() + ").");
        }
    }

    // Метод для проверки сытости
    public boolean isFull() {
        return isFull;
    }

    // Статический метод для получения количества котов
    public static int getCatCount() {
        return catCount;
    }
}
