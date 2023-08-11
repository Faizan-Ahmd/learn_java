class A{
    A show(){
        System.out.println("In A class");
        return this;    // this-> new A(); return the current instance of the class A
    }
}
class B extends A{
    @Override
    B show(){
        super.show();
        System.out.println("In B class");
        return this; //this -> new B(); return the current instance of the class B
    }
}
public class Covariant{
    public static void main(String args[]){
        B obj=new B();
        obj.show();
    }
}