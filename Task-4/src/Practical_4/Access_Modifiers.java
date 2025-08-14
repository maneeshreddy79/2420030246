package Practical_4;

public class Access_Modifiers {

	private int rollNumber;
	protected char grade;
	public String name;
	
	public void setDetails(int roll,char grd, String nm) {
        rollNumber=roll;
        grade=grd;
        name=nm;
    }
	public static void main(strings[] args) {
		
	}
		
	//System.out.println("RollNumber: " +rollnumber);
	//System.out.println("Grade: " +grade);
	//System.out.println("Name: " +name);
	void showDetails()
	{
		System.out.println(rollNumber);
		
		
	}

}
