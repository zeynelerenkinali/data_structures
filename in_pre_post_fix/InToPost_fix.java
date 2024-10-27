package in_pre_post_fix;
/* 
Algorithm
1. Take the input as String
2. Initialize result charArray as size of input String, Initialize Operation hash(array)
3. Transform String input to charArray
4. Read a Character from charArray
5. If character is int, push it to result charArray
6. Else if character is operator, go to 7. Step
7. Check the operator's priority by function, Go to 8. Step
8. If it's 1 "()" Go to 9. Step, 
   If it's 2 "^" Go to 10. Step, 
   If it's 3 "*, /" Go to 11. Step,
   If it's 4 "+, -" Go to 12. Step,
9. If character equals "(" Push  to the operation hash
   else if char equals ")" check hash
        if "(" exists pop() all operations in hash until ")"
        else return error(parantheses is not correctly opened/closed).
10. Push char to charArray
11. Check hash if there is higher order operation, push the higher order operation in the hash to the result then push current operation to hash.
               else push current operation to hash
12. Check hash if there exists higher order operation, push that ot charArray after finishing push current to hash
    else push current operation to hash
13. After all the input String finished check the operation hash lastly and if there exist operation push charArray by hash Order
14. Tansform result charArray to String
15. Return String
*/ 
public class InToPost_fix 
{
    public int infix_to_postfix(String inputString)
    {
        char[] inputCharArr = inputString.toCharArray();

        
        return 0;
    }
}
