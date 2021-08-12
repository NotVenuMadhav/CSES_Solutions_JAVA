import java.util.*;
public class csesrepetitions {
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		

		char[] ch = str.toCharArray();
		
		int count = 1;
		int ans = 1;
		
		for(int i=1;i<str.length();i++) {
		
			if(ch[i] == ch[i-1]) {
				count++;
			}
			else {
				
				count = 1;
			}
			
			ans = Math.max(ans,count);
			
		}
		System.out.println(ans);
	}
}
