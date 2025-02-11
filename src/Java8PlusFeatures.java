import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8PlusFeatures {

    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        // lambda functions
        Comparator<Integer> updatedComp = (o1, o2) -> o1 - o2;


        // Functional interface is an interface with single abstract method
        @FunctionalInterface
        interface Add {
            int add(int num1, int num2);

        }

        Add obj = (num1, num2) -> (num1 + num2)*(num1 - num2);


        // Streams API
        List<Integer> name = List.of(22, 29);

        Stream<Integer> filteredNames = name.stream().filter(str -> str.equals(22));
        Stream<Integer> mappedNames = filteredNames.map(str -> str+10);

        List<List<Integer>> nestedNames = List.of(List.of(1), List.of(2));
        Stream<Integer> flattenedNames = nestedNames.stream().flatMap(str -> str.stream().reduce((num1, num2) -> num1 + num2).stream());
        List<Integer> nums = flattenedNames.toList();

        //System.out.println(filteredNames.toList());     // this throws error as filteredNames stream is already been consumed and closed.
        System.out.println(mappedNames.toList());
        System.out.println(nums);

        interface InterfaceWithDefaultMethod {
            // interface can have methods with default implementation
            default int apply(int num) {
                return num * 10;
            }

            // static method
            static int apply(String num) {
                return Integer.parseInt(num);
            }

        }

        int stringToInt = InterfaceWithDefaultMethod.apply("29");
        System.out.println(stringToInt);


        // Optional variables which stores data in case of null values

    }

}
