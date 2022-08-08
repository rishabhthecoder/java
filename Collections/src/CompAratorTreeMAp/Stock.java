package CompAratorTreeMAp;

public class Stock {

	private int SNo;
	private String Name;
	private float price;
	private int code;
	public int getSNo() {
		return SNo;
	}
	public void setSNo(int sNo) {
		SNo = sNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setExpiry(int expiry) {
		code = expiry;
	}
	public Stock(int sNo, String name, float price, int code) {
		super();
		this.SNo = sNo;
		this.Name = name;
		this.price = price;
		this.code = code;
	}
	public String toString() {
		return SNo+" "+Name+" "+price+" "+code;
	}
}
