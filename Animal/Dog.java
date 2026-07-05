
public class Dog extends Animal {
    private static int dogCount = 0;

    // Константы для ограничений
    private static final int DOG_RUN_LIMIT = 500;
    private static final int DOG_SWIM_LIMIT = 10;

    public Dog(String name) {
        super(name, DOG_RUN_LIMIT, DOG_SWIM_LIMIT);
        dogCount++;
    }

    // Статический метод для получения количества собак
    public static int getDogCount() {
        return dogCount;
    }
}
