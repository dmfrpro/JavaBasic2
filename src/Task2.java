import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        var array = fillCycled(10, 5);

        var testArray = new RowType[][]{
                {RowType.FIRST, RowType.FIRST, RowType.FIRST, RowType.FIRST, RowType.FIRST},
                {RowType.SECOND, RowType.SECOND, RowType.SECOND, RowType.SECOND, RowType.SECOND},
                {RowType.THIRD, RowType.THIRD, RowType.THIRD, RowType.THIRD, RowType.THIRD},
                {RowType.FOURTH, RowType.FOURTH, RowType.FOURTH, RowType.FOURTH, RowType.FOURTH},
                {RowType.FIFTH, RowType.FIFTH, RowType.FIFTH, RowType.FIFTH, RowType.FIFTH},
                {RowType.FIRST, RowType.FIRST, RowType.FIRST, RowType.FIRST, RowType.FIRST},
                {RowType.SECOND, RowType.SECOND, RowType.SECOND, RowType.SECOND, RowType.SECOND},
                {RowType.THIRD, RowType.THIRD, RowType.THIRD, RowType.THIRD, RowType.THIRD},
                {RowType.FOURTH, RowType.FOURTH, RowType.FOURTH, RowType.FOURTH, RowType.FOURTH},
                {RowType.FIFTH, RowType.FIFTH, RowType.FIFTH, RowType.FIFTH, RowType.FIFTH}
        };

        assertTrue(Arrays.deepEquals(testArray, array), "Incorrect output");
        System.out.println(Arrays.deepToString(array));
    }

    private static void assertTrue(boolean condition, String errorMessage) {
        if (!condition) throw new AssertionError(errorMessage);
    }

    private static RowType[][] fillCycled(int n, int m) {
        // TODO: Implement fillCycled() function
        // Constraints:
        // 1. Only functional style, i.e. not FOR/WHILE/DO-WHILE loops, no IF conditions
        //    and all declarations must be immutable
        // 2. Don't use any built-in fill() functions
        // 3. You must generate array on-the-fly, i.e. you mustn't create an empty array
        //    and fill the values in-place

        return null;
    }

    enum RowType {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH
    }
}
