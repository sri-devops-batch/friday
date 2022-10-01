package entity;

public class Account {
private long accountNumber;
private String userName;
private int password;
private int balance;
private KYCVerification kycDetails;
private ContactDetails contactDetails;
private int cashback;
private Account a;

public Account() {
	super();
	
}
public Account(long accountNumber,String userName,int password, int balance, KYCVerification kycDetails, ContactDetails contactDetails,int cashback) {
	super();
	this.accountNumber = accountNumber;
	this.userName = userName;
	this.password = password;
	this.balance = balance;
	this.kycDetails= kycDetails;
	this.contactDetails = contactDetails;
	this.cashback = cashback;
	
}
public long getAccountNumber(){
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
	
}
public String getuserName(){
	return userName;
}
public void setuserName(String userName) {
	this.userName = userName;
	
}
public int getpassword(){
	return password;
}
public void setpassword(int password) {
	this.password= password;
	
}
public int getBalance(){
	return balance;
}
public void setbalance(int balance) {
	this.balance= balance;
	
}
public KYCVerification getKYCVerification () {
	return kycDetails;
}
public void setKYCVerification (KYCVerification  kycDetails) {
	this.kycDetails = kycDetails ;
}
public  ContactDetails getContactDetails() {
	return  contactDetails;
}
public void setContactDetails(ContactDetails  contactDetails) {
	this. contactDetails =  contactDetails;
}
public int getcashback(){
	return cashback;
}
public void setcashback(int cashback) {
	this.cashback = cashback;
	
}@Override
	public String toString() {
		return "Account [accountNumber ="+accountNumber+",userName="+userName+",password="+password+",balance="+balance+",kycDetails="+kycDetails+",contactDetails="+contactDetails+",cashback="+cashback+"]";

}
}
