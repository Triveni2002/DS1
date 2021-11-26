/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,c=0,c1=0;
		int n= sc.nextInt();
		int[] a=new int[10];
		int[] b=new int[10];
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++){
			c=1;
			if(a[i]!=-1){
			    for(j=i+1;j<n;j++){
			    	if(a[i]==a[j]){
			    		c=c+1;
			    		a[j]=-1;
			    	}
			    }
			    b[i]=c;
			}
		}
		for(i=0;i<b.length;i++){
			if(b[i]>1){
				c1=c1+1;
			}
		}
	    System.out.println(c1);			
		
	}
}