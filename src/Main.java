import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double r = Div.divisionStrings("1", "2");
        System.out.println("The number is" + r);


        ArrayList<GreenhouseGas>gases= new ArrayList<>();
        gases.add(new GreenhouseGas("Co2",1,10000));
        gases.add(new GreenhouseGas("Metan",25,129.432));
        gases.add(new GreenhouseGas("Dinitrogenoksid",298,90000));

        double d= 0;
for(GreenhouseGas v :gases ){
    System.out.println(v.toString());
    d +=v.calculateEquivalent();
}
System.out.println("The total amount of CO2 equivilance is "+d);

    }





    public void investigateArray(int[]ints,int number){

        if(ints.length==0  || number==0){System.out.println("No empty array or empty values is accepted");
        return;}


        int negCount=0;
        int largest=ints[0];
        int sum=0;

        for (int anInt : ints) {

            if (anInt < 0) {
                negCount++;
            }
            if (anInt > largest) {
                largest = anInt;
            }
            if (anInt % number == 0) {
                System.out.println(anInt + " Is divisable by " + number);
            }
            sum+=anInt;

        }
        System.out.println("There are "+negCount+ " negative numbers");
        System.out.println(largest+" Is the largest number");
        System.out.println("The sum is "+sum);

    }

public void guessTheAnimal(ArrayList<String>animals){
        Scanner scanner = new Scanner(System.in);
    String next1;
        do{
        System.out.println("Welcom to the game guess the animal!");
        System.out.println("write the number for the following options");
        System.out.println("1: guess the animal ");
        System.out.println("2:give up");
         next1=  scanner.nextLine();
            switch(next1){
                case "1":System.out.println("Guess the Animal! :");
                String next2 =scanner.nextLine();
                if(next2.isEmpty()){
                    System.out.println("Cannot have empty String");
                }
                for( String v: animals){

                    if(v.contains(next2)){
                        System.out.println("You guess right");
                        break;
                    } else System.out.println("Not quite! Better luck nex time");
                    break;
                }
                break;
            case "2":
                System.out.println("awhhh, så leit. vi er her for deg til nete gang!");
            }






        }while(next1.equals("2") ||scanner.nextLine()==null );

}




}