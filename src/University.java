
public class University //extends PersonWithFiles
{
	private    int numberCount = 0;
	private int numberOfStudents = 0;
	protected int instate = 0;
	protected int outstate = 0;
	protected int Credits = 0;
	 protected double Tuition = 0.0;
	 protected double LateFee = 0.0;
	 protected double Incidental = 0.0;
	 protected double HealthCare = 0.0;
	 protected double diet;
	 protected double CantStand;
	 protected double stuffing;
public void colectDataForUniversityReport(Student person) 
{
	numberCount++;
	Tuition = Tuition + person.getTuition();
	numberOfStudents++;
	if (person.getInstate())
	{
		instate++;
	}
	else
	{
		outstate++;
	}
	Credits = Credits + person.getCredits();
	Incidental = Incidental + person.getIncidental();
	HealthCare = HealthCare + person.getHealthCare();
	LateFee = LateFee + person.getLateFee();
	if (person.isStuffing())
	{
		stuffing++;
	}
	if (person.isCantStand())
	{
		CantStand++;
	}
	if (person.isDiet())
	{
		diet++;
	}
	
	
	

	
}

public void printDataForSchoolReport() 
{
	String words = " ";
	words = "\n" +   "UNIVERSITY DATA" + "\n" + "\n" +
	"Tuition: " + Tuition + "\n" + "Instate: " + instate + "\n" + "Outstate: " + outstate + 
			"\n" + "Incidental Fee: " + Incidental + "\n" + "HealthCare: " + HealthCare + "\n" 
			+ "LateFee: " + LateFee + "\n" + "Credits: " + Credits + "\n" + "\n" + "FOOD PLANS " + "\n" + "\n"  
			+  "CANT STAND: " + CantStand + "\n" + "Diet: " + diet + "\n" + "Stuffing face: " + stuffing	;
	System.out.print(words);
	
	
}

public int getNumberCount() {
	return numberCount;
}

public void setNumberCount(int numberCount) {
	this.numberCount = numberCount;
}


}
