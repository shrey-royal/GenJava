import java.util.*;

class Menu {
    String name;
    double price;

    Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }
}


public class ALTask {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<Menu>();

        menu.add(new Menu("Pasta", 200));
        menu.add(new Menu("Pizza", 300));
        menu.add(new Menu("Burger", 100));
        menu.add(new Menu("Sandwich", 50));

        // for (Menu i : menu) {
        //     System.out.println(i.name + " " + i.price);
        // }

        Iterator<Menu> i = menu.iterator();
        while(i.hasNext()) {
            Menu m = i.next();  //i++
            System.out.println(m.name + " " + m.price);
        }
        
    }
}
