/*
 * Algorithm
 * 1. 34
 */

public class binary_search 
{
    public void search(int[] s_arr, int key_element)
    {
        boolean find = false;
        int counter = 0, mid = s_arr.length / 2, right_index = s_arr.length, left_index = 0;
        // Take the middle of the s_arr
        int i = mid;
        while(find != true)
        {
            if(s_arr[i] == key_element)
                find = true;
            else if(key_element > s_arr[i])
            {
                mid = (right_index + mid)/2;
                left_index = mid;
                i = mid;
            }
            else if(key_element < s_arr[i])
            {
                mid = (left_index + mid)/2;
                right_index = mid;
                i = mid;
            }
            if(find == true || counter > s_arr.length)
                break;
            counter++;
        }
        if(find == true)
            System.out.println("Element is successfully found! at index of " + i + ".");
        else
            System.out.println("Element is not exist in the array!");
    }
}