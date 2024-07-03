package kr.co.kosta2;

/*
6층 건물이 있습니다.
1층 김밥집 , 2층 약국, 3층 피부과,
*/
public class SwitchCaseTest2 {
	public static void main(String[] args) {
		int number = 3;
		String floor="";

		switch (number) {
		case 1:
			floor = "김밥집";
			break;
		case 2:
			floor = "약국";
			break;
		case 3:
			floor = "피부과";
			break;
		case 4:
			floor = "내과";
			break;
		case 5:
			floor = "헬스 클럽";
			break;
		case 6:
			floor = "KOSTA";
			break;
		default:
			System.out.println("그 외 층은 존재하지 않는 층입니다.");
		}
		if (number>=1 && number<=6) {
			System.out.println(number + "층은 " + floor + "입니다.");	
		}
		

	}
}
