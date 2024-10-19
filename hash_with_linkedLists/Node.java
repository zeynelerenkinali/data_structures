public class Node 
{
    private Node next;
    private int data;

    Node(int data)
    {
        this.next = null;
        this.data = data;
    }
    void set_next(Node next)
    {
        this.next = next;
    }
    void set_data(int data)
    {
        this.data = data;
    }
    Node get_next()
    {
        return this.next;
    }
    int get_data()
    {
        return this.data;
    }
}


