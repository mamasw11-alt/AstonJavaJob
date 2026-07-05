public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    
    // Статический счетчик всех животных
    protected static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    // Метод бега
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может бежать отрицательную дистанцию!");
            return;
        }
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + runLimit + " м.)");
        }
    }

    // Метод плавания
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может плыть отрицательную дистанцию!");
            return;
        }
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум " + swimLimit + " м.)");
        }
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Статический метод для получения количества животных
    public static int getAnimalCount() {
        return animalCount;
    }
}
