import java.util.ArrayList;
import java.util.List;

public class NotThatEasy {

    static final List<Character> Characters = method();
    private static final char[] chars = {'J', 'a', 'c', 'k', 'y'};

    final int x = method2();

    static int method2(){
        System.out.println("i am static method, called by instance variable");
        return 3;
    }
   
    static List<Character> method(){
        System.out.println("i am static method, called by static variable");
        return new ArrayList<>();
    }
   
    static{
        System.out.println("i am static code block");
        // Characters = new ArrayList<>(); 
    }

    // Object initialization code block
    {
        System.out.println("i am initialization code block");
    }
    public static void main(String[] args) {
        // Once you click the run button
        // 1. compile
        // 2. Run -> Class loader -> stack memory
       System.out.println("start of main");
       NotThatEasy obj = new NotThatEasy();
       NotThatEasy obj2 = new NotThatEasy();
    }
}
