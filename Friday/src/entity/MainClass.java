package entity;
import java.util.*;
import entity.Account;
import entity.KYCVerification;
import entity.ContactDetails;
import java.util.Random;

public class MainClass {
Account allAccount[]=new Account[5000];
int noOfAccountEntry=0;
Scanner sc = new Scanner(System.in);//for string
Scanner sc1 = new Scanner(System.in);//for nonString
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MainClass app = new MainClass();
   while(true) {
	   System.out.println("\n\n=========KYCBankDetails=================\n\n");
	   System.out.println("0.Exit");
	   System.out.println("1.Submit user details");
	   System.out.println("2.do deposit operation");
	   System.out.println("3.do withdrawal operation");
	   System.out.println("4.print user all details");
	   System.out.println("5.print user contact details");
	   System.out.println("6.print user KYC document details");
	   System.out.println("7.print balance");
	   System.out.println("8.change mobile number");
	   System.out.println("9.change mail id");
	   System.out.println("Enter option[0-9]");
	   switch(app.sc.nextInt()){
	   case 1:
		   app.SubmitUserDetails();
		   break;
	   case 2:
		   app.deposit();
		   break;
	 
	   case 3:
		   app.viewalluserdetails();
		   break;
	   case 4:
		   app.ContactDetails();
		   break;
	   case 5:
		   app.viewkycDetails();
		   break;
	   case 6:
		   app.userBalance();
		   break;
	   case 7:
		   app.changeMobileNumber();
		   break;
	   default:
		   System.out.println("Exit");
		   System.exit(0);
	   }//Switch end
   }//While end
	}private void viewalluserdetails() {
		// TODO Auto-generated method stub
		
	}
	//main end
	public void SubmitUserDetails()
	{
		Random myRandom=new Random();
		long AccountNumber=myRandom.nextLong();
		System.out.println("Enter the user name ");
		String username=sc1.nextLine();
		System.out.println("Enter the password");
		int password=sc.nextInt();
		System.out.println("Enter the balance");
		int balance=sc.nextInt();
		System.out.println("Enter cashback");
		int cashback=sc.nextInt();
		System.out.println("Enter the PAN Number");
		String panNumber=sc1.nextLine();
		System.out.println("Enter the Aadhar Number");
		long aadharNumber=sc.nextLong();
		System.out.println("Enter the Document Type");
		String documenttype=sc1.nextLine();
		System.out.println("Enter the Document Number");
		String documentNumber=sc1.nextLine();
	    System.out.println("Enter the house Number");
	    String houseNumber=sc1.nextLine();
		System.out.println("Enter the Locality Name");
		String localityName=sc1.nextLine();
		System.out.println("Enter the City Name");
		String cityName=sc1.nextLine();
		System.out.println("Enter the State Name");
		String stateName=sc1.nextLine();
		System.out.println("Enter the Country Name");
		String countryName=sc1.nextLine();
		System.out.println("Enter the pin Code");
		long pinCode =sc.nextLong();
		System.out.println("Enter the Mobile Number");
		long mobileNumber=sc.nextLong();
		System.out.println("Enter the emailId");
		String emailId=sc1.nextLine();
	
		Account a=new Account(AccountNumber,username,password,balance,null, null, cashback);
		KYCVerification kycDetails=new KYCVerification(panNumber,aadharNumber,documenttype,documentNumber);
		ContactDetails contactDetails=new  ContactDetails(houseNumber,localityName,cityName,stateName,countryName,pinCode,mobileNumber,emailId);
	
		
		a.setKYCVerification(kycDetails);
		a.setContactDetails(contactDetails);
		allAccount[noOfAccountEntry++]=a;
		System.out.println(""+a);
		System.out.println("Added in the list");
	}
	public void printall(Account a) {
		System.out.println("\n"+a.getAccountNumber()+"\t");
		System.out.println(a.getuserName()+"\t");
		System.out.println(a.getBalance()+"\t");
		
		System.out.println("\n=======================\n");
	for(int i=0;i<noOfAccountEntry;i++ ) {
		Account a1=allAccount[i];
		printall(a);
	}
	
	}
		public void deposit() {
		System.out.println("Enter the Deposit Amount");
		int amount=sc.nextInt();
		System.out.println("Enter the Account number to deposit");
		int searchAccNumber=sc.nextInt();
		Account account=null;
		boolean foundAccount= false;
		
		for (int i =0;i<noOfAccountEntry;i++) {
			Account a =allAccount[i];
			if(a.getAccountNumber()==searchAccNumber);
			{
				account =a;
				foundAccount=true;
			}
		}
		if(foundAccount) {
			account.setbalance(account.getBalance()+amount);
		}
		System.out.println("The amount has been deposited ");
		System.out.println("Check Balance");
		System.out.println(account.getAccountNumber()+"-"+account.getBalance());
		}
		public Account printAccountDetails(int searchAccNumber) {
			for(int i=0;i<noOfAccountEntry;i++) {
				Account a =allAccount[i];
				boolean isFound=(a.getAccountNumber()==searchAccNumber)?true:false;
				if(isFound)
				{
					return a;
				}
			}
			return null;
		}
	
	public void ContactDetails()	
	{
	System.out.println("Enter the account number");	
	int  searchaccNumber=sc.nextInt();	
	Account a =printAccountDetails(searchaccNumber);	
	System.out.println(a.getContactDetails());	
	}
	
	
	
	public void viewkycDetails()	
	{
	System.out.println("Enter the account Number");	
	int searchaccNo= sc.nextInt();	
	Account a = printAccountDetails(searchaccNo);	
	System.out.println(a.getKYCVerification());	
	}
	
	
	
	
	public void userBalance()	
	{	
	System.out.println("Enter the Account number");	
	int searchAccNumber= sc.nextInt();	
	Account a=printAccountDetails(searchAccNumber);	
	System.out.println(a.getBalance());
	}	
	
	
	
	public void changeMobileNumber()	
	{
	System.out.println("Enter the account number");	
	int searchAccNumber = sc.nextInt();	
		
	Account a = printAccountDetails(searchAccNumber);	
	long previousMobileNumber = a.getContactDetails().getmobileNumber();	
	System.out.println("Enter new mobile number");
	long newmobileno=sc.nextLong();
	System.out.println();	
	a.getContactDetails().setmobileNumber(newmobileno);
	System.out.println("---->>new mobileno after updation:-");
	System.out.println(a);
	}
	public void changeEmailId() {
		System.out.println("Enter account no");
		String emailId=sc1.nextLine();
		Account a=new Account();
		System.out.println("Enter new emailId");
		String newmailid = sc1.nextLine();
		System.out.println(a.getContactDetails());
		a.getContactDetails().setemailId(newmailid);
		
		System.out.println("---->>email after updation:-");
		System.out.println(a);
	}
	
	}
	
	
	



