import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KeyObject keyObject1 = new KeyObject(0, 10.0, true);
        KeyObject keyObject2 = new KeyObject(20_000_000, 0.00001, true);
        keyObject2.equals(keyObject2);

        CustomHashMap<String, String> customHashMap = new CustomHashMap<>();
        CustomHashMap<Integer, String> customIntegerHashMap = new CustomHashMap<>();
        customHashMap.put("1", "Hello, ");
        customHashMap.put("2", "World!");
        System.out.println(customHashMap.get("1"));
        System.out.println(customHashMap.get("2"));

        HashMap<KeyObject, String> hashMap = new HashMap<>();
        hashMap.put(keyObject1, "Hello, ");
        hashMap.put(keyObject2, "World!");
        System.out.println(hashMap.get(keyObject1));
        System.out.println(hashMap.get(keyObject2));
    }
}
