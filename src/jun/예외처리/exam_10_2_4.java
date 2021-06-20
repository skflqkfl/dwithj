package jun.예외처리;

public class exam_10_2_4 {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Cat cat = new Cat();
		
		if(dog instanceof Cat) {
			cat = (Cat) dog;
			
		}
		
		
		
	} 
}
class Animal {
	String name;
}
class Dog extends Animal {
	
}
class Cat extends Animal {
	
}
class Remote {
	String name;
}
class Audio extends Remote {
	
}