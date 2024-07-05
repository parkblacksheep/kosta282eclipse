package kr.co.kosta.Level;

public class StatusEvluation implements LevelEvaluation {

	@Override
	public String getLevel(int authority) {
		String status = null;
		if (authority == 1002) {
			if (status == "couple") {
				System.out.println("커플 페이지 사용하시겠습니까?");
			} else {
				status = "none";
				System.out.println("마이페이지로 이동하겠습니다.");
			}
		} else {
			System.out.println("회원이 아니시군요 되돌아가 주세요.");
			status = "none";
		}
		return status;
	}

}
