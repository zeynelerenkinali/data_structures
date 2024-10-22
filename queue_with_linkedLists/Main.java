public class Main
{
    public static void main(String[] args )
    {
        Queue queue = new Queue();

        queue.Enqueue(0);
        queue.Enqueue(1);
        queue.Enqueue(2);

        queue.print_queue();
    }
}