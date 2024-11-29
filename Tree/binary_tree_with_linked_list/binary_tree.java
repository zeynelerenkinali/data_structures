/*
 * Binary_tree class algorithm;
 * 1. Initialize, root_node, size,  
 * 2. Create a constructor that will initialize the variables
 * 3. Create a insert_node(data, root) function,
 *    3.1 Create a node with data, 
 *    3.2 If size == 0, 
 *          3.2.1 Set root_node to current node,
 *    3.3 Else if root.data >= data,
 *          3.3.1 if root.left == null
 *               root.left = new_node
 *               new_node.parent = root
 *          4.3.1 else 
 *               insert(data, root.left);
 *    4.1 Else if root.data < data,
 *        4.1 if root.right == null
 *               root.right = new_node
 *               new_node.parent = root
 *        4.2 else
 *             insert(data, root.right)
 * 
 * Print_tree class algorithm;
 * 1. 
 */

import java.util.LinkedList;
import java.util.Queue;

public class binary_tree 
{
    private Node root_node = null;

    void insert_node(int data, Node root_node)
    {
        Node new_node = new Node(data);
        if(root_node == null)
        {
            this.root_node = new_node;
            this.root_node.set_parent_node(null);
        }
        else if(root_node.get_data() >= new_node.get_data())
        {
            if(root_node.get_left_child_node() == null)
            {
                root_node.set_left_child_node(new_node);
                new_node.set_parent_node(root_node);
            }
            else
                insert_node(data, root_node.get_left_child_node());
        }
        else if(root_node.get_data() < new_node.get_data())
        {
            if(root_node.get_right_child_node() == null)
            {
                root_node.set_right_child_node(new_node);
                new_node.set_parent_node(root_node);
            }
            else
                insert_node(data, root_node.get_right_child_node());
        }
    }
    public void printTree() {
        if (this.root_node == null) {
            System.out.println("Tree is empty.");
            return;
        }

        // Initialize a queue for level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root_node);

        // Traverse the tree level by level
        while (!queue.isEmpty()) {
            // Remove the front node from the queue
            Node current = queue.poll();

            // Print the data of the current node
            System.out.print(current.get_data() + " ");

            // Add the left child to the queue
            if (current.get_left_child_node() != null) {
                queue.add(current.get_left_child_node());
            }

            // Add the right child to the queue
            if (current.get_right_child_node() != null) {
                queue.add(current.get_right_child_node());
            }
        }

        System.out.println(); // Move to the next line after printing all nodes
    }

}