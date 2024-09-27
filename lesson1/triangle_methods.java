public class triangle_methods 
{
    public void right_triangle()
    {
        for(int i = 0; i <= 10; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            if(i != 0)
                System.out.println();
        }
    }
    public void full_triangle()
    {
        for(int i = 0; i < 10; i++)
        {
            //empty
            for(int j = 10; i <= j ; j--)
            {
                System.out.print(" ");
            }
            //star
            for(int k = 0; k <= i; k++)
            {
                System.out.print("*");
            }
            //star
            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void reversed_full_triangle()
    {
        for(int i = 0; i < 10; i++)
        {
            //empty
            for(int j = 0; j < i ; j++)
            {
                System.out.print(" ");
            }
            //star
            for(int k = 10; i < k; k--)
            {
                System.out.print("*");
            }
            for(int k = 9; i < k; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}
