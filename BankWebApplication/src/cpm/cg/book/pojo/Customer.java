package cpm.cg.book.pojo;

public class Customer {
	private int customerId;
	private String customerName;
	
	
	private long contactnumber;
	private String emailId;
	private String nationality;
	private String gender;
	private long balance;
	private static int custId;
	static {
		 custId=100;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactnumber="
				+ contactnumber + ", emailId=" + emailId + ", nationality=" + nationality + ", gender=" + gender
				+ ", balance=" + balance + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public static int getCustId() {
		return custId;
	}
	public static void setCustId(int custId) {
		Customer.custId = custId;
	}
	public Customer(int customerId, String customerName, long contactnumber, String emailId, String nationality,
			String gender, long balance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactnumber = contactnumber;
		this.emailId = emailId;
		this.nationality = nationality;
		this.gender = gender;
		this.balance = balance;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
}
