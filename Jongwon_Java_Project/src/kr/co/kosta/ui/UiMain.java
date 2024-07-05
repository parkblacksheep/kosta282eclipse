package kr.co.kosta.ui;

import java.util.ArrayList;

import kr.co.kosta.Weding.Authority;
import kr.co.kosta.Weding.Customer;
import kr.co.kosta.Weding.Function;
import kr.co.kosta.Weding.Hole;
import kr.co.kosta.Weding.view.WeddeingDisplay;
import kr.co.kosta.utils.Constant;

public class UiMain {
	Hole hole = Hole.getInstance();
	Function myProfile;
	Function VisitPlan;
	Function ReservationSituation;

	WeddeingDisplay weddeingDisplay = new WeddeingDisplay();

	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		uiMain.createFunction();
		uiMain.createCustomer();

		String display = uiMain.weddeingDisplay.getDisplay();
		System.out.println(display);
	}

	private void createCustomer() {
		ArrayList<Function> functions = new ArrayList<>();
		Customer customer1 = new Customer("권혁준", 20240704);

		hole.addCustomer(customer1);
		myProfile.register(customer1);
		VisitPlan.register(customer1);

	}

	private void addAuthForCustomer(Customer customer, Function function, int authority) {
		Authority authList = new Authority(customer.getCustomerId(), function, authority);
		customer.addFunctionAuthority(authList);
	}

	private void createFunction() {
		myProfile = new Function(Constant.myProfile, "나의 프로필 정보");
		VisitPlan = new Function(Constant.VisitPlan, "금일 방문 일정");
		ReservationSituation = new Function(Constant.ReservationSituation, "현재 예약 현황");

		hole.addFunction(myProfile);
		hole.addFunction(VisitPlan);
		hole.addFunction(ReservationSituation);
	}
}
