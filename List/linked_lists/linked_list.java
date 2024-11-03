package linked_lists;
public class linked_list 
{
    // Add node to linked_list
    static int node_index = 0;
    static Node header = null;

    public void add_node(int data, int index)
    {
        Node nNode = new Node(data);
        int counter_index = 0;
        // Check is this first node of the list
        if(node_index == 0)
            header = nNode;
        else
        {
            // Start searching from start by following nodes until reaching desired index
            Node cNode = header;
            while(counter_index != index - 1)
            {
                // Increase the node until reaching the index that we wanted
                cNode = cNode.get_next();
                counter_index++;
            }
            // when the while loop end it means we reached the index that we searched
            // set the next arrow of new node to currents || set the current node's next to new node 
            nNode.set_next(cNode.get_next());
            cNode.set_next(nNode);
            counter_index = 0;
        }   
        node_index++;
    }
    public void remove_node(int index)
    {
        int counter_index = 0;
        // if there is only first index exist it means it should be removed
        if(header.get_next() == null)
            header = null;
        else
        {
            // Start searching from start by following nodes until reaching desired index
            Node cNode = header;
            if(index == 0) header = header.get_next();
            else
            {
                while(counter_index != index-1)
                {
                    // Increase the node until reaching the index that we wanted
                    cNode = cNode.get_next();
                    counter_index++;
                }
                cNode.set_next(cNode.get_next().get_next());
            }
            
        }
        node_index--;
    }
    public void print_nodes()
    {
        Node tNode = header;
        while (tNode != null) 
        {
            System.out.println(tNode.get_data());
            tNode = tNode.get_next();
        }
        System.out.println();
    }
}
