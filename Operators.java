public class Operators{
    public static void main(String[] args){
        //operator in java is a symbol that is used to perform action




        int number=5;//a int number
        int number2=10;// int type number
        int sum,product;//two int type variables
        //Unary operators
        System.out.println(number++);//postfix operator this will first print out the number the will increment the value so it will print 5
        System.out.println(++number);//prefix operator this will increment the value first and the print it out.... and it will print 7

        //Arithmatic operators * / % + -
        System.out.println(number* number2);// this will multiple two numbers 5*7=35
        System.out.println(number/number2);//this will devide two numbers 5/7=0;
        System.out.println(number2%number);//this will devide two numbers and print out the remainder 7%5=2
        System.out.println(number2-number);//subtract two numbers 7-5=2 
        System.out.println(number+number2);//will add up two numbers

        //shift operators
        int a=2;
        int b=3;

        System.out.println(a<<b);

    }
}