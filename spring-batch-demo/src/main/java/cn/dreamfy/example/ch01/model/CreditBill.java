package cn.dreamfy.example.ch01.model;

/**
 * CreditBill model
 * Created by vicfu on 2015/12/30.
 */
public class CreditBill {
	private String accountId;
	private String name;
	private double amount;
	private String date;
	private String address;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CreditBill{" +
				"accountId='" + accountId + '\'' +
				", name='" + name + '\'' +
				", amount=" + amount +
				", date='" + date + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
