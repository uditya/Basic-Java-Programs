public class PrimeNum{
	public static void main(String []arg){
	int n=43;
	boolean flag=false;
	for(int i=2;i<=n/2;i++){
	if(n%2==0){
	flag=true;
	break;
	}
	}
	if(!flag){
	System.out.println(n +"is prime");
	}
	else
	System.out.println(n +"is not prime");
	}
}