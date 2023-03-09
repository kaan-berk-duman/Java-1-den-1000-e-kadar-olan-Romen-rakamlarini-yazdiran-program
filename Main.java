public class Main
{
	public static void main(String[] args) {
		int n;
		System.out.println("Romen rakamları");
		for(int i=1;i<=1000;i++){
		    n=i;
		    System.out.print("  "+i+"  ");
		    while(n!=0){
		        if (n >= 1000){
                    System.out.print("M");
                    n -= 1000;}  
                    else if (n >= 900){
                    System.out.print("CM");
                    n -= 900;}
                    else if (n >= 500){
                    System.out.print("D");
                    n -= 500;}
                    else if (n >= 400){
                    System.out.print("CD");
                    n -= 400;}
                    else if (n >= 100){
                    System.out.print("C");
                    n -= 100;}
                    else if (n >= 90){
                    System.out.print("XC");
                    n -= 90;}
                    else if (n >= 50){
                    System.out.print("L");
                    n -= 50;}
                    else if (n >= 40){
                    System.out.print("XL");
                    n -= 40;}
                    else if (n >= 10){
                    System.out.print("X");
                    n -= 10;}
                    else if (n >= 9){
                    System.out.print("IX");
                    n -= 9;}
                    else if (n >= 5){
                    System.out.print("V");
                    n -= 5;}
                    else if (n >= 4){
                    System.out.print("IV");
                    n -= 4;}
                    else if (n >= 1){
                    System.out.print("I");
                    n -= 1;}
		    }
		 System.out.println("");
		}
	}
}
