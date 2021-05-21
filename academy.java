import java.util.Scanner;

public class academy {
	String name;
	int speed;
	String role;
	static int workingHours;
	double workoutHours;
	double totalworkingHours;
	
	Scanner input = new Scanner(System.in);
	
	
	private String dietPlan;
	private int academyID;
	private String ACADEMY;
	
	
	
	{
		ACADEMY = "National Cricket Academy";
	}
	static {
		workingHours = 4;
	}
	
	
	
	
	
	public String getACADEMY() {
		return ACADEMY;
	}

	public int getAcademyID() {
		return academyID;
	}

	public void setAcademyID(int academyID) {
		this.academyID = academyID;
	}

	public String getDietPlan() {
		return dietPlan;
	}

	public void setDietPlan(String dietPlan) {
		this.dietPlan = dietPlan;
	}
	
	public academy() {
		userData();
		otherData(this.role);
		
		
	}
	public academy(String role) {
		otherData(role);
	}
	public void userData() {
		System.out.println("Enter Your Name: ");
		name = input.nextLine();
		System.out.println("Enter Your Academy ID: ");
		setAcademyID(input.nextInt());
		System.out.println("Enter Your Speed: ");
		speed = input.nextInt();
		
		if (speed > 135) {
			role = "Fast";
		} else {
			role = "Spin";
		}
	}
	
	public void otherData(String role) {
		if (role.equals("Fast")) {
			setDietPlan("Oatcake, Fruits, Yogurt, Coffee");
			workoutHours = 4.5;
		}else {
			setDietPlan("Oatmeal,egg,fresh juice");
			workoutHours = 2;
		}
		
		totalworkingHours = workingHours + workoutHours;
	
	}
	

	
}
