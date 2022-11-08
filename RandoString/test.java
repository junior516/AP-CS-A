import java.util.*;
public class test {
    static class Rock {
        Rock(String rockName) {
            System.out.println(rockName);
        }
        public int numb = 592321;
    }
    public static void main( String[] args)
    {
        String str1 = new String("Advanced Placement");

        String str2 = new String("Advanced Placement");
        
         
        
        if (str1.equals(str2) && str1 == str2)
        
        {
        
        System.out.println("A");
        
        }
        
        else if (str1.equals(str2) && str1 != str2)
        
        {
        
        System.out.println("B");
        
        }
        
        else if (!str1.equals(str2) && str1 == str2)
        
        {
        
        System.out.println("C");
        
        }
        
        else if (!str1.equals(str2) && str1 != str2)
        
        {
        
        System.out.println("D");
        
        }
    } 
}
