package com.perennialsys;

public class App 
{
    public static Boolean isParenthesisBalanced(String stringBracket){
        
        Stack stackArray = new Stack();

        for(int i=0; i<stringBracket.length(); i++){
            char temp = stringBracket.charAt(i);

            if(temp == '(' || temp == '{' || temp == '['){
                stackArray.push(temp);
            }
            else{
                
                char check;
                switch (temp) {
                    case ')':
                        check = stackArray.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;
    
                    case '}':
                        check = stackArray.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;
        
                    case ']':
                        check = stackArray.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }
        }
        return stackArray.isEmpty();
    }
    public static void main( String[] args )
    {
        String stringBracket = "(){}[]";
        if(isParenthesisBalanced(stringBracket)){
            System.out.println("Balanced Parenthesis");
        }
        else{
            System.out.println("Parenthesis is not balanced");
        }
    }
}
