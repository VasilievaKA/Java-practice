package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();
        hashMap.put("Кот", new Cat("Мурзик"));
        hashMap.put("Собака", new Dog("Бобик"));
        hashMap.put("Сова", new Owl("Марта"));

        Set<Map.Entry<String, Pet>> set = hashMap.entrySet();

        for (Map.Entry<String, Pet> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
