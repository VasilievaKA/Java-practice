package Main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Stack");
        System.out.println(new Game("13579", "24680").play());
        System.out.println(new Game("12345", "67890").play());
        System.out.println(new Game("13029", "42685").play());
        System.out.println("Queue");
        System.out.println(new Game1("13579", "24680").play());
        System.out.println("Deque");
        System.out.println(new Game2("12345", "67890").play());
        System.out.println("LinkedList");
        System.out.println(new Game3("13029", "42685").play());
    }
}