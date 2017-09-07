interface  IMenu {}

class Soup implements IMenu{
	Info info;
	boolean isVeg;
	
	Soup(Info info, boolean isVeg){
		this.info=info;
		this.isVeg=isVeg;
	}
}

class Salad implements IMenu{
	Info info;
	boolean isVeg;
	String dressing;
	
	Salad(Info info, boolean isVeg, String dressing){
		this.info=info;
		this.isVeg=isVeg;
		this.dressing=dressing;
	}
}

class Sandwich implements IMenu{
	Info info;
	String kindOfBread;
	String filling;
	
	Sandwich(Info info, String kindOfBread, String filling){
		this.info=info;
		this.kindOfBread=kindOfBread;
		this.filling=filling;
	}
}

class Info{
	String name;
	int price;
	
	Info(String name, int price){
		this.name=name;
		this.price=price;
	}
}

class ExamplesMenu{
	ExamplesMenu(){}
	
	Info mush=new Info("Mushroom Soup", 200);
	IMenu mushroom = new Soup(this.mush,true);
	
	Info corn=new Info("Corn Soup", 200);
	IMenu cornS = new Soup(this.corn,true);
	
	Info mac=new Info("Macaroni Salad", 150);
	IMenu maca = new Salad(this.mac, true, "mayo");
	
	Info chick = new Info ("Chicken Salad", 180);
	IMenu chicken = new Salad (this.chick, false, "mayo");
	
	Info hb= new Info ("Ham and Egg Sandwich",200);
	IMenu hambac = new Sandwich(this.hb,"Wheat Bread", "Ham and Egg");
	
	Info bc= new Info ("Bacon and Cheese Sandwich",200);
	IMenu bacche = new Sandwich(this.bc,"Wheat Bread", "Bacon and Cheese");
		
}
