package javaproject;

public class Sales {
	public static Boolean checkProductId(int value) {
		boolean result;
		if(value >= 10001 & value <= 99999) {
			result = true;
			return result;
			
		}
		else {
			result = false;
			return result;
		}
	
	
		
}
	public String getAmount(String size) {
		if(size.equals("S")) {
			return "30$";
		}
		else if (size.equals("M")) {
			return "50$";
		}
		else {
			return "80$";
		}
	}

}
