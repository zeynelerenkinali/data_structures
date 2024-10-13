package linked_lists;

public class Node
{
    private int data;
    private Node next;
    
    // Call constructor and initialize values of parameters.
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    // Setter and Getter methods to reach and change the variables of nodes. 
    public void set_next(Node next)
    {
        this.next = next;
    }
    public void set_data(int data)
    {
        this.data = data;
    }
    public Node get_next()
    {
        return this.next;
    }
    public int get_data()
    {
        return this.data;
    }
}