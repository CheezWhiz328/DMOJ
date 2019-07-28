import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Pattern pattern = Pattern.compile(":(.*?):");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
		    System.out.println(matcher.group(1));
		}
		
		
	}
}