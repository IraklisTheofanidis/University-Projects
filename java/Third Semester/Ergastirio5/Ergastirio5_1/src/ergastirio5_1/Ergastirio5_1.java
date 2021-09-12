
package ergastirio5_1;

public class Ergastirio5_1 {

    public static boolean bracketsCheck(String expression) throws stackEmptyException, stackFullException
    {
        LinkedStack CheckStack = new LinkedStack();
        char charToCheck;
    
    for(int i = 0; i < expression.length(); i++)
    {
        charToCheck = expression.charAt(i);
        switch(charToCheck) {
            case '(':
                CheckStack.push('(');
                break;
             case '{':
                CheckStack.push('{');
                break; 
             case '[':
                CheckStack.push('['); 
                break;   
             case ')':
                if(CheckStack.isEmpty() || !(CheckStack.pop().equals('(')))
                    { System.out.println("Error at position : " + (i));
                        return false;
                    }
                break;
            case '}':
                if(CheckStack.isEmpty() || !(CheckStack.pop().equals('{')))
                { 
                    System.out.println("Error at position : " + (i));
                        return false;
                         
                }
                 break;
            case ']':
                if(CheckStack.isEmpty() || !(CheckStack.pop().equals('[')))
                {
                    System.out.println("Error at position : " + (i));
                    return false;
                }
                break;
            default:
                System.out.println("character " + charToCheck +" not used");
        } 
    } 
                
    if(CheckStack.isEmpty())
    {
        System.out.println("No error ");
        return true;
    }   
    else
    {
        System.out.println("Error at position: "+
        expression.length());
        return false;
    }
    }
    
    
    
    
    
    public static void main(String[] args) {
      String sentence = "{[(a+(b+c))]}";
       //String sentence = "{[(a+(b]+c))]}";
      // String sentence = "{[(a+(b+c))}";
      System.out.println(bracketsCheck(sentence));
    }
    
}
