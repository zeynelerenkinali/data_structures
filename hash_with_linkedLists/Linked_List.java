public class Linked_List 
{
    Node head;
    int index = 0;
    int size;

    Linked_List(int size)
    {
        this.size = size;
    }

    void push(int data)
    {
        if(size >= index)
        {
            // A data pushed to the linked list.
            Node pNode = new Node(data);
            // If pushed node is first one 
            if(index == 0)
                head = pNode;
            else // if the second and furthermore node pushed to the linked list
            {
                pNode.set_next(head);
                head = pNode;
            }
            index++;
        }
        else
            System.err.println("Error occurred on size while pushing data : 'Size is full'\n");
    }
    void pop()
    {
        if(0 < index)
        {
            head = head.get_next();
            index--;
        }
        else
            System.err.println("Error occurred on size while popping data : 'No data to pop'\n");

    }
    void printNodes()
    {
        Node temp;
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.get_data() + " ");
            temp = temp.get_next();
        }
        System.out.println();
    }
}
