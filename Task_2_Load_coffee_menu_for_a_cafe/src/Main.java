// 2.b I have created a class called Main with a main method.

public class Main {
    //2.g
    // I have created a new instance of the Cafe class, and call its loadMenuData().

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        // 2.h I have print all the elements of the attribute coffeeMenu.

        for(String coffee : cafe.coffeeMenu) {
            System.out.println(coffee);
        }
    }
}