import java.time.LocalDate;

public class Ex2 {

	public static void main(String[] args) {
		Account[] accounts = new Account[5] ;
		for(int i=0; i<accounts.length; ++i) {
			accounts[i]=  new Account(); 
			accounts[i].email =i+ "@gmail.com";
			accounts[i].fullName="Nguyen Van" +i;
			accounts[i].username= i+"1234"; 
			accounts[i].createDate = LocalDate.of(2021, 07, 19);
		}
		for(Account account: accounts) {
			System.out.println(account.fullName +"\n"+ account.username+"\n"+ account.email+"\n"+account.createDate);
		}
	}

}
