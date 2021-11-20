package Main;
import java.io.IOException;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws IOException{
        Author a1 = new Author("Anna", "anna2010@mail.ru", 'F');
        System.out.println(a1);
        Scanner sc= new Scanner(System.in);
        String name1 = sc.nextLine();
        String email1 = sc.nextLine();
        char gender = (char) System.in.read();
        switch (gender)
        {
            case 'F':  gender = ('F');
            break;
            case 'M': gender = ('M');
            break;
            case 'U' : gender = ('U');
            break;
        }
        Author a2 = new Author(name1, email1, gender);
        System.out.println(a2);
    }
}
