package opdrachten;

import java.util.ArrayList;

public class opdrachten
{

    public static void main(String[] args)
    {
	//Opdracht 1:
	// Vul een arraylist met alle even getallen onder de 100
	// Gebruik hier een for-lus voor.
	ArrayList<String> evenGetallen = new ArrayList<String>();

	for (int i = 0; i < 100; i ++) {
	    
	   if (i % 2 == 0) { 
		       System.out.println(i);
	    
	   } else {

	   }
	
	}
	
//Opdracht 2:
//	    Zet de eerste 50 getallen uit de fibonnaci reeks in een arraylist.
//	    De reeks is: 0,1,1,2,3,5,8,13,….
//	    Tip: Zet de eerste twee cijfers in de arraylist en vul de rest m.b.v. een for-lus.
	ArrayList<Long> fbReeks = new ArrayList<Long>();
	fbReeks.add(0l);
	fbReeks.add(1l);
	for(int i = 0; i <= 50; i++) {
	    fbReeks.add(fbReeks.get(i) + fbReeks.get(i+1)); 
	}
	
	for(int i = 0; i < fbReeks.size();i++) {
	    System.out.println(fbReeks.get(i));
	}
	
//Opdracht 3:
//	    Schrijf een programma die test of de eerste en de laatste waarde in een array hetzelfde zijn.
//	    Experimenteer met arrays van verschillende lengte en inhoud.
//	    Denk na over hoe je dit zou moeten testen en maak een testset om de juistheid van Je code aan te tonen.
	ArrayList<Long> compareHighest = new ArrayList<Long>();
	
	compareHighest.add(1L);
	compareHighest.add(2L);
	
	for(int i = 0; i < 20; i++) {
	    compareHighest.add(compareHighest.get(i) + compareHighest.get(i+1)); 
	 if (compareHighest.get(0).equals(compareHighest.get(i))) {

	    System.out.println("even");
	} else{
	    System.out.println("not even");
	}
	}
//	Opdracht 4:
//	    Schrijf een programma die de grootste waarde in een array bepaalt.
//	    Denk na over hoe je dit zou moeten testen en maak een testset om de juistheid van je code aan te tonen.
	
	
    }
}
