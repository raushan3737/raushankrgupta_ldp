Java HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance.
The class also offers constant time performance for the basic operations like add, remove, contains operation

Features:
    The underlying data structure for HashSet is Hashtable.
    It implements the Set Interface, duplicate values are not allowed.
    Insertion order is not preserved.
    NULL elements are allowed in HashSet.

Use case: HashSet is used for avoiding duplicate data and to find value with the fast method.

Storing or Adding a mechanism: HashSet internally uses the HashMap object to store or add the objects.
HashSet is slower than HashMap.

Implementation Details: HashSet, on the other hand, is designed to store a set of unique elements.
It uses a similar hash table implementation as HashMap, but it only stores the elements as keys with a dummy value.
HashSet provides constant-time performance for basic operations like add() and contains() as long as the hash function is well-designed and the load factor is reasonable.

Method: add(E e) , clear() , contains(Object o) , remove(Object o) , isEmpty() , size()



