package ex6;

public class Member {
		
		private String name;
		private String id;
		private String password ="12345";
		private int age;
	
		Member(String name, String id)
		{
			this.name=name;
			this.id=id;
		}

		public String getid(){
			return this.id;
		}
		
		public String getpassword(){
			return this.id;
		}
		
		boolean login(String id, String password){
			
			if(id == getid() && password == getpassword())
				return true;
			else
				return false;
		}

		void logout(String id){
			System.out.println("로그아웃 되었습니다.");
		}
}
