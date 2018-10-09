# Set
The *Set* Collections further has 2 types :
- HashSet
- LinkedHashSet

Another type of Set is *SortedSet*. Under this there is a type of set known as *TreeSet*.

---

### HashSet : 
1. This is an unorderd set. 
2. In this no duplicate is allowed.
3. Null is allowed.
4. Internally it is added as a HashMap.
5. Time complexity of HashSet Operations is `O(1)`.


#### Methods for HashSet

- `boolean add(E e)` : Used to add the specified element if it is not present, if present it returns false.
- `void clear()` : used to remove all the elements from the set.
- `boolean contains(Object o)` : Used to return true if an element is present in the set.
- `boolean remove(Object o)` : Used to remove the element if it is present in the set.
- `boolean isEmpty()` : Used to check whether the set is empty or not.
- `int size()` : Used to return the size of set.
- `Iterator iterator()` : Used to return an iterator over an element in a set.
- `Object clone()` : Used to create a shallow copy of the set.
---
### LinkedHashSet :
1. In this the values must be unique.
2. It maintains order.
3. It works as a doubly linked list.


---
### SortedSet : 
1. Brings everything in order.
2. Forms a *Tree Set*.

#### Methods for SortedSet
- `Object first()`
- `Object last()`
- `SortedSet headSet(Object o)` : returns less than 0 .
- `SortedSet tailSet(Object o)` : returns greater than equal to 0 .
- `SortedSet subSet(Object s,Object e)`