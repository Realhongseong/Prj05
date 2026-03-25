package ex02;

class Member{
	// Field : Data
	String name;
	String uid;
	String email;
	int regYear;
	
	// 생성자
	public Member() {}
	
	// 인자 있는 생성자
	public Member(String n, String u, String e, int r) {
		name = n;
		uid = u;
		email = e;
		regYear = r;
	}
	
	// Method : 기능
	void info() {
		String fmt = "이름:%s\n아이디:%s\n이메일:%s\n연도:%d\n";
		String msg = String.format(fmt,name,uid,email,regYear);
		System.out.println(msg);
	}
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "사나";
		m1.uid = "sana";
		m1.email = "sana@jyp.com";
		m1.regYear = 2016;
		m1.info();
		
		Member m2 = new Member();
		m2.name = "미나";
		m2.uid = "mina";
		m2.email = "mina@jyp.com";
		m2.regYear = 2016;
		m2.info();
		
		Member m3 = new Member();
		m3.name = "모모";
		m3.uid = "momo";
		m3.email = "momo@jyp.com";
		m3.regYear = 2016;
		m3.info();
		
		System.out.println("========================\n");
		/*
		// member 배열에 저장
		Member[] mList = new Member[3];		// 배열생성
		mList[0] = new Member();			// 배열 안 저장할 Member 생성
		mList[0].name = "사나";
		mList[0].uid= "sana";
		mList[0].email = "sana@jyp.com";
		mList[0].regYear = 2016;
		*/
		
		Member[] mList = new Member[3]; // 배열 생성
		mList[0] = new Member("사나", "sana", "sana@jyp.com", 2016);
		mList[1] = new Member("미나", "mina", "mina@jyp.com", 2016);
		mList[2] = new Member("모모", "momo", "momo@jyp.com", 2016);
		
		mList[0].info();
		mList[1].info();
		mList[2].info();
		
		
	}

}




