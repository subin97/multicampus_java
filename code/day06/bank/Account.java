package bank;

public class Account {
	private String id;		// 계좌번호
	private String owner;	// 계좌 소유자
	private int balance;	// 잔액

	// toString
	@Override
	public String toString() {
		return "Account [계좌번호=" + id + ", 소유자=" + owner + ", 잔액=" + balance + "]";
	}

	// 생성자
	public Account() {
		super();
	}
	public Account(String id, String owner, int balance) {
		super();
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}

	// Getters & Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
