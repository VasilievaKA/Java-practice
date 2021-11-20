package Main;

import java.util.Stack;

public class Game {
    Stack<Integer> first, second;

    public Game(String f, String s) {
        this.first = new Stack<>();
        this.second = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.first.push(Integer.parseInt(f.substring(i, i+1)));
            this.second.push(Integer.parseInt(s.substring(i, i+1)));
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
        while(!first.isEmpty() && !second.isEmpty() && count <= 106){
            if(first.peek() > second.peek()
                    && second.peek() != 0){
                pushBack(first, first.pop());
                pushBack(first, second.pop());
            }else{
                pushBack(second, first.pop());
                pushBack(second, second.pop());
            }
            count++;
        }
        String res = "";
        if(first.isEmpty()) res += "second ";
        else res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }
}