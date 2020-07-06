
public class Cat extends Animal {

	private String C ;
	
	public Cat(String name) {
		C=name;
	}
	
	public  void introduceYourself() {
		System.out.println("Meow. "+ "I'm a cat. " + "My name is "+ C);
	}
}
