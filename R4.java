public class R4{
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
        calc(8,4);
        calc(8,5);
        calc(10,2);
        calc(2,10);
        
        }
}
        