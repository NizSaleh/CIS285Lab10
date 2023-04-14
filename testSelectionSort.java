import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class testSelectionSort {

    SelectionSort sort = new SelectionSort();

    @Test
    public void testPositive(){
        int[] arr = new int[]{8,9,7,10,2};
        int[] sortedarr = new int[]{2,7,8,9,10};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,sortedarr));
    }

    @Test
    public void testNegatives(){
        int[] arr = new int[]{-8,-9,-7,-10,-2};
        int[] sortedarr = new int[]{-10,-9,-8,-7,-2};	        
     	  sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,sortedarr));
}

    @Test
    public void testMixed(){
        int[] arr = new int[]{-8,-9,7,-10,2,0};
        int[] sortedarr= new int[]{-10,-9,-8,0,2,7};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,sortedarr));
    }

    @Test
    public void testDuplicates(){
        int[] arr = new int[]{-8,-9,7,2,-8,2,-10,2,0};
        int[] sortedarr = new int[]{-10,-9,-8,-8,0,2,2,2,7};
	  sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,sortedarr)); 
  ;
    }
}
