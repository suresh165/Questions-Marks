package Java;
import java.util.*;
class Main {  
  public static String QuestionsMarks(String str) { 
    int n1 = 0, n2 = 0, count = 0, tens = 0;
    char[] chars = str.replaceAll("[^?0-9]","").toCharArray();
    for (char c: chars) {
        if (Character.isDigit(c) && n1 == 0) n1 = (int)(c-'0');
        else if (c == '?' && n1 != 0) 
        count++;
        else if (Character.isDigit(c) && n1 != 0) {
            n2 = (int)(c-'0');
            if (n1 + n2 == 10) {
                if (count != 3) 
                return "false";
                tens++;
                n1 = 0; n2 = 0; count = 0;
            }
        }
    }
    return (tens > 0) ? "true" : "false";
  } 
  
  public static void main (String[] args) {  
    try (    
    Scanner s = new Scanner(System.in)) {
        System.out.print(QuestionsMarks(s.nextLine()));
    } 
  }   
  
}