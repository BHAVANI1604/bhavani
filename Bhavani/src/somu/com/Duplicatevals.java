package somu.com;

public class Duplicatevals {

	public static void main(String[] args) {
		String s="hello world";
		int count = 0;
		char[] s2=s.toCharArray();
		System.out.println("duplication");
		for(int i=0;i<s2.length;i++) {
			count++;
			for(int j=i+1;j<s2.length;j++ )
			{
				if(s2[i]==s2[j]&&s2[i] != ' ') {
					count++;
					s2[j]=0;
				}
				
			}if(count>1&&s2[i] !=' ')
			//{
				System.out.println(s2[i]);
			//}
			
		}
		
		
	}

}
