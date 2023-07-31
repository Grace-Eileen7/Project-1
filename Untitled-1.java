
class Food {
    void flavor() { System.out.println("bland"); }
}
class Pepper extends Food {
    void flavor() { System.out.println("spicy"); }
}
public class Lunch {
    public static void main(String[] args) {
        Pepper lunch = new Food();
        lunch.flavor();
    }
}