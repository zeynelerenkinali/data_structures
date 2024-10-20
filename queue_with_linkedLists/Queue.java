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
    }
    // Insertion process for an integer
    // Insertion will applied rear part of the queue,
    // However in the first insert we need to increase size of front index as well.
    // Because first insertion will be front and rear of the queue at the same time. 
    void Enqueue(int data)
    {
        Node ins = new Node(data);
        if(rear_index == 0) // If queue is empty, inserted node will be first
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

    }
}