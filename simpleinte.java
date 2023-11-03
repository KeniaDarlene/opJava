public class Check {
double p;
double r;
int t;
public check(double principal,double rate,int time){
    this.p=principal;
    this.r=rate;
this.t=time;
}
public double calc(){
    double simpleinte=(p*r*t)/100;
        return simpleinte;
    }
    public static void main (String[] args){
        check bCheck= new check(100000, 5, 5);
        double simpleinte= bCheck.calc();
        System.out.println("mr.bob's simple interest is"+simpleinte);
    }
    }

