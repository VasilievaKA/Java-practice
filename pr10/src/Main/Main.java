package Main;

public class Main {

    public static void main(String[] args) {
        PingPong ping = new PingPong("Ping");
        PingPong pong = new PingPong( "Pong");
            ping.start();
            pong.start();
        }
    }