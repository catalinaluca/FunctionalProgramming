import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class MyFirstClass implements MyFirstInterface{
    private String name;

    public MyFirstClass(int n) {
        System.out.println("Something");
    }

    @Override
    public int functionalInterface(int number) {
        MyFirstInterface myFirstInterface = new MyFirstInterface() {
            @Override
            public int functionalInterface(int number) {
                int var = 10;
                return number * var;
            }
        };

        myLambda((n) -> {
            return n * 10;
        });

        int param = 10;
        final int param2 = param;
        MyFirstInterface value = n -> n * 10;
        MyFirstInterface value2 = n -> {
            int var = param2;
            return n * var;
        };

        System.out.println(value2.functionalInterface(15));

        Supplier<String> supplier = () -> {
            if (name.isEmpty()) {
                return "Empty name";
            }
            return "Not empty";
        };

        return 10;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> true;
        Predicate<Integer> predicate1 = n -> {
           int bigNumber = n * 10;
           return bigNumber % 7 == 0;
        };
        Predicate<Integer> myComposedPredicate = predicate1.or((n) -> n * 5 == 25);
        System.out.println(predicate1.test(7));

        Consumer<String> myConsumer;

        List<Integer> myList = List.of(10, 5, 7);
        myList.forEach(System.out::println);

        Function<String, Integer> myFunction = Integer::parseInt;
        Comparator<Integer> comparator = (a, b) -> a - b;

        List<Integer> numbers = Arrays.asList(10, 15, 15, 10, 7, 6, 3);
    }

    public void myLambda(MyFirstInterface interf) {
        interf.functionalInterface(10);
    }
}

class MyPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        int bigNumber = integer * 10;
        return bigNumber % 7 == 0;
    }
}
