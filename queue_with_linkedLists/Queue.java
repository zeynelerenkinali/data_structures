public class Queue
{
    Node front_node;
    Node rear_node;
    // index information of front and rear, -1 as starting because there is no element inserted 
    int front_index = -1;
    int rear_index = -1;

    // Insertion process for an integer
    // Insertion will applied rear part of the queue,
    // However in the first insert we need to increase size of front index as well.
    // Because first insertion will be front and rear of the queue at the same time. 
    void Enqueue(int data)
    {
        Node ins = new Node(data);
        if(rear_index == -1)
        {
            front_node = ins;
            rear_node = ins;
            rear_index++;
            front_index++;
        }
        else
        {
            
        }
    }
}