/*
 * Node class of Binary Tree
 * Includes, main node functions: set_parent_node, set_child_node, set_sibling_node, set_data, get_child_node, get_sibling_node, get_parent_node, get_data.
 * When the node first created: data that node going to hold will assigned to it, and other nodes that initialized first going to declared as null. 
 */
public class node 
{
    private node parent_node, left_child_node, right_child_node;
    private int data;

    node(int data)
    {
        this.data = data;
        this.parent_node = null;
        this.left_child_node = null;
        this.right_child_node = null;
    }

    public void set_parent_node(node parent_node)
    {
        this.parent_node = parent_node;
    }
    public void set_left_child_node(node left_child_node)
    {
        this.left_child_node = left_child_node;
    }
    public void set_right_child_node(node right_child_node)
    {
        this.right_child_node = right_child_node;
    }
    public void set_data(int data)
    {
        this.data = data;
    }

    public node get_parent_node()
    {
        return this.parent_node;
    }
    public node get_left_child_node()
    {
        return this.left_child_node;
    }
    public node get_right_child_node()
    {
        return this.right_child_node;
    }
    public int get_data()
    {
        return this.data;
    }
}