


class Person {
	String name;
	int age;
	String gender;
	Address address;
	
	Person(String name, int age, String gender, Address address){
		this.name= name;
		this.age=age;
		this.gender=gender;
		this.address=address;
	}
}

class ExamplesPerson{
	ExamplesPerson(){}
	
	Address t = new Address ("Warwick", "RI");
	Person tim = new Person("Tim", 20, "M",this.t);
	Address p = new Address ("Boston", "MA");
	Person pat = new Person("Pat", 19, "F",this.p);
	Address k = new Address ("Boston", "MA");
	Person kim = new Person("Kim", 17, "F",this.k);
	Address d = new Address ("Nashua", "NH");
	Person dan = new Person("Dan", 22, "M",this.d);
	Address j = new Address ("New York", "NY");
	Person jezza = new Person("Jezza", 19, "M",this.j);
	Address a = new Address ("Los Angeles", "CA");
	Person allysa = new Person("Alyssa", 19, "F",this.a);
}

class Address{
	 String city;
	 String state;
	 
	 Address(String city, String state){
		 this.city = city;
		 this.state = state;
	 }
 }
