public class Queue
{
    // index information of front and rear, -1 as starting because there is no element inserted 
    int front = -1;
    int rear = -1;

    // Insertion process for an integer
    // Insertion will applied rear part of the queue,
    // However in the first insert we need to increase size of front index as well.
    // Because first insertion will be front and rear of the queue at the same time. 
    void Enqueue(int data)
    {
        Node ins = new Node(data);
    }
}