import java.io.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Static variables = "+count);
        System.out.println("Static Method");


        //creating three threads
        MyThread myThread1=new MyThread();
        myThread1.start();

    }
    static int count=0;
    static {
        System.out.println("Static Block");
    }
}