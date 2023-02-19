import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        var list = List.of(99, 888, 77, 666, 55, 111, 2222, 33, 4);
        Comparator<Integer> comparator = Comparator
                .comparingInt(x -> String.valueOf(x).length());

        var minValue = min(list, comparator);
        var actualMin = list.stream().min(comparator).get();

        assertTrue(minValue.equals(actualMin), "Incorrect output");
        System.out.printf("Min value is %d%n", minValue);
    }

    private static void assertTrue(boolean condition, String errorMessage) {
        if (!condition) throw new AssertionError(errorMessage);
    }

    private static <T> T min(List<T> list, Comparator<T> comparator) {
        assertTrue(!list.isEmpty(), "%s is empty".formatted(list));

        // TODO: Implement min() function
        // Constraints:
        // 1. Only functional style, i.e. not FOR/WHILE/DO-WHILE loops, no IF conditions
        //    and all declarations must be immutable
        // 2. Don't use any built-in min() functions

        return null;
    }
}


