package ex05;

public class User implements Runnable {
	BankAccount account;
	public User(BankAccount account) {
		this.account=account;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			account.deposit(10000);
			try {
				Thread.sleep(99);
			}catch(InterruptedException e) {
				
			}
			account.withdraw(10000);
			if(account.getBalance()<0) {
				System.out.println("오류 발생!");
			}
		}
	}
}
