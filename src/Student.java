import java.util.Scanner;


 public class Student  {
 private String StudentFirst;
 private String StudentLast;
 private String Address;
 private String Phone;
 private int Credits = 0;
 private String RateCheck;
 private String FoodCheck;
 private String PickCheck;
 private double FoodPlan;
 private double Tuition = 0.0;
 private double LateFee = 0.0;
 private double Incidental = 0.0;
 private double HealthCare = 0.0;
 private double data = 0.0;
 private boolean instate;
 private boolean stuffing;
 private boolean diet;
 private boolean CantStand;
 


	

	public Student(double d) {
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void readInput() {
		Scanner Name = new Scanner(System.in);
		System.out.println("Please enter your First Name");
		StudentFirst = Name.next();
		Scanner Name2 = new Scanner(System.in);
		System.out.println("Please enter your Lastt Name");
		StudentLast = Name.next();
		Scanner Location = new Scanner(System.in);
		System.out.println("Please enter your address");
		Address = Location.nextLine();
		Scanner Number = new Scanner(System.in);
		System.out.println("Please enter your phone number");
		Phone = Number.nextLine();
		Scanner Creds = new Scanner(System.in);
		System.out.println("Please enter the amount of credits you are taking");
		Credits = Creds.nextInt();
		Scanner rates = new Scanner(System.in);
		System.out.println("Do you qualify for the instate rate? Please enter yes or no!");
		RateCheck= rates.nextLine();
		Scanner food = new Scanner (System.in);
		System.out.println("On campus food? Please enter yes or no!");
		FoodCheck = food.nextLine();
	
		
		
	}
	public void compute( )
	{
		StudentFirst = "" + StudentFirst;
		Address = " " + Address;
		Phone = " " + Phone;
		Credits = 0 + Credits;
		Tuition = 0.0 + Tuition;
		LateFee = 0.0 + LateFee;
		Incidental = 0.0 + Incidental;
		HealthCare = 0.0 + HealthCare;
		FoodPlan = 0.0 + FoodPlan;
		RateCheck = "" + RateCheck;
		FoodCheck = ""+FoodCheck;
		PickCheck = ""+PickCheck;
		calculateTuition();
		calculatelateFee();
		calculateincidentalFee();
		calculatehealthCare();
		calculateFoodPlan();
	}

	public void calculateData()
	{
		calculateTuition();
		calculatelateFee();
		calculateincidentalFee();
		calculatehealthCare();
		calculateFoodPlan();
		}
	private void calculateFoodPlan()
	{
		double answer;
		if (FoodCheck.equals("yes")){
			Scanner pick = new Scanner(System.in);
			if (PickCheck.equals("stuff"))
			{
				stuffing = true;
				answer = 4999.00;
				FoodPlan = answer;
			}
			if (PickCheck.equals("can't"))
			{
				CantStand = true;
				answer = 3499.00;
				FoodPlan = answer;
			}
			if (PickCheck.equals("diet"))
			{
				diet = true;
				answer = 2599.00;
				FoodPlan = answer;
			}
		}
		if(FoodCheck.equals("no")){
			System.out.println("No FoodPlan this semester? Sorry to hear that");
		}
	
	}
 private void calculateTuition()
 {
	 double answer;
	if (RateCheck.equals("yes"))
	{
		instate = true;
		 if (Credits < 12)
		 {
			 answer = 102.50;
				Tuition = (answer * Credits);
		 }

			if (Credits >=12 && Credits <= 18)
			{
				answer = 75.45;
				Tuition = (answer * Credits);
			}
			if (Credits > 18){
				answer = 93.00;
				Tuition = (answer * Credits);
				LateFee = (Tuition/10);
				}
			
		}
	else 
	{
		instate = false;
		 if (Credits < 12)
		 {
			 answer = 351.00;
				Tuition = (answer * Credits);
		 }

			if (Credits >=12 && Credits <= 18)
			{
				answer = 255.00;
				Tuition = (answer * Credits);
			}
			if (Credits > 18){
				answer = 304.00;
				Tuition = (answer * Credits);
				LateFee = (Tuition/10);
				}
	}
	
	
		

		
	}
 private void calculatelateFee()
 {
	 double answer;
	 if (Credits < 12)
	 {
		 LateFee = (Tuition/10);
	 }
	 if (Credits >=12 && Credits <= 18)
		{
		
			LateFee = (Tuition/10);
		}
	 if (Credits > 18){
		
			LateFee = (Tuition/10);
			}
 }
 private void calculateincidentalFee()
 {
	 if (20 * Credits > 250){
			Incidental = 250;
		}
		else {
			Incidental = 20 * Credits;
			}
 }
 private void calculatehealthCare()
 {
	 if (Credits <= 10) {
			HealthCare = Credits * 25.00;
		}
		if (Credits > 10 && Credits <= 15){
			HealthCare = 250+((20)*(Credits-10));
		}
		if (Credits > 15){
			HealthCare = 350+((15)*(Credits-15));
		}
		
		
		
 }
	public void writeOutput1()
	{
		String words = "";
		words = "\n" + "\n" + "STUDENT DATA" + "\n" + "\n" + "Name: " + StudentFirst + " "  + "         Credits: " + Credits + "\n" 
		+ "Address: " + Address + "\n" +"Phone Number: " + Phone + "\n" + "Tuition: " + Tuition 
		+ "\n" + "Late Fee: " + LateFee + "\n" + "Incidental: " + Incidental + "\n" 
		+ "Healthcare: " + HealthCare + "\n" + "FoodPlan: " + FoodPlan;
		System.out.print(words);
	}

	public String getRateCheck() {
		return RateCheck;
	}

	public void setRateCheck(String rateCheck) {
		RateCheck = rateCheck;
	}

	public String getFoodCheck() {
		return FoodCheck;
	}

	public void setFoodCheck(String foodCheck) {
		FoodCheck = foodCheck;
	}

	public String getPickCheck() {
		return PickCheck;
	}

	public void setPickCheck(String pickCheck) {
		PickCheck = pickCheck;
	}

	public void setInstate(boolean instate) {
		this.instate = instate;
	}

	public String getStudentFirst() {
		return StudentFirst;
	}

	public void setStudentFirst(String studentFirst) {
		StudentFirst = studentFirst;
	}

	public String getStudentLast() {
		return StudentLast;
	}

	public void setStudentLast(String studentLast) {
		StudentLast = studentLast;
	}

	public double getTuition() 
	{
		return Tuition;
	}
	public boolean getInstate() 
	{
		return instate;
	}
	public void setTuition(double tuition) {
		Tuition = tuition;
	}

	public double getLateFee() {
		return LateFee;
	}

	public void setLateFee(double lateFee) {
		LateFee = lateFee;
	}

	public double getIncidental() {
		return Incidental;
	}

	public void setIncidental(double incidental) {
		Incidental = incidental;
	}

	public double getHealthCare() {
		return HealthCare;
	}

	public void setHealthCare(double healthCare) {
		HealthCare = healthCare;
	}

	public int getCredits() {
		return Credits;
	}

	public void setCredits(int credits) {
		Credits = credits;
	}

	public double getFoodPlan() {
		return FoodPlan;
	}

	public void setFoodPlan(double foodPlan) {
		FoodPlan = foodPlan;
	}

	public boolean isStuffing() {
		return stuffing;
	}

	public void setStuffing(boolean stuffing) {
		this.stuffing = stuffing;
	}

	public boolean isDiet() {
		return diet;
	}

	public void setDiet(boolean diet) {
		this.diet = diet;
	}

	public boolean isCantStand() {
		return CantStand;
	}

	public void setCantStand(boolean cantStand) {
		CantStand = cantStand;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	



	
}
