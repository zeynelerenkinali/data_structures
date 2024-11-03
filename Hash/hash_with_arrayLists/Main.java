package hash_with_arrayLists;
public class Main 
{
    public static void main(String[] args) 
    {
        int size = 5;
        hashStructure hash = new hashStructure(size);
        for(int i = 0; i < size; i++)
        {
            hash.push(i);
        }
        // Print elements at hash
        hash.print_elements();
        // Pop elements from Hash
        hash.pop();
        hash.pop();
       // Print elements at hash
        hash.print_elements();
    }    
}