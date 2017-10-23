import com.qw.sort.selection.comparable.SelectionSortUseComparable;
import com.qw.sort.util.SortTestHelper;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int N = 20000;
        Integer arr1[] = SortTestHelper.generateRandomArray(N,0,N);
        Integer arr2[] = Arrays.copyOf(arr1,arr1.length);
        Integer arr3[] = Arrays.copyOf(arr1,arr1.length);
        SortTestHelper.testSort("com.qw.sort.selection.comparable.SelectionSortUseComparable",arr1);
        SortTestHelper.testSort("com.qw.sort.insertion.InsertionSort",arr2);
        SortTestHelper.testSort("com.qw.sort.bubble.BubbleSort",arr3);


    }




}
