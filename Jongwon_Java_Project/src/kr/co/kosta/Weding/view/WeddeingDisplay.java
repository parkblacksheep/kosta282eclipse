package kr.co.kosta.Weding.view;

import java.util.ArrayList;

import kr.co.kosta.Level.LevelEvaluation;
import kr.co.kosta.Level.StatusEvluation;
import kr.co.kosta.Level.coupleEvaluation;
import kr.co.kosta.Weding.Authority;
import kr.co.kosta.Weding.Customer;
import kr.co.kosta.Weding.Function;
import kr.co.kosta.Weding.Hole;
import kr.co.kosta.Weding.Studio;
import kr.co.kosta.utils.Constant;

public class WeddeingDisplay {
	Hole hole = Hole.getInstance();
//	-> getInstance로 싱글톤 패턴을 가져옴
	public static final String Section = "마이 페이지\n";

	public static final String Line = "\n======================================\n";
	public static final String HEADER = "이름 \t 고객번호 \t 전화번호 \t\t 메일 \t\t\t\t    생일 \t  \n";
	public static final String Line2 = "---------------------------------------\n";

	public static final String table = "스튜디오명 \t 예약자 \t 금일 예약 시간\t   \n";

	public static final String Function_ReservationSituation_Title = "현재 예약 현황 \n";
	public static final String Card = "이미지url \t 스튜디오명 \t 주소\t 좋아요 버튼 \t   \n";

	private StringBuffer buffer = new StringBuffer();

	public String getDisplay() {
		ArrayList<Function> functions = hole.getFunctions();
		makeSection(new Function(1, Section));

		for (Function function : functions) {
			makeHeader(function);
			makeBody(function);
			makeFooter(function);
		}

		return buffer.toString();
	}

// 직접적으로 보이는 부분들
	private void makeFooter(Function funtion) {
		buffer.append("\n");
	}

	private void makeBody(Function function) {
		ArrayList<Customer> customers = function.getCustomers();
		ArrayList<Studio> studios = function.getStudios();
		if (function.getFuntionName() == "나의 프로필 정보") {
			for (int i = 0; i < customers.size(); i++) {
				Customer customer = customers.get(i);
				buffer.append(customer.getCustomerName());
				buffer.append("\t");
				buffer.append(customer.getCustomerId());
				buffer.append("\t");
				buffer.append(customer.getCustomerPhoneNum());
				buffer.append("\t\t");
				buffer.append(customer.getCustomerMail());
				buffer.append("@naver.com");
				buffer.append("\t\t");
				buffer.append(customer.getBirthDay());
				buffer.append("\n");
			}
		} else if (function.getFuntionName() == "금일 방문 일정") {
			for (int i = 0; i < studios.size(); i++) {
				Studio studio = studios.get(i);

				buffer.append(studio.getStudioName());
				buffer.append("\t");
				buffer.append(studio.getCustomerName());
				buffer.append("\t");
//				-> 이 부분에서 customer 를 연결하는 방식으로 하여야 한다.
				buffer.append(studio.getReservationDate());
				buffer.append("\n");
			}
		} else if (function.getFuntionName() == "현재 예약 현황") {
			for (int i = 0; i < customers.size(); i++) {
				Customer customer = customers.get(i);
				buffer.append(customer.getCustomerName());
				buffer.append("\t");
				buffer.append(customer.getCustomerId());
				buffer.append("\t");

				buffer.append("\n");
			}
		}

	}

	private void makeHeader(Function function) {

		buffer.append(function.getFuntionName());
		buffer.append(WeddeingDisplay.Line);
		if (function.getFuntionName() == "나의 프로필 정보") {
			buffer.append(WeddeingDisplay.HEADER);
			buffer.append(WeddeingDisplay.Line2);
		} else if (function.getFuntionName() == "금일 방문 일정") {
			buffer.append(WeddeingDisplay.table);
			buffer.append(WeddeingDisplay.Line2);
		} else if (function.getFuntionName() == "현재 예약 현황") {
			buffer.append(WeddeingDisplay.Card);
			buffer.append(WeddeingDisplay.Line2);
		}

	}

	private void makeSection(Function function) {
		buffer.append(WeddeingDisplay.Section);
	}

	// -----
	private void getAuthLevel(Customer customer, Function function) {
		ArrayList<Authority> authList = customer.getAuthorities();
		int majorId = customer.getMajorfunction().getFuctionId();
		LevelEvaluation[] levelEvaluations = { new coupleEvaluation(), new StatusEvluation() };

		for (int i = 0; i < authList.size(); i++) {
			Authority authority = authList.get(i);
			if (authority.getFunction().getFunctionType() == Constant.myProfile) {
				String level = null;

				buffer.append(authority.getAuthority());
				buffer.append("\t");
				buffer.append(level);
				buffer.append("\t");
			} else if (authority.getFunction().getFunctionType() == Constant.VisitPlan) {
				String level = null;
				buffer.append(authority.getAuthority());
				buffer.append("\t");
				buffer.append(level);
				buffer.append("\t");
			} else if (authority.getFunction().getFunctionType() == Constant.ReservationSituation) {
				String level = null;
				buffer.append(authority.getAuthority());
				buffer.append("\t");
				buffer.append(level);
				buffer.append("\t");
			}

		}

	}
}
