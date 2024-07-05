package kr.co.kosta.ui;

import java.time.LocalDate;

import kr.co.kosta.Weding.Authority;
import kr.co.kosta.Weding.Customer;
import kr.co.kosta.Weding.Function;
import kr.co.kosta.Weding.Hole;
import kr.co.kosta.Weding.Studio;
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
		// 기능 생성
		uiMain.createFunction();
		// 고객 생성
		uiMain.createCustomer();
		// 스튜디오 생성
		uiMain.createStudio();

		// 웨딩 디스플레이를 출력함
		String display = uiMain.weddeingDisplay.getDisplay();
		System.out.println(display);
	}

	private void createStudio() {
		LocalDate reservationDate1 = LocalDate.of(2024, 3, 5);
		LocalDate reservationDate2 = LocalDate.of(2024, 5, 7);
		Studio studio1 = new Studio("S스튜디오", reservationDate1);
		Studio studio2 = new Studio("T스튜디오", reservationDate2);

		hole.addStudio(studio1);
		myProfile.register(studio1);
		VisitPlan.register(studio1);
		ReservationSituation.register(studio1);

		hole.addStudio(studio2);
		myProfile.register(studio2);
		VisitPlan.register(studio2);
		ReservationSituation.register(studio2);
//		addCustomerNameForStudio(studio1, );
	}

	private void createCustomer() {
		// 고객 생성
		Customer customer1 = new Customer("권상민", 20240704, "01026467154", "p384438", "970305");
		Customer customer2 = new Customer("백종원", 20240705, "01055627154", "dqwe958", "941215");
		Customer customer3 = new Customer("차은우", 20240706, "01078957154", "3bvkw2", "460815");
		Customer customer4 = new Customer("김지우", 20240707, "01084267154", "8946bmj", "467851");

		hole.addCustomer(customer1);
		hole.addCustomer(customer2);
		hole.addCustomer(customer3);
		hole.addCustomer(customer4);

		myProfile.register(customer1);
		VisitPlan.register(customer1);
		ReservationSituation.register(customer1);

		myProfile.register(customer2);
		VisitPlan.register(customer2);
		ReservationSituation.register(customer2);

		myProfile.register(customer3);
		VisitPlan.register(customer3);
		ReservationSituation.register(customer3);

		myProfile.register(customer4);
		VisitPlan.register(customer4);
		ReservationSituation.register(customer4);

		addAuthForCustomer(customer1, myProfile, 1000);
		addAuthForCustomer(customer1, VisitPlan, 1000);
		addAuthForCustomer(customer1, ReservationSituation, 1000);

		addAuthForCustomer(customer2, myProfile, 1001);
		addAuthForCustomer(customer2, VisitPlan, 1001);
		addAuthForCustomer(customer2, ReservationSituation, 1001);

		addAuthForCustomer(customer3, myProfile, 1002);
		addAuthForCustomer(customer3, VisitPlan, 1002);
		addAuthForCustomer(customer3, ReservationSituation, 1002);

		addAuthForCustomer(customer4, myProfile, 1002);
		addAuthForCustomer(customer4, VisitPlan, 1002);
		addAuthForCustomer(customer4, ReservationSituation, 1002);
	}

	private void addAuthForCustomer(Customer customer, Function function, int authority) {
		// 권한을 고객에게 부여
		Authority authList = new Authority(customer.getCustomerId(), function, authority);
		customer.addFunctionAuthority(authList);
	}

	private void addCustomerNameForStudio(Studio studio, String customerName) {
		studio.addCustomers(customerName);
	}

	private void createFunction() {
		// 기능을 추가하는 곳
		myProfile = new Function(Constant.myProfile, "나의 프로필 정보");
		VisitPlan = new Function(Constant.VisitPlan, "금일 방문 일정");
		ReservationSituation = new Function(Constant.ReservationSituation, "현재 예약 현황");

		hole.addFunction(myProfile);
		hole.addFunction(VisitPlan);
		hole.addFunction(ReservationSituation);

	}
}
