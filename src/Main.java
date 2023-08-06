public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        // Test put method
        bst.put(15, "Apple");
        bst.put(10, "Banana");
        bst.put(20, "Orange");
        bst.put(7, "Pizza");
        bst.put(13, "Burger");
        bst.put(17, "Fries");
        bst.put(25, "Cola");
        bst.put(4, "Kyoto");
        bst.put(9, "Akihabara");
        bst.put(12, "Saitama");
        bst.put(14, "Tokyo");
        bst.put(16, "Japan");
        bst.put(19, "China");
        bst.put(21, "USA");
        bst.put(26, "Kazakhstan");

        // Test get method
        System.out.println("Get 12: " + bst.get(12));
        System.out.println("Get 7: " + bst.get(7));
        System.out.println("Get 25: " + bst.get(25));
        System.out.println("Get 5: " + bst.get(5));

        // Test delete method
        bst.delete(10);
        bst.delete(21);

        // Test iterator method
        Iterable<BST.KeyValue<Integer, String>> iterator = bst.iterator();
        for (BST.KeyValue<Integer, String> elem : iterator) {
            System.out.println(elem.getKey() + " - " + elem.getValue());
        }

        // Test size method
        System.out.println("Size: " + bst.size());

        // Test height method
        System.out.println("Height: " + bst.height());
    }
}
