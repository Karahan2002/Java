package yakup;

class employee{
	public String name,jobTitle;
	public int id;
	public double salary;
	
	public employee(String name) {
		this.name = name;
	}
	public employee(String name,String jobTitle) {
		this(name);
		this.jobTitle = jobTitle;
	}
	public employee(String name,String jobTitle,int id) {
		this(name,jobTitle);
		this.id = id;
	}
	public employee(String name,String jobTitle,int id,double salary) {
		this(name,jobTitle,id);
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", jobTitle=" + jobTitle + ", id=" + id + ", salary= $" + salary + "]";
	}
	
}
public class multiConstructor{
	public static void main(String[] args) {
		employee employee1 = new employee("yakup","SDET",45,120000);
		System.out.println(employee1);
	}
}
