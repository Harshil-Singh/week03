package hasmapandhashfunction.customhashmap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Insertion
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);

        // Retrieval
        System.out.println("Apple: " + map.get("Apple"));
        System.out.println("Banana: " + map.get("Banana"));

        // Deletion
        map.remove("Banana");
        System.out.println("After deletion, Banana: " + map.get("Banana"));

        map.put("Orange", 40);
        System.out.println("Orange: " + map.get("Orange"));
    }
}
