package Encapsulation;

public class Demo {

	public static void main(String[] args) {
		
//		Part:-1
		System.out.println("Part:-1");
		Student s1 = new Student();
		s1.setName("Rani");
		System.out.println("Student name is : "+ s1.getName());
			
		s1.setAge(22);
		System.out.println("Student Age is : "+ s1.getAge());
		
		s1.setGrade("A");
		System.out.println("Student Grade is : " + s1.getGrade());
		
		
		
		
		
		
		
//		Part:-2	
		System.out.println("Part:-2");
		Dog d1 = new Dog();
		d1.name = "Tommy";
		d1.species = "Canine";
		d1.breed = "Labrador";
		System.out.println("Dog Name: "+d1.name);
		System.out.println("Dog species: "+d1.species);
		System.out.println("Dog breed: "+d1.breed);
		d1.makeSound();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		
		Cat c1 = new Cat();
		c1.name = "pushi";
		c1.species = "Feline";
		System.out.println("Cat Name: "+d1.name);
		System.out.println("cat species: "+d1.species);
		c1.makeSound();
		
	}
}
