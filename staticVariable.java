public class staticVariable{
    static int count=0;
    staticVariable(){
        count++;
    }
    public static void main(String[] args){
        staticVariable obj1=new staticVariable();
        staticVariable obj2=new staticVariable();
        System.out.println(staticVariable.count);
    }
}
