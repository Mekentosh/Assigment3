ADS_Assignment5
Binary Search Tree (BST) Implementation

BST class
- `void put(K key, V val)`: Inserts a key-value pair into the binary search tree. If the key already exists in the tree, the corresponding value is updated with the new value.

- `V get(K key)`: Retrieves the value associated with the given key from the binary search tree. If the key is not found, null is returned.

- `void delete(K key)`: Deletes the node with the specified key from the binary search tree. If the key is not found, no action is taken.

- `Iterable<KeyValue<K, V>> iterator()`: Returns an iterator that performs an in-order traversal of the binary search tree. Each element returned by the iterator is a KeyValue object containing both the key and value of a node in the tree.

- `int size()`: Returns the number of nodes in the binary search tree.

Additionally, the BST class includes private helper methods such as `put`, `get`, `delete`, `min`, `deleteMin`, and `inorderTraversal`. These methods support the main public methods of the class by performing recursive operations on the binary search tree.

Inner class KeyValue
This class represents a key-value pair and is used for returning both the key and value during iteration.
