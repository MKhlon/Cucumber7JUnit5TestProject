package cucumbercourse;

public class RestaurantMenuItem{
    public RestaurantMenuItem(String itemName, String description, int price) {
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }
    private String itemName;
    private String description;
    private int price;
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }
}