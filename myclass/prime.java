import java.util.Scanner;
class A{
static	void prime(int x){
	int count=0;
	for (int i=1;i<=x;i++){
		if(x%i==0){
count++;
}
}
if(count==2){
			 System.out.println("prime");

}else{
			 System.out.println("not a prime");

}
	}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter 1st number");
	 int a=sc.nextInt();
	 
	prime(a);
	
}}