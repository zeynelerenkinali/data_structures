public class Queue
{
    Node front_node;
    Node rear_node;
    // index information of front and rear, -1 as starting because there is no element inserted 
    int front_index;
    int rear_index;

    Queue()
    {
        this.front_index = -1;
        this.rear_index = -1;
        this.rear_node = null;
        this.front_node = null;
    }
    // Insertion process for an integer
    // Insertion will applied rear part of the queue,
    // However in the first insert we need to increase size of front index as well.
    // Because first insertion will be front and rear of the queue at the same time. 
    void Enqueue(int data)
    {
        Node ins = new Node(data);
        if(rear_index == -1) // If queue is empty, inserted node will be first
        {
            front_node = ins;
            rear_node = ins;
            rear_index++;
            front_index++;
        }
        else // else queue is not empty,
        {
            Node temp = front_node;
            int counter = 0;
            rear_node = ins;
            while(counter != rear_index - 1)
            {
                temp = temp.get_next();
                counter++;
            }
            temp.set_next(rear_node);
            rear_index++;
        }
    }
    void Dequeue()
    {
        // Means there is one node in the linked list
        if(front_index == rear_index)
        {
            front_node = null;
            rear_node = null;
            front_index = -1;
            rear_index = -1;
        }
        else
        {
            front_node = front_node.get_next();
            front_index++;
        }
    }
    void print_queue()
    {
        Node temp = front_node;
        int counter = rear_index - front_index;
        while(counter != 0)
        {
            System.out.print(temp.get_data() + " ");
            temp = temp.get_next();
            counter--;
        }
        System.out.println();
    }
}