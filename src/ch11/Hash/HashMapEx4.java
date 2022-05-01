package ch11.Hash;

import java.util.HashMap;

import static ch11.Hash.HashUtil.insertToMap;

public class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        HashMap map = insertToMap(data);
        HashUtil.printBarList(map.entrySet().iterator());

    }


}
