package entity;

public class ContactDetails {
	private String houseNumber;
	private String localityName;
	private String cityName;
	private String stateName;
	private String countryName;
	private long pinCode;
	private long mobileNumber;
	private String emailId;
	private Account a;
	public ContactDetails( String houseNumber,String localityName,String cityName,String stateName,String countryName,long pinCode,long mobileNumber,String emailId )
	{
		super();
		this.houseNumber =houseNumber;
		this.localityName =localityName;
		this.cityName=cityName;
		this.stateName=stateName;
		this.countryName=countryName;
		this.pinCode=pinCode;
		this.mobileNumber=mobileNumber;
		this.emailId=emailId;
	}
	public ContactDetails() {
		super();
	}
	 public Account getA() {
		 return a;
	 }
	 public void setA(Account a) {
		 this.a = a;
	 }
	 public String gethouseNumber() {
		 return houseNumber;
	 }
	 public void sethouseNumber(String houseNumber) {
		 this.houseNumber=houseNumber;
	 }
	 public String getlocalityName() {
		 return localityName;
	 }
	 public void setlocalityName(String localityName) {
		 this.localityName=localityName;
	 }
	 public String getcityName() {
		 return cityName;
	 }
	 public void setcityName(String cityName) {
		 this.cityName=cityName;
	 }
	 public String getstateName() {
		 return stateName;
	 }
	 public void setstateName(String stateName) {
		 this.stateName=stateName;
	 }
	 public String getcountryName() {
		 return countryName;
	 }
	 public void setcountryName(String countryName) {
		 this.countryName=countryName;
	 }
	 public long setpinCode() {
		 return pinCode;
	 }
	 public void setpinCode(long pinCode) {
		 this.pinCode=pinCode;
	 }
	 public long getmobileNumber() {
		 return mobileNumber;
	 }
	 public void setmobileNumber(long mobileNumber) {
		 this.mobileNumber=mobileNumber;
	 }
	 public String getemailId() {
		 return emailId;
	 }
	 public void setemailId(String emailId) {
		 this.emailId = emailId;
	 }
	 @Override
		public String toString() {
return "ContactDetails[houseNumber="+ houseNumber+",localityName="+localityName+",cityName="+cityName+",stateName="+stateName+",countryName="+countryName+".pinCode="+pinCode+",mobileNumber="+mobileNumber+",emailId="+emailId+"]";
	 }
}
	
	 
	 

