public class Main 
{
    public static void main(String[] args) 
    {
        binary_tree b_tree = new binary_tree();

        b_tree.insert_node(6, null);
        b_tree.insert_node(2, null);
        b_tree.insert_node(5, null);

        b_tree.printTree();
    }
    
}