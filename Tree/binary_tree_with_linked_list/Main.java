import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        binary_tree b_tree = new binary_tree();
        int choice, data;

        while(true)
        {
            System.out.print("||Integer Binary Tree Structure||\n\n1.Insert Data\n2.Delete Data\n3.Print Tree\n4.Exit\nChoice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("\nInsert: ");
                    data = sc.nextInt();
                    b_tree.insert_node(data);
                    break;
                case 2:
                    System.out.print("\nDelete: ");
                    data = sc.nextInt();
                    b_tree.delete_node(data);
                    break;
                case 3:
                    System.out.println("||Select a Print Operation|| ");
                    b_tree.print();
                case 4:
                    System.out.print("Leaving...");
                    return;
                default:
                    throw new AssertionError();
            }
        }
    }
    
}
