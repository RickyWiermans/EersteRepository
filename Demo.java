class Demo{
	public static void main(String[] args){
		proberen();

	Persoon jojo //declaratie;
	Persoon abc = new Person(); 	// instantiatie initialiseren
	jojo = abc; //initialisatie
	abc.aantalHoofden = 4;
	Systemm.out.println(abd.aantalHoofden);

	}
	static void proberen(){
		System.out.println("Hij doet het");
	}

	//kopjeKleinerMaken
	static void kopjeKleinerMaken(Persoon persoon){
	persoon.aantalHoofden -= 1;
	}
}

class Persoon{
	int aantalHoofden;
}