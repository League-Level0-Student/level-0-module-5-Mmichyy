package extra;

public class fibonacci {

public static void main(String[] args) {

int one= 1;
int two= 1;
int three;

System.out.println(one);
System.out.println(two);

for (int i=0;i < 13; i++) {
	
three=one+two;

System.out.println(three);

one=two;

two=three;
	

}	
}}

//1+1=2+1=3+2=5+3=8=13

