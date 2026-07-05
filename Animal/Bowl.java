public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0); 
    }

    // Метод для добавления еды в миску
    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить отрицательное или нулевое количество еды!");
            return;
        }
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
    }

    // Метод для уменьшения еды 
    public void decreaseFood(int amount) {
        if (amount <= 0) {
            return;
        }
        foodAmount -= amount;
        // еда не станет отрицательной
        if (foodAmount < 0) {
            foodAmount = 0;
        }
    }

    // Геттер для количества еды
    public int getFood() {
        return foodAmount;
    }

    // Метод для вывода информации о миске
    public void printInfo() {
        System.out.println("В миске " + foodAmount + " еды.");
    }
}
