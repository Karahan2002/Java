package yakup;

interface hunt{
	void hunting();
}
interface flyable{
	abstract void fly();
	
}
interface swimmable{
	void swim();
}
interface playable{
	void friendly();
}
abstract class animal{
	public String name;
	public animal(String name) {
		this.name = name;
	}
	public abstract void eat();
	public String toString() {
		return"Animal [name = "+name+"]";
	}
}
class dog extends animal implements playable{

	public dog() {
		super("Dog");
	}
	@Override
	public void eat() {
		System.out.println(name+" is eating");
	}
	public void bark() {
		System.out.println(name+" is barking");
	}
	@Override
	public void friendly() {
		System.out.println(name+" is very friendly");
	}
}
class Lion extends animal implements hunt{
	public Lion() {
		super("Lion");
	}
	@Override
	public void eat() {
		System.out.println(name+" is eating a deer");
	}
	@Override
	public void hunting() {
		// TODO Auto-generated method stub
		
	}
	
}
class eagle extends animal implements hunt,flyable{

	public eagle() {
		super("eagle");
		
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating");
	}

	@Override
	public void hunting() {
		System.out.println(name+" is hunting");
	}

	@Override
	public void fly() {
		System.out.println(name+" is flying");
	}
	
}
class dolphin extends animal implements hunt,swimmable{

	public dolphin() {
		super("dolphin");
	}

	@Override
	public void hunting() {
		System.out.println(name+" is hunting");
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating");
	}

	@Override
	public void swim() {
		System.out.println(name+" is swimming");
	}
	
}
class duck extends animal implements flyable,swimmable,playable{

	public duck() {
		super("duck");
	}

	@Override
	public void swim() {
		System.out.println(name+" is swimming");
		
	}

	@Override
	public void fly() {
		System.out.println(name+" is flying");
	}

	@Override
	public void eat() {
		System.out.println(name+" is eating");
	}

	@Override
	public void friendly() {
		System.out.println(name+" is friendly");
	}
	
}
public class extendsImplements{
	public static void main(String[] args) {
		
	}
}
