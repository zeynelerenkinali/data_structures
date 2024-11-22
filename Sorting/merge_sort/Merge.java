public class Merge 
{
    /*
     * Algorithm
     * 1. Recursively divide array, to left and right part until the element of array reaches 1.
     * 2. When reaches, return and sort all the element recursively.
     */
    public void merge(int[] arr)
    {
        if(arr.length <= 1)
            return;

        int length = arr.length;
        int mid = length/2;

        int[] l_arr = new int[mid], r_arr = new int[mid];

        // Seperate elements of the array to right and left array.
        for(int i = 0, j = mid; i < mid; i++, j++)
        {
            r_arr[i] = arr[i];
            l_arr[i] = arr[j];
        }

        merge(l_arr);
        merge(r_arr);

        sort(arr, l_arr, r_arr);
    }
    public void sort(int[] arr, int[] l_arr, int[] r_arr)
    {
        int i = 0, j = 0, k = 0; 

        // Merge the two arrays while there are elements in both
        while(i < l_arr.length && j < r_arr.length)
        {
            if(l_arr[i] <= r_arr[j])
                arr[k++] = r_arr[j++];
            else
                arr[k++] = r_arr[i++];
            printArray(arr);
        }

        // If there are remaining elements in the left array, add them
        while(i < l_arr.length)
        {
            arr[k++] = l_arr[i++];
        }
        // If there are remaining elements in the right array, add them
        while(j < r_arr.length)
        {
            arr[k++] = r_arr[j++];
        }
    }
    // Method to print the array
    public static void printArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}