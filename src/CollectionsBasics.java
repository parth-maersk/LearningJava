import java.util.*;
import java.util.function.Supplier;

public class CollectionsBasics {

    public static void main(String[] args) {
        System.out.println("lets begin with learning Collections");

        /*

            Ref (2nd ques): https://chatgpt.com/share/67a4986f-b80c-800e-8321-8d104a022033

            Interfaces in Collections framework

            1. 'Collection' is an interface which defines some basic methods.
               Most of the classes in Collections framework implement this interface.

                public interface Collection<E> {
                    boolean add(E e);
                    boolean remove(Object o);
                    int size();
                    boolean isEmpty();
                    void clear();
                }

            2. List extends Collection
            3. Set extends Collection
            4. Queue extends Collection
            5. Map (doesn't extend Collection)


            Implementations of the Interfaces

            List implementations
            1. ArrayList – Dynamic resizing of arrays.

            2. LinkedList – Efficient for adding/removing elements from the beginning or middle.

            3. Vector – Similar to ArrayList, considered legacy

            4. Stack – A subclass of Vector that represents a last-in, first-out (LIFO) stack of objects.

            Set implementations
            5. HashSet – O(1) average time complexity for add(), remove(), and contains().

            6. LinkedHashSet – Preserves insertion order.

            7. TreeSet - Sorted order of elements.

            Queue implementations
            8. PriorityQueue - Priority-based ordering.

            Map implementations
            9. HashMap - O(1) average time complexity for get() and put().

            10. LinkedHashMap - Maintains insertion order.

            11. TreeMap - Sorted by key.

            For sorting 'List' interfaces, we can use Collections.sort()

        */


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        System.out.println(numbers);

        // the above code can be written as:
        Supplier<ArrayList<Integer>> supplier = () -> {
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(2);
            nums.add(3);
            nums.add(1);
            return nums;
        };

        ArrayList<Integer> numbersFromSupplier = supplier.get();
        System.out.println(numbersFromSupplier);


        // sorts in-place
        Collections.sort(numbers);
        System.out.println(numbers);

        List<Integer> numbers2 = List.of(1,2,3);
        System.out.println(numbers2);

        Map<Integer, String> mp = new HashMap<>();
        mp.put(29, "parth");

        System.out.println(mp.get(29));

        String value = mp.get(22); // though the type is defined String, but it will store 'null' if the map doesn't have the value for that key.
        System.out.println(value); // this will print 'null' and throw NullPointerException if we try to do some operation on it

        Stack<Integer> stc = new Stack<>();
        stc.push(3);
        stc.push(2);
        stc.pop();
        stc.push(4);

        System.out.println(stc);
        System.out.println(stc.peek());

        // in order to implement Queue we use LinkedList class
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(5);
        q.add(9);

        // just like q.front() in C++
        System.out.println(q.peek());

        // just like q.pop() in C++
        System.out.println(q.remove());

        System.out.println(q.isEmpty());

        System.out.println(q);

    }

}
