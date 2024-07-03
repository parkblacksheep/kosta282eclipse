package kr.co.kosta4;

import kr.co.kosta5.MakeIDException;

public class MekeIDExceptionTest {
	private String userId;
	
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) throws MakeIDException{
		if(userId==null) {
			throw new MakeIDException("아이디는 null일 수 없습니다."); // 강제 예외 발생 시킴
		}
		else if(userId.length()<9 ||userId.length()>20) {// 강제 예외 발생 시킴
			throw new MakeIDException("아이디는 9자 이상 20자 이하로 쓰세요");
		}
			
			this.userId = userId;
	}
	public static void main(String[] args) {
		MekeIDExceptionTest test = new MekeIDExceptionTest();
		String userId = null;
		try {
			test.setUserId(userId);			//아디 값이 null인 경우
		} catch (MakeIDException e) {
			System.out.println(e.getMessage());
		}
		
		userId = "12345678";
		try {
			test.setUserId(userId);			//아이디 값이 9자 이하인 경우
		} catch (MakeIDException e) {
//			e.printSTackTrace();
			System.out.println(e.getMessage());
		}
		
		userId = "12345678";
		try {
			test.setUserId(userId);
		} catch (MakeIDException e) {
//			e.printSTackTrace();
			System.out.println(e.getMessage());
		}
	}
}


