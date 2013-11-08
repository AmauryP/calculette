package calculette;


public class Calculette {
	int memoire1;
	int memoire2;
	int resultat;
	String operation;
	String part;



	public int resultat() {
		
		
		Addition addition = new Addition();
		Soustraction soustraction = new Soustraction();
		Diviser diviser = new Diviser();
		Multiplication multiplication = new Multiplication();
		
		
		if (this.operation=="adition") {
			return addition.add (memoire1, memoire2);
		}
		if (this.operation=="soustraction") {
			return soustraction.soustraire (memoire1, memoire2);
		}
		
		if (this.operation=="diviser"){
			return diviser.diviser (memoire1, memoire2);
		}
		else if (this.operation=="multiplier"){
			return multiplication.multiplier (memoire1, memoire2);
		}
		else {return this.resultat;
		}
	}

	public void click (int i) {
		if (this.part=="part2"){
			this.memoire2 = this.memoire2*10 + i; 
		}
		else
		{this.memoire1=memoire1*10 + i;
		this.resultat=memoire1;
		}
	}


	public void click (String i) {
		if (i=="+") {
			this.operation="adition";
			this.part = "part2" ;
		}
		else if (i=="-") {
			this.operation="soustraction";
			this.part = "part2" ;
		}
		else if (i=="/") {
			this.operation="diviser";
			this.part = "part2" ;
		}
		else if (i=="*") {
			this.operation="multiplier";
			this.part = "part2" ;
		}
		else 
		{this.operation="nombre";
		}

	}

}




