
package pangram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pangram {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Lütfen cümlenizi giriniz");
      String a =input.nextLine();
     boolean tumHarfler = true;  

for (char ch = 'a'; ch <= 'z'; ch++)   {  
if (a.contains(String.valueOf(ch))== false)   {  
tumHarfler = false;  
break;  
}  
}  

if (tumHarfler== true )  
System.out.println("Pangram String'dir");   

else  
System.out.println("Pangram String değildir");  
}  
    }
   
       
    
    
