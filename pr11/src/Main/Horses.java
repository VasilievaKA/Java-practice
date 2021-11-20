package Main;


public class Horses extends Thread {
    private String name;
    private static Integer c = 1;

    public Horses (String name){
        this.name = name;
    }
    @Override
    public void run() {
        synchronized (c) {
            System.out.println(name + " at " + c);
            c++;
            }
        }
    }
