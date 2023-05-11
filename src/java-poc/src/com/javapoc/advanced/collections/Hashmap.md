/*
HashMap is found in java.util package to stores the data in (Key, Value) pairs.
Java HashMap is similar to HashTable, but it is unsynchronized.
It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.
A HashMap is a data structure that is used to store in unordered sequence and retrieve values based on keys.

It provides the basic implementation of the Map interface of Java

Complexity: HashMap has complexity of O(1) for insertion and lookup

Property:
Stores key-value pairs:
Fast access time
Uses hashing function
Supports null keys and values:
Not ordered
Allows duplicates
Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold,
and a load factor, which is the measure of how full the hashmap can be before it is resized.

Constructor in HashMap:
HashMap()
HashMap(int initialCapacity)
HashMap(int initialCapacity, float loadFactor)
HashMap(Map map)

Method:
map.put(key,value) ; //Inserting the pair if the key is existed then value will be updated else new pair is inserted.

Implementation Details: HashMap is designed to store key-value pairs, where each key is associated with a value.
The HashMap implementation uses an basics.array of buckets to store the key-value pairs, and uses the hash code
of the keys to compute an index into the basics.array where each pair is stored. HashMap provides constant-time performance for basic operations like get() and put()
as long as the hash function is well-designed and the load factor is reasonable.

*/