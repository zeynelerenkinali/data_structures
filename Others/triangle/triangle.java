import java.util.*;

public class triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        triangle_methods t_m = new triangle_methods();
        boolean loop_in = true;
        int counter = 0, choice;
        while(loop_in)
        {
            if(counter == 0)
                System.out.print("||Welcome to Triangle Maker||\n|Please type the triangle type that you want|\n1.Right Triangle\n2.Full Triangle\n3.Reversed Full Triangle\n4.Exit\nChoice: ");
            else
                System.out.print("\n1.Right Triangle\n2.Full Triangle\n3.Reversed Full Triangle\n4.Exit\nChoice: ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1://Right Triangle
                {   
                    t_m.right_triangle();
                    break;
                }
                case 2:
                {
                    t_m.full_triangle();
                    break;
                }
                case 3:
                {
                    t_m.reversed_full_triangle();
                    break;
                }
                case 4:
                {
                    loop_in = false;
                    break;
                }
                default:
                {
                    break;
                }
            }
            counter++;
        }
        sc.close();
    }
}