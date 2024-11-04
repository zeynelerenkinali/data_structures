public class insertion_sort 
{
    /* Algorithm
     * 1. Initialize; sorted_array, key
     * 2. Check the size of the array; appropriate or not
     * 3. Else; create a for loop.
     * 4. In order to sort; take the second element of the array as key
     * 5. Check the key with previous index
     * 6. If key is smaller than previous index value; switch the place of them in the array
     * 7. Else if key is greater than previous index value; don't switch 
     * 8. Do this until reach first index(0)
     * 9. When finish return the sorted array.
     */
    public static void main(String[] args) 
    {
        insertion_sort ins_sort = new insertion_sort();

        int arr[] = {9, 8, 7, 6};
        ins_sort.insert_sort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }   
        System.out.println();
    }
    public int[] insert_sort(int[] not_sorted_array)
    {
        int null_arr[] = new int[0];
        // 1.
        int array_length = not_sorted_array.length, key, arr_index;
        int sorted_array[] = not_sorted_array;
        // 2.
        if(array_length < 2)
        {
            System.err.println("Not able to sort array : Size is not appropriate.");
            return null_arr;
        }
        for(int i = 1; i < array_length; i++) 
        {
            arr_index = i;
            key = not_sorted_array[i];
            while(arr_index != 0)
            {
                if(key < sorted_array[--arr_index]) // 3. 4. 5. 6.
                {
                    int temp = sorted_array[arr_index];
                    sorted_array[arr_index] = key;
                    sorted_array[arr_index+1] = temp;
                }
            }
        }
        return sorted_array;
    }
}