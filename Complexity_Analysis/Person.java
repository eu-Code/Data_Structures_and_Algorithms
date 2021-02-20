public class Person{
	private static String name;
	private static int age;
	private static double height;

	public Person(){
		this.name = "Ephrem";
		this.age = 18;
		this.height = 1.90;
	}

	public Person(String name){
		this.name = name;
	}
	public Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setAge(int age){
		this.age =age;
	}

	public int getAge(){
		return this.age;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getHeight(){
		return this.height;
	}
	public void printPerson(){
		System.out.println(name+" is "+age+" years old and his height is "+height);
	}

	public static void main(String[] args){
		Person person = new Person();
		person.printPerson();
		Person person2 = new Person("Daniel");
		person2.printPerson();
		Person person3 = new Person("Henok",12,1.60);
		person3.printPerson();
		Person person4 = new Person();
		person4.setName("Wonzachin");
		person4.printPerson();
		System.out.println(person4.getAge());
	}
}
