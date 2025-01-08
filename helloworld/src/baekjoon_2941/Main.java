package baekjoon_2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str =  sc.next();
		int result = str.length();
		for(int i = 0 ; i<str.length();i++)
		{
			char c = str.charAt(i);
		
			if(i<str.length()-1) {
			switch (c) {
				case 'd' :
					if(str.charAt(i+1)=='-')
						result--;
					else if(str.charAt(i+1)=='z'&& i<str.length()-2)
						if( str.charAt(i+2)=='=')
							result--;
					break;
				case 'l'  :
					if(str.charAt(i+1)=='j')
						result--;
					break;
				case 'n':
					if(str.charAt(i+1)=='j')
						result--;
					break;
				case  'c':
					if(str.charAt(i+1)=='='||str.charAt(i+1)=='-')
						result--;	
					break;
				case 's':
					if(str.charAt(i+1)=='=')
						result--;
					break;
				case 'z':
					if(str.charAt(i+1)=='=')
						result--;
					break;
			}
			}
		}
		System.out.println(result);
		
	}

}
