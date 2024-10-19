package hash_with_arrayLists;
import java.util.ArrayList;

public class hashStructure 
{
    ArrayList<Integer> hash_arr_list = new ArrayList<>();
    int size;
    // Initialize the size of array_list with hash_set constructor
    hashStructure(int size)
    {
        this.size = size;
    }
    protected void pop()
    {
        if(hash_arr_list.isEmpty())
            System.err.println("Error on pop: Can not push from an empty hash!");
        else // Hash is not empty so we can pop an integer from last.
        {
            int temp = hash_arr_list.get(hash_arr_list.size() - 1);
            hash_arr_list.remove(hash_arr_list.size() - 1);
            System.out.println("INFO: Succesfully removed from hash '"+temp+"'");    
        }
    }
    protected void push(int num)
    {
        // Check the bounds of Array List is as expected
        if(hash_arr_list.size() <= this.size)
        {
            hash_arr_list.add(num);
            System.out.println("INFO: Succesfully added to hash '"+num+"'");
        }
        else // limits exceeded
        {
            System.err.println("Error on push: Can not push more than size!");
        }
    }
    protected void is_null()
    {
        if(hash_arr_list.isEmpty())
            System.out.println("INFO: Hash is null.");
        else
            System.out.println("INFO: Hash is not null.");
    }
    protected int get_size()
    {
        return hash_arr_list.size();
    }
    protected void set_size(int size)
    {
        this.size = size;
    }
    protected void print_elements()
    {
        for(int i = 0; i < hash_arr_list.size(); i++)
        {
            System.out.print(hash_arr_list.get(i) + " ");
        }
        System.out.println();
    }
}
