/*
 * Algorithm
 * 1. Initialize; found, mid_index(middle of the array), right_index(rightmost of the array), left_index(leftmost of the array).
 * 2. Start While loop; loop until found check is true.
 * 3. Check if current mid_index is equal to key value.
 *   3.1. If yes turn found boolean variable to true.
 * 4. Check, else if key value is greater than the current middle value.(which means key value is at the right of the middle index)
 *   4.1. If yes; Set left_index to mid_index + 1, set mid_index to (right_index + left_index)/2, leave right_index as it is.
 * 5. Check, else if key value is lesser than current middle value.(which means key value is at the left of the middle index)
 *   5.1. If yes; Set right_index to mid_index, set mid_index to (left_index + mid_index)/2, leave left_index as it is.
 * 6. Check, each step whether found turned true, or left_index > right_index 
 *    which is a case when the value is not exist in the array(prevent code to run endlessly when the key value is not exist in the array)
 */

public class binary_search 
{
    public void search(int[] arr, int key)
    {
        //1.
        boolean found = false;
        int right_index = arr.length - 1, left_index = 0, mid_index = (left_index + right_index) / 2;
        //2.
        while(found != true)
        {
            if(arr[mid_index] == key)//3.
                found = true; // 3.1.
            else if(key > arr[mid_index])//4.
            {//4.1.
                left_index = mid_index + 1;
                mid_index = (right_index + left_index)/2;
            }
            else if(key < arr[mid_index])//5.
            {//5.1.
                right_index = mid_index - 1;
                mid_index = (left_index + right_index)/2;
            }
            if(found == true || left_index > right_index)//6.
                break;
        }
        if(found == true)
            System.out.println("Element is successfully found! at index of " + mid_index + ".");
        else
            System.out.println("Element is not exist in the array!");
    }
}