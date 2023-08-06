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
    public V get(K key){
        return get(root, key);
    }
    private V get(Node node, K key) {
        if (node == null) {
            return null;
        } else {
            int comparison = key.compareTo(node.key);
            if (comparison < 0) {
                return get(node.left, key);
            } else if (comparison > 0) {
                return get(node.right, key);
            } else {
                return node.val;
            }
        }
    }
    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node node, K key) {
        if (node == null)
            return null;

        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            node.left = delete(node.left, key);
        else if (cmp > 0)
            node.right = delete(node.right, key);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
            else {
                Node successor = min(node.right);
                successor.right = deleteMin(node.right);
                successor.left = node.left;
                return successor;
            }
        }

        return node;
    }
}