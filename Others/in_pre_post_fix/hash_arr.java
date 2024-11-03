public class hash_arr   
{
    private char[] hash;
    private int capacity;
    private int size;
    private int top_index;

    hash_arr(int capacity)
    {
        this.capacity = capacity;
        this.hash = new char[capacity];
        this.size = 0;
        this.top_index = -1;
    }

    int push(char data)
    {
        // Check if array is available
        if(isFull())
        {
            System.err.println("Unable to perform push(char data) operation : Hash is full.");
            return -1;
        }
        hash[++top_index] = data;
        size++;
        return 0;
    }
    int pop()
    {
        if(isEmpty())
        {
            System.err.println("Unable to perform pop() operation : Hash is empty.");
            return -1;
        }
        top_index--;
        size--;
        return 0;
    }
    char peek()
    {
        return hash[top_index];
    }
    int print_elements()
    {
        if(isEmpty())
        {
            System.err.println("Unable to perform pop() operation : Hash is empty.");
            return -1;
        }
        System.out.print("--\n");
        for(int i = top_index; 0 <= i; i--)
        {
            System.out.println(hash[i] + " ");
        }
        System.out.println("--");
        return 0;
    }
    boolean isFull()
    {
        return !(size < capacity);
    }
    boolean isEmpty()
    {
        return size == 0;
    }
}
