package kr.co.kosta.Weding;

public class Authority {
	private int customerId;
	private Function function;
	private int authority;

	public Authority(int customerId, Function function, int authority) {
		this.customerId = customerId;
		this.function = function;
		this.authority = authority;
	}

	public int getCustomerId() {
		return customerId;
	}

	public Function getFunction() {
		return function;
	}

	public int getAuthority() {
		return authority;
	}

}
