import java.util.Scanner;
public class HW1 {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        String word = "";
        boolean isValid = false;
        boolean isVowel = false;
        System.out.println("Enter a word: ");
        word = scnr.next();
        // word = word.trim();
        
        // if(word.length() <= 1){
            // System.out.println("Error");
            // System.out.println("Enter a word: ");
            // word = scnr.next();
            // word = word.trim();
        // }
        // while(isValid == false || word.length() <= 1){
                // System.out.println("Error");
                // System.out.println("Enter a word: ");
                // word = scnr.next();
                // word = word.trim();
               
                // for(int i = 0; i < word.length(); ++i){
                    // int ch = word.charAt(i);
                    // if(ch < 65 || ch > 90 || ch < 97 || ch > 122){
                        // isValid = false;
                        
                    // }
               
                // }
           
        // }
        // if(isValid == true){
            // System.out.println("true");
        // }
        
        if(word.length()<=1){
            isValid = false;
        }
        else{
            for(int i = 0; i < word.length(); ++i){
                int ch = word.charAt(i);
                if((ch < 65 || ch > 90) &&( ch < 97 || ch > 122)){
                    isValid = false;
                }
                else{
                    isValid = true;
                }
            }
        }
        if(isValid == false){
            System.out.println("Error");
            System.out.println("Enter a word: ");
            word = scnr.next();
            word = word.trim();
        }
        else{
            System.out.println("true");
        }
    }
    
}
       
        
            
           
        
           
        
    

