
public class Main 
{
    public static void main(String[] args) 
    {
        Linked_List ll = new Linked_List(5);

        ll.push(0);
        ll.push(1);
        ll.push(2);
        ll.push(3);
        
        ll.printNodes();

        ll.pop();

        ll.printNodes();

        ll.pop();
        ll.pop();

        ll.printNodes();

        ll.pop();

        ll.printNodes();

        ll.pop();

        ll.push(293);

        ll.printNodes();
        
    }    
}
