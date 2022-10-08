import java.util.Scanner;   
   
public class Main   
{   
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";   
    
    public static String enkripsiData(String inputString, int shiftKey)   
    {   
        inputString = inputString.toLowerCase();   
          
        String enkripsiString = "";   
          
        for (int i = 0; i < inputString.length(); i++)   
        {   
            int pos = ALPHABET.indexOf(inputString.charAt(i));   
              
            int enkripsiPos = (shiftKey + pos) % 26;   
            char enkripsiChar = ALPHABET.charAt(enkripsiPos);   
              
            enkripsiString += enkripsiChar;   
        }
        return enkripsiString;   
    }   
      
    public static String deskripsiData(String inputString, int shiftKey)   
    {   
        inputString = inputString.toLowerCase();   
          
        String deskripsiString = "";   
          
        for (int i = 0; i < inputString.length(); i++)   
        {   
            int pos = ALPHABET.indexOf(inputString.charAt(i));   
                
            int deskripsiPos = (pos - shiftKey) % 26;   
              
            if (deskripsiPos < 0){   
                deskripsiPos = ALPHABET.length() + deskripsiPos;   
            }   
            char deskripsiChar = ALPHABET.charAt(deskripsiPos);   
               
            deskripsiString += deskripsiChar;   
        }   
        return deskripsiString;   
    }   
      
    public static void main(String[] args)   
    {    
        Scanner sc = new Scanner(System.in);   
          
        System.out.println("Masukan Plaintext: ");   
        String inputString = sc.nextLine();   
          
        System.out.println("Masukan Key untuk pergeseran huruf : ");   
        int shiftKey = Integer.valueOf(sc.nextLine());   
          
        System.out.println("Encrypted Data ===> "+enkripsiData(inputString, shiftKey));   
        System.out.println("Decrypted Data ===> "+deskripsiData(enkripsiData(inputString, shiftKey), shiftKey));   
          
        sc.close();   
    }   
}   
