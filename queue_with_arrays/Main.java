public class Main 
{
    public static void main(String[] args) 
    {
        int capacity = 10;
        Queue_arr q_r = new Queue_arr(capacity);
        
        q_r.print_queue();

        for(int i = 0; i < 4; i++)
        {
            q_r.Enqueue(i);
            q_r.print_queue();
        }

        q_r.Dequeue();
        
        q_r.print_queue();

        q_r.Dequeue();

        q_r.print_queue();

        q_r.Dequeue();

        q_r.print_queue();

        q_r.Dequeue();

        q_r.print_queue();

        q_r.Dequeue();

        for(int i = 0; i < 9; i++)
        {
            q_r.Enqueue(i);
        }
        q_r.print_queue();
    }
}
