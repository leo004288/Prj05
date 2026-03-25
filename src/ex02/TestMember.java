package ex02;

class Member{
	//field
	String name;
	String uid;
	String email;
	int    regyear;
	
	//기본 생성자
	public Member() {}
	
	//인자 있는 생성자
	public Member(String n, String u, String e, int r) {
		name    = n;
		uid     = u;
		email   = e;
		regyear = r;
	}
	
	//method
	void info() {
		String fmt = "이름:%s\n아이디:%s\n이메일:%s\n연도:%d\n";
				           
		String msg = String.format(fmt,
				                   name, uid, email, regyear);
		System.out.println(msg);
	}
	
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "사나";
		m1.uid = "sana";
		m1.email = "sana@jyp.com";
		m1.regyear = 2017;		
		m1.info();
		
		Member m2 = new Member();
		m2.name = "정연";
		m2.uid = "JN";
		m2.email = "jy@jyp.com";
		m2.regyear = 2017;		
		m2.info();
		
		Member m3 = new Member();
		m3.name = "나연";
		m3.uid = "NY";
		m3.email = "NY@jyp.com";
		m3.regyear = 2017;		
		m3.info();
		
		System.out.println("=====================");
//		//member 배열에 저장
//		Member [] mList = new Member[3];    //배열 생성
//		mList[0] = new Member();            //배열안 member 생성
//		mList[0].name    = "사나";
//		mList[0].uid     = "sana";
//		mList[0].email   = "sana@jyp.com";
//		mList[0].regyear = 2017;
		
		Member [] mList = new Member[3];    //배열 생성
		mList[0] = new Member("사나", "sana", "sana@jyp.com", 2017);
		mList[1] = new Member("정연", "JN", "JN@jyp.com", 2017);
		mList[2] = new Member("나연", "NY", "NY@jyp.com", 2017);
		mList[0].info();
		mList[1].info();
		mList[2].info();
		
		
	} //

} //
