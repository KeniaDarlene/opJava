public class calendar {
    public static void main( String args[]){
        System.out.println("\nCalendar of 2023");
        System.out.println("\nMonth: November\n***************");
        System.out.println( "Mon\tTue\tWed\tThur\tFrid\tSat\tSun");
        for(int i=1;i<=30;i++){
            if(i==1){
                System.out.print("\t\t" + i +"\t");
            }
            else{
                System.out.print(i + "\t");
            }
            if(i == 5 || i == 12 || i == 19 || i == 26){
                System.out.println(" ");
            }
        }
        System.out.println("\n");

        }
    }