package Main;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        System.out.println(new Game("13579", "24680").play());
        System.out.println(new Game("12345", "67890").play());
        System.out.println(new Game("35789", "24163").play());
    }
}
