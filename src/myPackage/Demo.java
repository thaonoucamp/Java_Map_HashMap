package myPackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<Integer, String>();

        list.put(1, "a");
        list.put(2, "b");
        list.put(2, "c");
        list.put(null, "d");

        System.out.println(list.get(2));

        System.out.println(list.get(null));

        System.out.println("---");

//
        Set<Integer> keySet = list.keySet();

        for (Integer i:
             keySet) {
            System.out.println(i + " " + list.get(i));
        }

        System.out.println("---");

// xoa item;
        list.remove(1);

        Set<Integer> keySet1 = list.keySet();
        for (Integer x:
             keySet1) {
            System.out.println(x + " " + list.get(x));
        }

        System.out.println("---");

        list.clear();
        System.out.println(list);

        // Cach 2;
        for (Map.Entry<Integer, String> s : list.entrySet()) {
            s.getKey();
            s.getValue();
        }

        System.out.println("---");
        // Cach 3;
        Map<String, Per> person = new HashMap<String, Per>();

        person.put("a", new Per(1));
        person.get("a");

        System.out.println(person);
    }
}
// (key) gia tri duy nhat. nhan khai bao sau cung;

// key co the la (null);

// Map chi lam viec voi (key);

// Ham (clear) xoa toan bo item;