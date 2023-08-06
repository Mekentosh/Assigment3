import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.Math.round;

public class BST<K extends Comparable<K>, V> {
    private Node root;
    private class Node{
        private K key;
        private V val;
        private Node left, right;
        public Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }
    public void put(K key, V val){
        root = put(root, key, val);
    }
    //Recursive helper method for void put method
    private Node put(Node current, K key, V val) {
        if (current == null)
            return new Node(key, val);

        int cmp = key.compareTo(current.key);
        if (cmp < 0)
            current.left = put(current.left, key, val);
        else if (cmp > 0)
            current.right = put(current.right, key, val);
        else
            current.val = val;

        return current;
    }
}