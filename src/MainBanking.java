import java.util.Scanner;

public class MainBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalUser tUser = new TotalUser();
		User bob = new User(101, "Bob", "bob@bob.com");	
		tUser.addUser(bob);
		User amy = new User(102, "Amy", "amy@amy.com");	
		tUser.addUser(amy);
		
		Account bobChecking = new Account(1001, 101, "Bank", "Checking", 1000);
		Account bobSaving = new Account(1002, 101, "Bank", "Saving", 2000);
		Account bob401K = new Account(1003, 101, "401K", null, 10000);
		Account amyCD = new Account(1004, 102, "Bank", "CD", 3000);
		Account amyBonds = new Account(1005, 102, "Brokerage", "Bonds", 1000);
		Account amyMutualFunds = new Account(1006, 102, "Brokerage", "Mutual Funds", 3000);
		Account amy401K = new Account(1007, 102, "401K", null, 20000);
		
		bob.addAccount(bobChecking);
		bob.addAccount(bobSaving);
		bob.addAccount(bob401K);
		amy.addAccount(amyCD);
		amy.addAccount(amyBonds);
		amy.addAccount(amyMutualFunds);
		amy.addAccount(amy401K);
		
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		boolean exit = false;
		do {
			System.out.println("Select Choice");
			System.out.println("1. Total Value for Specified User.");
			System.out.println("2. Print account chart for all Users.");
			System.out.println("3. Exit Program.");
			while (!sc.hasNextInt()) {
				System.out.println("Please Enter Valid Integer.");
				sc.next();
			}
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				String userName = sc.next();
			
				for (int i = 0; i < tUser.getUserCount(); i++) {
					if(tUser.getUser(i).getName().equals(userName)){
						System.out.println(tUser.getUser(i).toString());
					}
				
				}
				
				break;	
			case 2:
				
				for (int i = 0; i < tUser.getUserCount(); i++) {
					System.out.println(tUser.getUser(i).toString());
				}
				
				break;
			case 3:
				exit = true;
				System.out.println("Thank you! See you next time.");
				break;
			default:
				System.out.println("Default");
				break;
			}
		} while (choice < 0 || choice > 3 || exit == false);		
		
	}

}
