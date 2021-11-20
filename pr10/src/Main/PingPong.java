package Main;

public class PingPong extends Thread {
    private String name;

    public PingPong(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println(name);
        }
    }
}
