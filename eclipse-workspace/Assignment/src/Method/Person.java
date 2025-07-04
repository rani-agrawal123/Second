package Method;

public class Person {
  String name;
  int age;
  
  public Person() {
	  System.out.println("default name is : "+name);
	  System.out.println("default age is :" +age);
  }
  
  public Person(String name, int age) {
	  this.name = name;
	  System.out.println("Name : " + name);
	  
	  this.age = age;
	  System.out.println("Age : "+age);	  
  }
  
  public Person(String name) {
	  this.name = name;
	  this.age = age;
	  age = 18;
	  System.out.println("Name is : " + name + " And Age is : " + age);
  }
}
