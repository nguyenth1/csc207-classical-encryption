import java.util.Scanner;
import java.util.Arrays;


	public class CaesarCipher {
	public static void Encode (String s){
		char chararr[] = s.toCharArray ();
		int base = (int) 'a';
		for (int n=0; n<26; n++){
			for (int j = 0; j < chararr.length; j++){
				int ch = ((int) s.charAt(j)) - base;				
				ch = ((ch + n) % 26);
				ch = ch + base;
				chararr[j] = (char) ch;
			}
			String str = new String(chararr);
			System.out.print("n= ");
			System.out.println(n);
			System.out.println(str);
			}
				}
				
		public static void Decode (String s){
		char chararr[] = s.toCharArray ();
		int base = (int) 'a';
		for (int n=0; n<26; n++){
			for (int j = 0; j < chararr.length; j++){
				int ch = ((int) s.charAt(j)) - base;
				ch = ch - n;
				if (ch >= 0)
				ch = (ch % 26);
				else if (ch < 0)
				ch = (ch + 26);	
				ch = ch + base;
				chararr[j] = (char) ch;
			}
			String str = new String(chararr);
			System.out.println(n);
			System.out.println(str);
			}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(" This program encrypts and decrypts messages using a Caesar Cipher. Would you like to encode or decode your message?");
	Scanner in = new Scanner(System.in);
	String response = in.nextLine();
	
	if ((response).equals("encode") || (response).equals("decode")){
		System.out.println ("Enter string");
		Scanner input = new Scanner(System.in);
		String str = in.nextLine();
		
		if ((response).equals("encode"))
			Encode(str);
			else if ((response).equals("decode"))
				Decode(str);
		}
		else 
			System.out.println ("Please enter either decode or encode.");
			}	
		}
