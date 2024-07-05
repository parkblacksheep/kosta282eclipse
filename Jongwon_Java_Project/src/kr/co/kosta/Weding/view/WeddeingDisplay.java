package kr.co.kosta.Weding.view;

import java.util.ArrayList;

import kr.co.kosta.Weding.Authority;
import kr.co.kosta.Weding.Customer;
import kr.co.kosta.Weding.Function;
import kr.co.kosta.Weding.Hole;

public class WeddeingDisplay {
	Hole hole = Hole.getInstance();
//	-> getInstance로 싱글톤 패턴을 가져옴
	public static final String Section = "마이 페이지\n";
	public static final String Function_Profile_Title = "나의 프로필 정보>>> \n";
	public static final String Line = "================================\n";
	public static final String HEADER = "신랑이름 \t 전화번호 \t 메일 \t 생일 \t  >>> \n";
	public static final String Line2 = "-------------------------------\n";

	public static final String Function_VisitPlan_Title = "금일 방문 일정>>> \n";
	public static final String table = "스튜디오명 \t 예약자 \t 금일 예약 시간\t  >>> \n";

	public static final String Function_ReservationSituation_Title = "현재 예약 현황>>> \n";
	public static final String Card = "이미지url \t 스튜디오명 \t 주소\t 좋아요 버튼 \t  >>> \n";

	private StringBuffer buffer = new StringBuffer();

	public String getDisplay() {
		ArrayList<Function> functions = hole.getFunctions();

		for (Function function : functions) {

		}

		return buffer.toString();
	}

// 직접적으로 보이는 부분들
	private void makeFooter(Function funtion) {
		buffer.append("\n");
	}

	private void makeBody(Function function) {
		ArrayList<Customer> customers = function.getCustomers();
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			buffer.append(customer.getCustomerName());
			buffer.append(customer.getCustomerId());
			buffer.append("\t");
			buffer.append(customer.getMajorfunction().getFuntionName());
			buffer.append("\n");
		}
	}

	private void makeHeader(Function fucntion) {
		buffer.append("\t" + fucntion.getFuntionName());
		buffer.append(WeddeingDisplay.Function_Profile_Title);
		buffer.append(WeddeingDisplay.Line);
		buffer.append(WeddeingDisplay.HEADER);
		buffer.append(WeddeingDisplay.Line2);
	}

	// -----
	private void getAuthLevel(Customer customer, Function function) {
		ArrayList<Authority> authList = customer.getAuthorities();
		int majorId = customer.getMajorfunction().getFuctionId();
	}
}
