package FinalReview.MockTest;
import java.util.Arrays;
public class ReversePrintExample {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reversePrint(array,array.length-1);
    }

    public static void reversePrint(int[] array, int lastIndex) {
         if(lastIndex <= 0){
             System.out.print(array[0]);
         }
         else{
             System.out.println(array[lastIndex]);
             reversePrint(array, lastIndex - 1);
         }



        ///   END OF YOUR ANSWER /////

    }
}
