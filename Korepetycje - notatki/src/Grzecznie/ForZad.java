package Grzecznie;

public class ForZad {
	public static void main(String[] args) {
		String tekst = "dupa";
		char litera = 'd';

		System.out.println(zawieraZnak(litera, tekst));
	}

	private static boolean zawieraZnak(char litera, String tekst) {
		for (int i = 0; i < tekst.length(); i++) {
			if(tekst.charAt(i) == litera) {
				return true;
			}
		}

		return false;
	}

}
