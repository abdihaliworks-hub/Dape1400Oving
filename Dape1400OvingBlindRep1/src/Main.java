import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<GreenhouseGasv2>gases =new ArrayList<>();
        gases.add( new GreenhouseGasv2("C02",1,38869.00));
        gases.add(new GreenhouseGasv2("Methane",25,171.27));
        gases.add(new GreenhouseGasv2("Dinitrogenoksid (N2O)", 298,8.44));

        double sum=0;
        for(GreenhouseGasv2 v: gases){
            System.out.println(v.toString());
            sum+=v.calculateEquivalent();
        }
        System.out.println("Total CO2 sum is "+sum);


    }

    public void investigateIntArray(int[] ints, int number) {
        int neg = 0;
        int sum = 0;
        int largest = ints[0];
        if(ints==null || ints.length==0) {
            System.out.println("Array is empty or null");
        }

            for (int anInt : ints) {
                if (anInt < 0) neg++;
                if (anInt > largest) largest = anInt;
                if (anInt % number == 0|| number!=0 ) System.out.println(anInt + " Is divisable by " + number);
                sum += anInt;

            }
            System.out.println("There are " + neg + " smaller than 0");
            System.out.println("The largest number is" + largest);
            System.out.println("The sum of the numbers in the arrays is " + sum);


    }


    //Jeg velge rå gjøre metoden statisk, dersom metoden er mer av verktøy
    //og vi ikke trenger å instansiere nye objekter hver gang vi bruker den.
    //metoden bør være publc, dersom vi ikke har noe som kan overskrives, eller verdt å beskytte.
    public static double stringConversion(String teller, String nevner) {
        if (teller==null || nevner==null ) return -1;


        if (!teller.matches("\\d+") || !nevner.matches("\\d+")) {
            return -1;
        }
       int t = Integer.parseInt(teller);
        int n = Integer.parseInt(nevner);
        if (n==0)return-1;
        else

    return t/n;
    }
    public void guessTheAnimal(ArrayList<String> animals){
        Scanner scanner= new Scanner(System.in);
      String choice="";

      do{
         System.out.println("Velkommer! for å gjette på dyr, skriv inn: a");
         System.out.println("for å gi opp skriv inn: b");
         choice=scanner.nextLine().toLowerCase();

         switch(choice){
             case "a":
                 System.out.println("Skriv inn dyret du satser på");
                 String guess = scanner.nextLine().toLowerCase();
                 if(guess.isEmpty()){
                     System.out.println("Kan ikke være tom streng!");
                     break;
                 }
                 boolean found=false;
                 for(String g : animals){
                     if( g.toLowerCase().contains(guess)){
                         System.out.println("Gratulerer! riktig gjettet");
                         found=true;
                         break;

                     }

                 } if(found){
                     System.out.println("Gratulerer! riktig gjettet");}
                 else System.out.println("Feil gjettet, prøv igjen!");
                 break;


             case "b":
                 System.out.println("Ha det bra!");
                 break;
             default: System.out.println("Skriv inn valid input takk!!");
             break;

         }


      } while(!choice.equals("b"));





    }


}