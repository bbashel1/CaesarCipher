import java.util.Scanner;
 
public class CaesarCipher
{
    public static final String AL = "abcdefghijklmnopqrstuvwxyz";
 
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = AL.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = AL.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
 
    public static void main(String[] args)
    {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = new String();
        message = sc.nextLine();
        for(int i = 1; i <= 10; i ++){
        	System.out.println(encrypt(message, i));
        }
        sc.close();
    }
}