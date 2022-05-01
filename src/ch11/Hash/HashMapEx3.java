package ch11.Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("Friend", "Kim Pikachu", "010-111-1111");
        addPhoneNo("Friend", "Lee Pikachu", "010-111-1112");
        addPhoneNo("Friend", "Park Pikachu", "010-111-1113");

        addPhoneNo("Company", "Kim Engineer", "010-111-2222");
        addPhoneNo("Company", "Kim Engineer", "010-111-2223");
        addPhoneNo("Company", "Park Engineer", "010-111-2224");
        addPhoneNo("Company", "Choi Engineer", "010-111-2225");
        addPhoneNo("Company", "Lee Engineer", "010-111-2226");

        addPhoneNo("K-Mart", "02-123-4567");
        printList();
    }

    static void addPhoneNo(String groupName, String name, String phone) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(phone, name);
    }

    static void addGroup(String name) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashMap());
        }
    }

    static void addPhoneNo(String name, String phone) {
        addPhoneNo("None", name, phone);
    }

    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();

            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String phone = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + phone);
            }
            System.out.println();
        }
    }

}
