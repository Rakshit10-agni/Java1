import java.util.Scanner;
public class R6{
    public static void calc(int num1,int num2){
        int sum1=num1+num2;
        int diff1=num1-num2;
        int mul1=num1*num2;
        double div1=num1/num2;
        int div2=(int)div1;
        int rem1=num1%num2;
        double exp1=Math.pow(num1,num2);
        System.out.println(sum1+" "+diff1+" "+mul1+" "+div1+" "+div2+" "+rem1+" "+exp1);   
}
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1=sc1.nextInt();
		System.out.print("Enter the second number:");
		int num2=sc1.nextInt();
		calc(num1,num2);
        }
}
        