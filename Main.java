package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        Random random = new Random(50);
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 100; i++){
            // Создадим число от 0 до 40
            int number = random.nextInt(40);
            Integer repeats = hashMap.get(number); //колво повторов сгенерированного числа number
            hashMap.put(number, repeats == null ? 1 : repeats + 1);
        }
        System.out.println(hashMap);
    }
}
