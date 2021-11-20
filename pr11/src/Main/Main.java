package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            (new Horses("Horse "+i)).start();
        }
    }
}
