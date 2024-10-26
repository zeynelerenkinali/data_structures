public class Main
{
    public static void main(String[] args )
    {
        Queue_linkedList queue = new Queue_linkedList();

        queue.Enqueue(0);
        queue.Enqueue(1);
        queue.Enqueue(2);

        queue.print_queue();

        queue.Dequeue();

        queue.print_queue();

        queue.Dequeue();

        queue.print_queue();

        queue.Enqueue(5);
        queue.Enqueue(6);

        queue.print_queue();

        queue.Dequeue();
        queue.Dequeue();

        queue.print_queue();

        queue.Dequeue();

        queue.print_queue();
    }
}