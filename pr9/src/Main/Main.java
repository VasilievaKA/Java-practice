package Main;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uran = new String("Уран");
        String neptun = new String("Нептун");

        System.out.println("Не модифицируемый список");
        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uran, neptun)));
        System.out.println(solarSystem);

        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus, earth));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList(mars, jupiter, earth));
        System.out.println("Модифицируемые списки");
        System.out.println("Список 1: "+ solarSystem1 + "\nСписок 2: " + solarSystem2);
        if(Collections.disjoint(solarSystem1, solarSystem2)) {System.out.println("Списки не содержат повторений");}
            else {System.out.println("Списки содержат повторения");}

        //добавление элемента
        solarSystem1.add(neptun);
        System.out.println("Первый список после добавления элемента: "+solarSystem1);

        //удаление элемента
        solarSystem1.remove(earth);
        System.out.println("Первый список после удаления элемента: "+solarSystem1);

        //поиск индекса элемента
        int index = solarSystem2.indexOf(earth);
        if (index!=0) {System.out.println("Элемент " + earth + " найден в Списке 2 на позиции "+ index);}
        else {System.out.println("Элемент " + earth + " не найден в Списке 2 ");}

        //проверка наличия элемента
        if (solarSystem1.contains(uran)) {System.out.println("Элемент " + uran + " найден в Списке 1 ");}
        else {System.out.println("Элемент " + uran + " не найден в Списке 1 ");}

        //изменение одного элемента на другой
        System.out.println("Второй список до изменения элемента: "+solarSystem2);
        solarSystem2.set(1, venus);
        System.out.println("Второй список после изменения элемента: "+solarSystem2);

        //премешивание
        System.out.println("Первый список до перемешивания: "+solarSystem1);
        Collections.shuffle(solarSystem1);
        System.out.println("Первый список после перемешивания: "+solarSystem1);

        //выбора случайной планеты
        Random rand = new Random();
        String elem = solarSystem.get(rand.nextInt(solarSystem.toArray().length));
        System.out.println("Случайный элемент из не модифицируемого списка: "+elem);

        //изменение порядка следования элементов
        System.out.println("Первый список до изменения порядка: " + solarSystem1 );
        Collections.reverse(solarSystem1);
        System.out.println("Первый список после изменения порядка: " + solarSystem1 );
    }
}
