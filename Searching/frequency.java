/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,c=0;
		int[] a={2,3,4,3,5 ,4,4};
		int[] b=new int[10];
		for(i=0;i<a.length;i++){
			c=1;
			if(a[i]!=-1){
			    for(j=i+1;j<a.length;j++){
			    	if(a[i]==a[j]){
			    		c=c+1;
			    		a[j]=-1;
			    	}
			    }
			    b[i]=c;
			}
		}
		for(i=0;i<a.length;i++){
				if(a[i]!=-1){
					System.out.println(b[i]);
				}
		}
				
		
	}
}