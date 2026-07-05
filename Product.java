public class Product {
    
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isReserved; 


    public Product(String name, String productionDate, String manufacturer, 
                   String country, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("=== Информация о товаре ===");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Статус бронирования: " + (isReserved ? "Забронирован" : "Свободен"));
        System.out.println("-----------------------------");
    }
 
    public String getName() { return name; }
    public String getProductionDate() { return productionDate; }
    public String getManufacturer() { return manufacturer; }
    public String getCountry() { return country; }
    public double getPrice() { return price; }
    public boolean isReserved() { return isReserved; }
    
    public void setReserved(boolean reserved) { isReserved = reserved; }
}
