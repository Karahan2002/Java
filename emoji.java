package yakup;

public class emoji{
	public static void main(String[] args) {
		String emoji = ":)";
		if(emoji.length()!=2) {
			System.out.println("Invalid emoji");
			return;
		}
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		if(first==':') {
			if(second == ')') {
				System.out.println("smile");
			}else if(second == '(') {
				System.out.println("sad");
			}else if(second == '/') {
				System.out.println("upset");
			}else{
				System.out.println("Unknown emoji");
			}
		}else if(first == ';') {
			if(second == ')') {
				System.out.println("wink");
			}else if(second == '0') {
				System.out.println("suprised");
			}else {
				System.out.println("Unknown emoji");
			}
		}
	}
}
