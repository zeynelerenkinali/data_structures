/* 
 * ---
 * Logic: Inside the array, selection sort will scan through all the array and select smallest element inside the array,
 * then, it will swap the selected element with element that started the search with.
 * ---
 * Algorithm:
 * 1. Initialize; array, searchStartIndex, smallestElementIndex.
 * 2. Start 'for loop' with, length of the array.
 *    3.Set searchStartIndex to outer loop's variable, Set smallestElementIndex to array's searchStartIndex. 
 * 4. Start second 'for loop' inside outer 'for loop'.
 *    5. Open if condition check if smallestElementIndex is smaller than array's current for loop index.
 *      6. set smallest element to array's current for loop index.
 * 7. if smallest element is not same one with before the operation, swap elements.
 * 8. return result.
 */
public class selection_sort 
{
    public static void main(String[] args)
    {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        sort(arr);
    }

    public static void sort(int[] unsorted_arr)
    {
        int[] sorted_arr = unsorted_arr;
        int searchStartIndex, smallestElementIndex;
        for(int i = 0; i < sorted_arr.length; i++)
        {
            searchStartIndex = i;
            smallestElementIndex = i;
            for(int k = searchStartIndex; k < sorted_arr.length; k++)
            {
                if(sorted_arr[smallestElementIndex] > sorted_arr[k])
                    smallestElementIndex = k;
            }
            if(smallestElementIndex != searchStartIndex)
            {
                int temp = sorted_arr[searchStartIndex];
                sorted_arr[searchStartIndex] = sorted_arr[smallestElementIndex];
                sorted_arr[smallestElementIndex] = temp;
            }
            for(int p = 0; p < sorted_arr.length; p++)
            {
               System.out.print(sorted_arr[p] + " ");
            }
            System.out.println();
        }
    }
}