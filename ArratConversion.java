public class ArratConversion{
	public static void main(String []arg){
	int a[]={1,2,3,4,5,6,7,8};
	int l=a.length;
	int reqArray[]=new int[l];
	boolean flag=true;
	int s=0, grNum=l-1;
	for(int i=0;i<l;i++){
	if(flag){
	reqArray[i]=a[l--];
	}
	else{
	reqArray[i]=a[s++];
	}
	flag=!flag;
	}
	}
}