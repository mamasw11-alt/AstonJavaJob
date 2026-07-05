import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }
  
    public void addAttraction(String name, String workingHours, double price) {
        attractions.add(new Attraction(name, workingHours, price));
    }

    public void printAttractions() {
        System.out.println("=== Парк: " + parkName + " ===");
        if (attractions.isEmpty()) {
            System.out.println("Аттракционов пока нет");
            return;
        }
        for (Attraction attr : attractions) {
            attr.printInfo();
        }
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("  Аттракцион: " + name);
            System.out.println("  Время работы: " + workingHours);
            System.out.println("  Стоимость: " + price + " руб.");
            System.out.println("  -------------------------");
        }

        public String getName() { return name; }
        public String getWorkingHours() { return workingHours; }
        public double getPrice() { return price; }
        
        public void setWorkingHours(String workingHours) { this.workingHours = workingHours; }
        public void setPrice(double price) { this.price = price; }
    }
}
