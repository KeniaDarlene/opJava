

public class tt {
    public static void main(String args[]){
        A myobj= new A();
        myobj.show();
        myobj.display();
         myobj.calculate();
        myobj.add();
        myobj.interfacetest();
    }
}
class D{
    int a=6;
    int b=12;
    public void add(){
        int result= a+b;
System.out.println(result);
    }
}
class C extends D{
    public static void display(){
        System.out.println("this is class B");
    }
}
class B extends C{
    public static void calculate(){
        int c=4;
        int d=22;
int result = d-c;
System.out.println(result);
    }
}
interface E{
    void interfacetest();
}
class A extends B implements E{
    public void show(){
        System.out.println (a+b) ;
    }
    public void interfacetest(){
       System.out.println("this's method interface"); 
    }
}