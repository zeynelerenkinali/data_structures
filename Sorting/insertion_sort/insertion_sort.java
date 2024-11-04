public class insertion_sort 
{
    /* Algorithm
     * 1. Initialize; sorted_array, key
     * 2. Check the size of the array; appropriate or not
     * 3. Else; create a for loop.
     * 4. In order to sort; take the second element of the array as key
     * 5. 
     */
    public static void main(String[] args) 
    {
        
    }
    public int insert_sort(int[] not_sorted_array)
    {
        // 1.
        int array_length = not_sorted_array.length, key;
        int sorted_array[] = new int[array_length];
        // 2.
        if(array_length < 2)
        {
            System.err.println("Not able to sort array : Size is not appropriate.");
            return -1;
        }
        for(int i = 1; i < array_length; i++) 
        {
            key = not_sorted_array[i];
            
        }
        return 0;
    }
}