

public class binary_tree {
    private Node root_node;
    private int size;

    // Constructor to initialize the tree
    public binary_tree() 
    {
        this.root_node = null;
        this.size = 0;
    }

    // Insert a new node into the tree
    public void insert_node(int data) 
    {
        // If the tree is empty, create the root node
        if (this.root_node == null) {
            this.root_node = new Node(data);
            this.size++;
        } 
        else 
        {
            // Recursive insertion starting from the root node
            insert_node(data, this.root_node);
        }
    }

    // Recursive helper for inserting a new node
    private void insert_node(int data, Node current_node) {
        if (data < current_node.get_data()) {
            // Go to the left subtree
            if (current_node.get_left_child_node() == null) {
                Node new_node = new Node(data);
                current_node.set_left_child_node(new_node);
                new_node.set_parent_node(current_node);
                this.size++;
            } else {
                insert_node(data, current_node.get_left_child_node());
            }
        } else if (data > current_node.get_data()) {
            // Go to the right subtree
            if (current_node.get_right_child_node() == null) {
                Node new_node = new Node(data);
                current_node.set_right_child_node(new_node);
                new_node.set_parent_node(current_node);
                this.size++;
            } else {
                insert_node(data, current_node.get_right_child_node());
            }
        }
        // If data is equal, ignore it (no duplicates in standard BST)
    }

    // Delete a node from the tree
    public void delete_node(int data) {
        root_node = delete_node(root_node, data);
    }

    // Recursive helper for deleting a node
    private Node delete_node(Node current_node, int data) {
        if (current_node == null) {
            return null; // Base case: if tree is empty or node not found
        }

        if (data < current_node.get_data()) {
            // Data is in the left subtree
            current_node.set_left_child_node(delete_node(current_node.get_left_child_node(), data));
        } else if (data > current_node.get_data()) {
            // Data is in the right subtree
            current_node.set_right_child_node(delete_node(current_node.get_right_child_node(), data));
        } else {
            // Node to be deleted found

            // Case 1: Node is a leaf node (no children)
            if (current_node.get_left_child_node() == null && current_node.get_right_child_node() == null) {
                return null;
            }

            // Case 2: Node has only one child
            if (current_node.get_left_child_node() == null) {
                return current_node.get_right_child_node();
            } else if (current_node.get_right_child_node() == null) {
                return current_node.get_left_child_node();
            }

            // Case 3: Node has two children
            // Find the inorder successor (smallest node in right subtree)
            Node successor = find_minimum(current_node.get_right_child_node());
            current_node.set_data(successor.get_data());  // Replace current node with successor's data
            current_node.set_right_child_node(delete_node(current_node.get_right_child_node(), successor.get_data()));  // Delete the successor
        }
        return current_node;
    }

    // Find the node with the minimum value (inorder successor)
    private Node find_minimum(Node current_node) {
        while (current_node.get_left_child_node() != null) {
            current_node = current_node.get_left_child_node();
        }
        return current_node;
    }

    // Print the tree (inorder traversal)
    public void print() {
        if (this.root_node == null) {
            System.out.println("Tree is empty.");
        } else {
            print(this.root_node);
            System.out.println(); // Add a newline at the end of the print
        }
    }

    private void print(Node root_node) {
        if (root_node != null) {
            print(root_node.get_left_child_node());
            System.out.print(root_node.get_data() + " ");
            print(root_node.get_right_child_node());
        }
    }   
}
