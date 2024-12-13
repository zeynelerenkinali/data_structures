import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        binary_tree b_tree = new binary_tree();
        int choice, data;
        boolean first_print = false;

        while(true)
        {
            if(first_print == false)
                System.out.print("||Integer Binary Tree Structure||\n\n1.Insert Data\n2.Delete Data\n3.Print Tree\n4.Exit\nChoice: ");
            else
            {
                System.out.print("Choice: ");
                first_print = true;
            }   
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1 -> {
                    System.out.print("\nInsert: ");
                    data = sc.nextInt();
                    b_tree.insert_node(data);
                    System.out.print("\n" + data + " is successfully inserted\n");
                }
                case 2 -> {
                    System.out.print("\nDelete: ");
                    data = sc.nextInt();
                    b_tree.delete_node(data);
                    System.out.print("\n" + data + " is successfully deleted\n");
                }
                case 3 -> {
                    System.out.println("||Select a Print Operation||\n1.Inorder\n2.Preorder\n3.Postorder\nChoice: ");
                    choice = sc.nextInt();
                    switch(choice)
                    {
                        case 1 -> {
                            System.out.print("In: ");
                            b_tree.print("in");
                        }
                        case 2 -> {
                            System.out.print("Pre: ");
                            b_tree.print("pre");
                        }
                        case 3 -> {
                            System.out.print("Post: ");
                            b_tree.print("post");
                        }
                        default -> throw new AssertionError();
                    }
                }

                case 4 -> {
                    System.out.print("Leaving...");
                    return;
                }
                default -> throw new AssertionError();
            }
        }
    }
    
}
