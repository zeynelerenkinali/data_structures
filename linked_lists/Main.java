package linked_lists;
public class Main 
{
    public static void main(String[] args) 
    {
        linked_list Linked_list = new linked_list();
        int size_linked_list = 4;
        for(int i = 0; i < size_linked_list; i++)
        {
            Linked_list.add_node(i, i);
        }
        Linked_list.print_nodes();

        Linked_list.remove_node(0);

        Linked_list.print_nodes();
    }
}
