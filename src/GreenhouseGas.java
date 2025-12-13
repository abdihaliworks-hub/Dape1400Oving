public class GreenhouseGas {
 private String gasName;
    private  double globalWarmingPotential;
    private  double emissionInKilotonne;

     public GreenhouseGas( String gasName, double globalWarmingPotential, double emissionInKilotonne){
         this.gasName=gasName;
         this.globalWarmingPotential=globalWarmingPotential;
         this.emissionInKilotonne=emissionInKilotonne;

     }

     public double calculateEquivalent(){


return globalWarmingPotential * emissionInKilotonne;
     }

     @Override
     public String toString(){
         return emissionInKilotonne +" kilotonn "+gasName+" vil tilsvare " + calculateEquivalent()+" CO2e";


     }




}
