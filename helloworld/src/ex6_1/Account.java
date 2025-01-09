package ex6_1;

import java.util.Scanner;

public class Account {

	static final int MAX_VALUE=1000000 ;
	static final int  MIN_VALUE=0;
	private int balance;
	private String name;
	private String account_number;
	
	
	// 계좌 잔고
	public int getBalance() {
	
		return balance;
	}
	
	// 계좌주명
	public String getName() {
		return name;
	}
	
	//계좌 번호
	public String getAccountNumber() {
		return account_number;
	}
	
	
	public void setBalance(int balance){
	
		if(balance >MAX_VALUE|| balance <MIN_VALUE)
		{
			System.out.println("잔고 입력값 범위를 벗어낫습니다.(0<=<1000000");
		}
		else
		{
			this.balance=balance;
		}
	}
	
	public void setAccountNumber(String account_number) {
			this.account_number=account_number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	
	
	
	
	
	//예금 구현 함수
	public void func_4() {
		
		
		
		

	
	}
	
}
