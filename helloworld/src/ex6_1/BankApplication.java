package ex6_1;

import java.util.Scanner;

public class BankApplication {

	Account[] array;
	
	
		private BankApplication(){
			this.array=new Account[100];
		}
	
	
		//초기 화면
		public int func_1(Scanner sc)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>");
			return sc.nextInt();
		}
		

		//계좌 생성 함수 -> account 객체를 리턴...
		public void func_2(Scanner sc, Account[] array) {
			Account a1 = new Account();
			System.out.println("-------");
			System.out.println("계좌 생성");
			System.out.println("-------");
			sc.nextLine();
			
			System.out.println("계좌번호:");
			a1.setAccountNumber(sc.nextLine());
			
			System.out.println("계좌주 :");
			a1.setName(sc.nextLine());
			
			System.out.println("초기입금금액");
			a1.setBalance(sc.nextInt());
			
			
			for(int i=0 ; i<array.length;i++)
			{
				if(array[i]!=null)
					continue;
				else
				{
					array[i]=a1;
					return;
				}
			}
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
		
		//계좌 목록 함수
		public void func_3(Scanner sc)
		{
			System.out.println("-------");
			System.out.println("계좌목록");
			System.out.println("-------");
		
			for(int i=0;i<array.length;i++)
			{
				if(array[i]!=null)
				{
					System.out.print("계좌번호 : "+array[i].getAccountNumber()+"  ");
					System.out.print("이름 : "+array[i].getName()+" ");
					System.out.println("잔고 : "+array[i].getBalance());
				}
				else
					break;
			}
		
		}
		
		
		
		//출금 함수
		public void func_4(Scanner sc, Account[] Account_array) {
			
			Account temp=null;
			
			System.out.println("-----");
			System.out.println("출금");
			System.out.println("----");
			
			sc.nextLine();
			System.out.println("계좌번호:");
			String accountnumber=sc.nextLine();
			
			for(int i=0;i<Account_array.length;i++)
			{
				if( Account_array[i]!=null &&Account_array[i].getAccountNumber().equals(accountnumber))
				{
					temp=Account_array[i];
					break;
				}
				else
					continue;
			}
			
			if(temp == null)
			{
				System.out.println("출금을 진행할 계좌번호를 다시 입력하세요");
				 return;
			}
			
			System.out.println("출금액:");
			int number=sc.nextInt();
			temp.setBalance(temp.getBalance()-number);
			System.out.println("결과: 출금이 성공되었습니다.");
			
			
		}
		
		
		
		
		//출금 함수
		public void func_5(Scanner sc, Account[] Account_array) {
					
					Account temp=null;
					
					System.out.println("-----");
					System.out.println("입금");
					System.out.println("----");
					
					sc.nextLine();
					System.out.println("계좌번호:");
					String accountnumber=sc.nextLine();
					
					for(int i=0;i<Account_array.length;i++)
					{
						if( Account_array[i]!=null &&Account_array[i].getAccountNumber().equals(accountnumber))
						{
							temp=Account_array[i];
							break;
						}
						else
							continue;
					}
					
					if(temp == null)
					{
						System.out.println("입금을 진행할 계좌번호를 다시 입력하세요");
						 return;
					}
					
					System.out.println("입금액:");
					int number=sc.nextInt();
					temp.setBalance(temp.getBalance()+number);
					System.out.println("결과: 입금이 성공되었습니다.");
					
					
		}
		
		
		
		
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankApplication ba = new BankApplication();
		
		while(true)
		{
			int num=0;
			num =ba.func_1(sc);
			
			switch(num) {
			//계좌 생성
			case 1:
				ba.func_2(sc,ba.array);
				break;
			
			//계좌 목록
			case 2:
				ba.func_3(sc);
				break;
			
			// 예금
			case 3:
				ba.func_5(sc, ba.array);
				break;
			
			// 출금
			case 4:
				ba.func_4(sc, ba.array);
				break;
				
			// 프로그램 종료
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
			
			
		}
		
		
	}

}
