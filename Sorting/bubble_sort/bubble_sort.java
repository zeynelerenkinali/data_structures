/*
 * Logic: Sorting the array in Ascending order. Inverse logic with insertion sort Algorithm.
 * 
 * Algorithm:
 * 1. Declarate; sorted_arr, swap_check_counter(to finish scan early)
 * 2. Start outer for loop, and inner for loop
 * 3. Initialize swap_check_counter to zero
 * 4. Check if current index holder is greater than following index order or not
 * 5. If yes swap
 * 6. No don't swap increase the variable one
 * 7. Return result
 */

public class bubble_sort 
{
    public static void main(String[] args) 
    {
        bubble_sort b_s = new bubble_sort();

        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        b_s.sort(arr);
    }

    public int[] sort(int[] unsorted_arr)
    {
        int[] sorted_arr = unsorted_arr;
        int swap_check_counter;

        for(int i = 0, j = sorted_arr.length; i < j; j--)
        {
            swap_check_counter = 0;
            for(int k = 0; k < (j-1); k++)
            {
                if(sorted_arr[k] > sorted_arr[k + 1])
                {
                    //5
                    int temp = sorted_arr[k+1];
                    sorted_arr[k+1] = sorted_arr[k];
                    sorted_arr[k] = temp;
                    swap_check_counter++;
                }
            }
            if(swap_check_counter == 0)
                break;
            for(int p = 0; p < sorted_arr.length;p++)
            {
                System.out.print(sorted_arr[p] + " ");
            }
            System.out.println();
        }
        return sorted_arr;
    }
}