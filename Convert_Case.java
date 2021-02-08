import java.io.*; 
  
public class Convert_Case 
{ 
    public static void main(String args[]) 
    { 
        String str = "EduCatiON"; 
        int upper = 0, lower = 0; 
        StringBuffer newStr=new StringBuffer(str);    
  
        for(int i = 0; i < str.length(); i++) 
        { 
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else
                System.out.println("Unknown");
        } 
  
        System.out.println("Lower case letters : " + lower); 
        System.out.println("Upper case letters : " + upper); 
        for(int i = 0; i < str.length(); i++) {    
                
            
            if(Character.isLowerCase(str.charAt(i))) {    
                 
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));    
            }    
            
            else if(Character.isUpperCase(str.charAt(i))) {    
               
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    } 
} 