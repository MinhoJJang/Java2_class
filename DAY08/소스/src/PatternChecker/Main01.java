package PatternChecker;

import java.util.regex.Pattern;

public class Main01 {

	public static void main(String[] args) {
		// È¸¿ø°¡ÀÔ½Ã¿¡ ÀÔ·ÂÇÑ ³»¿ëÀ» °¡Á¤ÇÑ º¯¼ö°ªµé
		String name = "ÀÚ¹ÙÇĞ»ı";
		String age = "19";
		String email = "user@java.net";
		String phone = "01012345678";
		
		// ÇÑ±Û ¿©ºÎ °Ë»ç
		boolean isKor = Pattern.matches("^[¤¡-¤¾°¡-ÆR]*$", name);
		
		if(!isKor) {
			System.out.println("ÀÌ¸§Àº ÇÑ±Û·Î ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			// ½ÇÇàµµÁß returnÀ» ¸¸³ª¸é Áï½Ã Áß´Ü
			return;
		}
		
		// ¼ıÀÚÀÎÁö°Ë»ç
		boolean isNum = Pattern.matches("^[0-9]*$", age);
		
		if(!isNum) {
			System.out.println("³ªÀÌ´Â ¼ıÀÚ·Î¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
			return;
		}
		
		// ÀÌ¸ŞÀÏ °Ë»ç
		boolean isEmail = Pattern.matches(
				"^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$"
				, email);
		
		if(!isEmail) {
			System.out.println("ÀÌ¸ŞÀÏ Çü½ÄÀÌ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		
		// ÈŞ´ëÆù ¹øÈ£ Çü½Ä °Ë»ç
		boolean isPhone = Pattern.matches(
				"^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", 
				phone);
		
		if(!isPhone) {
			System.out.println("ÀüÈ­¹øÈ£ Çü½ÄÀÌ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			return;
		}
		
		System.out.println("È¸¿ø°¡ÀÔ ÀıÂ÷¸¦ ÁøÇàÇÕ´Ï´Ù.");
		
	}

}







