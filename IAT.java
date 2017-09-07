interface IAT{}

class Person implements IAT {
	String name;
	IAT mom;
	IAT dad;
		
		
	Person(String name, IAT mom, IAT dad){
		this.name= name;
		this.mom=mom;
		this.dad=dad;
			
	}
}
	
class Unknown implements IAT{
	Unknown(){}
}
	
class ExamplesIAT{
	ExamplesIAT(){}
	
	IAT unknown = new Unknown();
	IAT cecilia = new Person ("Cecilia", unknown, unknown);
	IAT cesarSr = new Person ("Cesar",unknown, unknown);
	IAT mariana = new Person ("Mariana",unknown, unknown);
	IAT presco = new Person ("Presco",unknown, unknown);
	IAT cesar = new Person ("Cesar",cecilia, cesarSr);
	IAT leonita = new Person ("Leonita",mariana, presco);
	IAT jezza = new Person ("Jezza",leonita, cesar);
		
}
	
