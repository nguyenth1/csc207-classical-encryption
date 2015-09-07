import java.util.Scanner;

public class VigenereCipher {
public static void Encode (String s, String key){
	char chararr[] = s.toCharArray ();
	char[] keyarr = s.toCharArray ();
	int base = (int) 'a';
	for (int i = 0; i < s.length(); i++){				
			keyarr[i] = key.charAt(i % key.length());									
			int ch = ((int) s.charAt(i)) - base;	
			int keyy = ((int) keyarr[i]) - base;
			ch = ((ch + keyy)%26) + base;
			chararr[i] = (char) ch;
			}
			String str = new String(chararr);

System.out.println(str);
}
	

public static void Decode (String s, String key){
	char chararr[] = s.toCharArray ();
	char[] keyarr = s.toCharArray ();
	int base = (int) 'a';
	for (int i = 0; i < s.length(); i++){				
			keyarr[i] = key.charAt(i % key.length());									
			int ch = ((int) s.charAt(i)) - base;	
			int keyy = ((int) keyarr[i]) - base;
			ch = ch - keyy;
			if (ch >= 0)
				ch = (ch % 26);
				else if (ch < 0)
				ch = (ch + 26);	
				ch = ch + base;
				chararr[i] = (char) ch;			
			}
			String str = new String(chararr);

System.out.println(str);
} 
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
System.out.println(" This program encrypts and decrypts messages using a Vigenere Cipher. Would you like to encode or decode your message?");
Scanner in = new Scanner(System.in);
String response = in.nextLine();
if ((response).equals("encode") || (response).equals("decode")){
	System.out.println ("Enter string");
	Scanner input = new Scanner(System.in);
	String str = in.nextLine();
	System.out.println ("Enter key");
	Scanner inputkey = new Scanner(System.in);
	String key = in.nextLine();	
	if ((response).equals("encode"))
		Encode(str, key);
		else if ((response).equals("decode"))
			Decode(str, key);
	}
	else 
		System.out.println ("Please enter either decode or encode.");
		}	
	}
