/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,h,m,f=0,i,j;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		l=0;
		h=n-1;
		do{
			m=(l+h)/2;
			if(a[m]==k){
				f=1;
				System.out.println(m);
				break;
			}
			else if(a[m]<k){
				l=m+1;
			}
			else{
				h=m-1;
			}
		}
		while(l<=h);
		
			
		
	}
}