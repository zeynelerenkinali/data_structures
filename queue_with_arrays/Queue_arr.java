public class Queue_arr 
{
    private int queue_arr[];
    private int front, rear;
    private int capacity;
    private int size;

    Queue_arr(int capacity)
    {
        this.capacity = capacity;
        // The reason front starting from 0 but rear -1 is, at front operation we are removing from queue, so we need at least an integer.
        // But for the rear, we are adding to the queue. So if we would start from 0 it means there is an element on that but there is not actually so in order to become 0 it needs an integer
        // Because it is basically an index holder.
        front = 0; rear = -1;
        queue_arr = new int[capacity];
    }

    public int Enqueue(int data)
    {
        // Enqueue operation will be adding from rear to the queue
        // Check size, if its full we cannot add to the queue.
        if(IsFull())
        {
            System.err.println("Cannot perform the Enque operation : Queue is full.");
            return -1;
        }
        rear = ++rear % capacity;
        queue_arr[rear] = data;
        size++;
        return 0;
    }
    
    public int Dequeue()
    {
        if(IsEmpty())
        {
            System.err.println("Cannot perform the Dequeue operation : Queue is empty.");
            return -1;
        }
        int deuquedValue = queue_arr[front];
        front = ++front % capacity;
        size--;
        return deuquedValue;
    }
    public int print_queue()
    {
        if(IsEmpty())
        {
            System.err.println("Cannot perform the print_queue operation : Queue is empty.");
            return -1;
        }
        int i = front;
        for(int count = 0; count < size; count++)
        {
            System.out.print(queue_arr[i] + " ");
            i = ++i % capacity;
        }
        System.out.println();
        return 0;
    }

    private boolean IsEmpty()
    {
        return size == 0;
    }

    private boolean IsFull()
    {
        return size == capacity;
    }
}   
