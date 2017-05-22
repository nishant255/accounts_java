
public class Account {
	private int accountNumber;
    private int uid;
    private String typeOfAccount;
    private String subTypeOfAccount;
    private float balance;
    
    public Account(int accountNumber, int uid, String typeOfAccount, String subTypeOfAccount, float balance) {
        this.accountNumber = accountNumber;
        this.uid = uid;
        this.typeOfAccount = typeOfAccount;  
        this.subTypeOfAccount = subTypeOfAccount;
        this.balance = balance;
    }
    
    public Account(){}
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }        

    public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public String getSubTypeOfAccount() {
		return subTypeOfAccount;
	}

	public void setSubTypeOfAccount(String subTypeOfAccount) {
		this.subTypeOfAccount = subTypeOfAccount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", uid=" + uid + ", typeOfAccount=" + typeOfAccount
				+ ", subTypeOfAccount=" + subTypeOfAccount + ", balance=" + balance + "]";
	}
	
	

}
