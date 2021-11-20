package Main;
import java.util.ArrayDeque;
import java.util.Queue;

public class Game1 {
    Queue<Integer> first, second;

    public Game1(String f, String s) {
        this.first = new ArrayDeque<>();
        this.second = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            this.first.add(Integer.parseInt(f.substring(i, i + 1)));
            this.second.add(Integer.parseInt(s.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!first.isEmpty() && !second.isEmpty() && count < 106) {
            if (first.peek() > second.peek()
                    && second.peek() != 0) {
                first.add(first.remove());
                first.add(second.remove());

            } else {
                second.add(first.remove());
                second.add(second.remove());
            }
            count++;
        }
        String res = "";
        if (first.isEmpty()) res += "second ";
        else if (second.isEmpty()) res += "first ";
        res += count;
        if (count >= 106) res += " botva";
        return res;
    }
}