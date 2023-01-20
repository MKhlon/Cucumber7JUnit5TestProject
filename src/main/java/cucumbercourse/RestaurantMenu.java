package cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {

    ArrayList<RestaurantMenuItem> menuItems = new ArrayList<>();

    public boolean addMenuItem(RestaurantMenuItem newMenuItem) {
        return menuItems.add(newMenuItem);
    }

    public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
        boolean exists = false;
        if (menuItems.contains(newMenuItem)) {
            exists = true;
        }
        return exists;
    }
}