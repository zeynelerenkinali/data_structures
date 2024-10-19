public class Node
{
    private int data;
    private Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    
    Node get_next()
    {
        return this.next;
    }
    int get_data()
    {
        return this.data;
    }
    void set_next(Node next)
    {
        this.next = next;
    }
    void set_data(int data)
    {
        this.data = data;
    }
}