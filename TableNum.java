public class TableNum{
	public static void main(String []arg){
		int n,s,i;
		for(n=1;n<=10;n++){
			for(i=1;i<11;i++){
			 s=i*n;
			 if(s<10)
				System.out.print(s+"    ");
			else
				System.out.print(s+"   ");			
		}
		System.out.println("\n");
	}
}
}