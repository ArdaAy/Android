public class Hashmaps {

    public static void main(String[] args) {
	// Hashmaps (key --> value)

        HashMap<Integer, String> newUsers = new HashMap<>();
        newUsers.put(23, "Arda");

        HashMap users = new HashMap();
        users.put("Arda", 23);
        users.put("Hakan" , 31);
        users.put("Aras" , 74);
        users.remove("Arda");

       // System.out.println(users.get("Paul"));

        Iterator iterator = users.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }

       // System.out.println(users.entrySet());
    }
}