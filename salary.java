package yakup;

class Salary{
	public double rate;
	public int weeklyHour;
	public double taxRate;
	
	public void setInfo(double hourlyRate,int numberOfHours, double tax) {	
		rate = hourlyRate;
		weeklyHour = numberOfHours;
		taxRate = tax;
	}
	//salary before tax
	public double salary() {
		//annual salary
		return rate * weeklyHour * 52;
	}
	public double totalTax() {
		return salary() * taxRate;
	}
	//salary after tax
	public double salaryAfterTax() {
		return salary() - totalTax();
	}
	//allows us to print salary object
	public String toString() {
		return "salary [rate= $" + rate 
				+ ", weeklyHour=" + weeklyHour 
				+ ", taxRate= $" + taxRate 
				+ ", salary= $"+salary()
				+", total tax= $"+totalTax()
				+", salary after tax= $"+salaryAfterTax()+"]";
	}
	
}
public class salary{
	public static void main(String[] args) {
		Salary salary = new Salary();
		Salary salary2 = new Salary();
		
		salary.setInfo(45,40,0.3);
		System.out.println(salary);
		
		salary2.setInfo(55,45,0.28);
		System.out.println(salary2);
	}
}
