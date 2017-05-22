import java.util.ArrayList;

public class User{
	private int uid;
	private String name;
    private String email;    
    ArrayList<Account> account = new ArrayList<Account>();    

    
//	public User(int uid, String name, String email) {
//		super();
//		this.uid = uid;
//		this.name = name;
//		this.email = email;
////		this.totalUser.add(this);
//	}

    public User(){
    	
    }
	public int getUid() {
		return uid;
	}

	public User(int uid, String name, String email) {		
		this.uid = uid;
		this.name = name;
		this.email = email;			
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Account> getAccount() {
		return account;
	}	



	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}
	
	public void addAccount(Account account) {
		this.account.add(account);
	}

	
	public double totalBalance(){
		double balance = 0.0;
		for (int i = 0; i < this.account.size(); i++) {
			balance += this.account.get(i).getBalance();
		}
		return balance;
	}
		
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", account=" + account + "]";
	}
    
    
	
}


