package labi_java.laba4;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "привет");
        dictionary.put("world", "мир");
        dictionary.put("computer", "компьютер");
        dictionary.put("programming", "программирование");
        
        System.out.println("Англо-русский словарь:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}