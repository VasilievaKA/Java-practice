package Main;
import java.util.Stack;

public class Game {
    Stack<Integer> firstPlayer, secondPlayer;

    public Game(String fp, String sp) {
        this.firstPlayer = new Stack<>();
        this.secondPlayer = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.firstPlayer.push(Integer.parseInt(fp.substring(i, i+1)));
            this.secondPlayer.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106){
            if(firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0){
                pushBack(firstPlayer, firstPlayer.pop());
                pushBack(firstPlayer, secondPlayer.pop());
            }else{
                pushBack(secondPlayer, firstPlayer.pop());
                pushBack(secondPlayer, secondPlayer.pop());
            }
            count++;
        }
        String res = "";
        if(firstPlayer.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }
}