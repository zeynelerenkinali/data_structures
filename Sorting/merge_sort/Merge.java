public class Merge 
{
    /*
     * Merge Algorithm
     * 1. Check at each recursive loop if the length of the array is reached 1 or lesser than that.
     * 2. Set mid, to middle index of the array.
     * 3. Initialize Left and Right array.
     * 4. Seperate the main array to two array as left and right from middle.
     * 5. Call the function again for left and right array seperately, it will recursively turn until length of the array decreases 1.
     * 6. When two, for left and right merge funciton call ends recursively. Call sort funciton for smallest arrays, to recover(concatenate) and sort to get fully sorted array.
     * Sort Algorithm
     * 1. Initialize i,j,k as zero for holding left,right and main array's index values.
     * 2. Sort and merge left and right arrays on main array by checking their values by index values.
     * 3. Which the length of the array is not static, the array might not seperated perfectly in to two always so we have to check after merging
     *    until one of the index is reached it's final part, whether there are any value remains the greater indexed array.
     * 4. So, If there are remaining elements in the left array, add them to main array.
     * 5. If there are remaining elements in the right array, add them to main array.
     */
    public void merge(int[] arr)
    {
        //1.
        if(arr.length <= 1)
            return;
        //2.
        int mid = arr.length/2;
        //3.
        int[] l_arr = new int[mid];
        int[] r_arr = new int[arr.length - mid];

        // 4.
        System.arraycopy(arr, 0, l_arr, 0, mid);
        System.arraycopy(arr, mid, r_arr, 0, arr.length - mid);
        // 5.
        merge(l_arr);
        merge(r_arr);
        // 6.
        merge(arr, l_arr, r_arr);
    }
    public void merge(int[] arr, int[] l_arr, int[] r_arr)
    {
        //1.
        int i = 0, j = 0, k = 0; 

        // 2.
        while(i < l_arr.length && j < r_arr.length)
        {
            if(l_arr[i] <= r_arr[j])
                arr[k++] = l_arr[i++];
            else
                arr[k++] = r_arr[j++];
            printArray(arr);
        }
        // 3.
        // 4.
        while(i < l_arr.length)
        {
            arr[k++] = l_arr[i++];
        }
        // 5.
        while(j < r_arr.length)
        {
            arr[k++] = r_arr[j++];
        }
    }
    // Method to print the array
    public void printArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}