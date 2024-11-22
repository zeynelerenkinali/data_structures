public class Main 
{
    public static void main(String[] args) 
    {
        Merge merge = new Merge();

        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        merge.merge(arr);

        merge.printArray(arr);
    }
}