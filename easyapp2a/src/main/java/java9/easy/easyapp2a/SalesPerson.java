package java9.easy.easyapp2a;

public class SalesPerson implements Comparable<SalesPerson>{
	private Integer id;
	private String name;
	private Integer saleAmount;
	private String grade;
	
	
	
	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SalesPerson(Integer id, String name, Integer saleAmount, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.saleAmount = saleAmount;
		this.grade = grade;
	}
    

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSaleAmount() {
		return saleAmount;
	}


	public void setSaleAmount(Integer saleAmount) {
		this.saleAmount = saleAmount;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
	 String output=String.format("%-5s %-20s %-10s %-10s",id,name,saleAmount,grade);
	 return output;
	}
    
	
	public int compareTo(SalesPerson salesPerson)
	{
		return this.saleAmount.compareTo(salesPerson.saleAmount);
	}


	@Override
	public boolean equals(Object obj) {
		SalesPerson other = (SalesPerson) obj;
		if(this.hashCode()==other.hashCode())
		return true;
		else
		return false;
	}

	@Override
	public int hashCode() {
		return id;
	}


	public SalesPerson(Integer id, String name, Integer saleAmount) {
		super();
		this.id = id;
		this.name = name;
		this.saleAmount = saleAmount;
	}
	

}
