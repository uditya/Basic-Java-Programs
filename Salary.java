public class Salary{
	public static void main(String []arg){
	int expYear=3;
	String deLevel="A3", expDeLevel="A5";
	System.out.println("___Employee Details_____");
	System.out.println("Designation Level : "+deLevel +"   "+"Experience in work : "+expYear);
	System.out.println("Bonus Details : ");
	if(expYear>=5 && deLevel.equals(expDeLevel)){
	System.out.println("Congrats! you are eligible to get bonus");
	}
	else{
	System.out.println("Get some more experience");
	}
	}
}