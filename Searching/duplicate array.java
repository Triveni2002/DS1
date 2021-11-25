/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i,n,f=0,k=0;
	    n=sc.nextInt();
	    int[] a={4,7,53,9};
	    for(i=0;i<a.length;i++){
	        if(a[i]==n){
	            k=i;
	            f=1;
	        }
	    }
	    if(f==1){
	        System.out.println(k);
	    }
	    else{
	        System.out.println("element not found");
	    }
	}
}
