import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
//comment
/*
it will solve using stack ds we will create a stack and will traverse in entire string if the
character will opening bracket then we will store it into stack and if character will closing then
we will check weather is stack is empty or which character is it if it will last character which was opened last time then we will
simply remove previous character which one we had put into stack last time will be thrown out of the stack
 */
class Valid_Parenthesis {
    public static void main(String[] args) {
        String s = "(";
        System.out.println (isValid ( s ));
    }

    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<> ();
        for (int i = 0; i < s.length (); i++) {
            Character ch = s.charAt ( i );
            if(isopening(ch)){
                characterStack.push ( ch );
            }
            else {
                if(characterStack.isEmpty ()){
                    return false;
                } else if (!ismatching(characterStack.peek () , ch)) {
                    return false;
                }
                else {
                    characterStack.pop ();
                }
            }
        }
        return characterStack.isEmpty ();
    }
   static boolean isopening(Character ch){
        return ch =='(' || ch == '{' || ch == '[';
    }
    static boolean ismatching(char opening , char closing){
        return (opening == '(' && closing == ')' ||
                opening == '{' && closing == '}' ||
                opening == '[' && closing == ']'
        );

    }
}