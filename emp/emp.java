public class emp{
    //attributes of an employee
    int id;
    String name;
    int salary;
    static String ceo;
    //constructor of this class
    emp(int id, String name, int salary, String ceo){
        //This keyword refers  to current instance itself
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.ceo=ceo;
    }
    void display(){
       System.out.println("ID: " + id + ", "
                           + "Name:: " + name + ", "
                           + "Salary: $" + salary + " & "
                           + "CEO:: " + ceo);
    }

}
