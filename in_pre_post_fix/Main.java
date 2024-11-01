public class Main {
    public static void main(String[] args) 
    {
        InToPost_fix inToPost = new InToPost_fix();
        int test_count = 10;
        String test[] = new String[10];

        test[0] = inToPost.infix_to_postfix("3+5*2"); // Expected : 352*+

        test[1] = inToPost.infix_to_postfix("(1+2)*4+3"); // Expected : 12+4*3+

        test[2] = inToPost.infix_to_postfix("5*(6+2)-8/4"); // Expected : 562+*84/-

        test[3] = inToPost.infix_to_postfix("(7+8)/(4-2)"); // Expected : 78+42-/

        test[4] = inToPost.infix_to_postfix("6+3*2^2-4"); // Expected : 6322^*+4-

        test[5] = inToPost.infix_to_postfix("(2+3)*(5+4)"); // Expected : 23+54+*

        test[6] = inToPost.infix_to_postfix("8+(3*4)/2^2"); // Expected : 834*22^/+

        test[7] = inToPost.infix_to_postfix("((1+2)*3)-(4/(2+2))"); // Expected : 12+3*422+/−

        test[8] = inToPost.infix_to_postfix("9+(6/(1+2))*3"); // Expected : 9612+/3*+

        test[9] = inToPost.infix_to_postfix("(5+3)*(2+1)*2"); // Expected : 53+21+*2*

        // Print test results
        for(int i = 0; i < test_count; i++)
        {
            System.out.println(test[i]);
        }
    }
}