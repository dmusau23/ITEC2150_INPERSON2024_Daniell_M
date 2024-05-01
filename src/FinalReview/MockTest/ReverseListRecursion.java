package FinalReview.MockTest;

import java.util.List;

public class ReverseListRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Start reading in reverse order using recursion
        readListInReverse(numbers, numbers.size() - 1);
    }

    private static void readListInReverse(List<Integer> list, int index) {
        // Start your code from here
        if(index < 0){
            return;
        }
        System.out.println(list.get(index));
        readListInReverse(list,index-1);
        // End of your code
    }
}
