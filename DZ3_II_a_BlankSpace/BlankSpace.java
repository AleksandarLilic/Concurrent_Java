public class BlankSpace {

	public static void main(String[] args) {
		String a = "12    4       2";
		String b = "";
		int cnt = 0;
		for(int i = 0; i<a.length(); i++){
			b += " ";	
			cnt++;
		}
		
		boolean flag = false;
		int index = -1;
		for(int i = 0; i<a.length(); i++){
			if(flag == false){
				index = a.indexOf(b);
				System.out.println("check: " + i);
				if(index >= 0){
					System.out.println("Longest streak of blank spaces is: " + cnt);
					flag = true;
				}
				else{
					b = "";
					cnt--;
					for(int j = 0; j<a.length()-i-1; j++){
						b += " ";			
					}					
				}
			}
		}		
		System.out.print("start>");
		System.out.print(b);
		System.out.println("<finish");
	}
}
