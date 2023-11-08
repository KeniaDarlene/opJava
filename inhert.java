interface boardmember {
    void members();
}
class Boardmember{
public void members(){
    System.out.println("benimpuhwe organization");
}
}
class Manager extends Boardmember{
    public void members(){
        System.out.println("Manager:we provide the best for our workers");
        } 
}
class Admin extends Manager {
    public void members (){
        System.out.println("we priotize the workers wellbeing");
    }
    }
class Employees extends Admin{
    public void members(){
        System.out.println("we prefer hard working");
    }
}
public class boardmember{
    public static void main(String[]args){
Employees membA= new Employees ();
Admin membB= new Admin () ;
Manager membC= new Manager ();
Boardmember membD= new Boardmember();
membA.members();
membB.members();
membC.members();
membD.members();
    }
}