package Feb23;

public class Animal {
	static int age = 0;
	public String name;
	@Override
	public String toString() {
		return "Animal [name=" + name + ", speak=" + speak + ", Age="+age+"]";
	}

	public String speak;

	static void incrementAge() {
		age++;
	}

	public Animal() { // Constructor without passing any values

	}

	public Animal(String name1) { // Constructor with passing single value
		name = name1;
	}

	public Animal(String name1, String speak1) { // Constructor with passing more value
		name = name1;
		speak = speak1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	void display() {
		System.out.println("Animal name is " + name + " " + speak);
	}

	public static void main(String args[]) {
		Animal a = new Animal("Dog");
		Animal a1 = new Animal("Cat", "MEOw");
		Animal a2 = new Animal();
		Animal a3 = new Animal();

		a.setName("Dog");
		a.display();

		a1.setName("Cat");
		a1.display();

		a2.setName("Cow");
		a2.display();

		a3.setName("Elephant");

		a.incrementAge();
		a.display();
		System.out.println(a);

	}

}