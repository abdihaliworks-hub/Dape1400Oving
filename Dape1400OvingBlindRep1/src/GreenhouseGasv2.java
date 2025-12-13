public class GreenhouseGasv2 {
    private String gasName;
    private double globalWarmingPotential;
    private double emissionInKilotonne;

public GreenhouseGasv2(String gasName,double globalWarmingPotential,double emissionInKilotonne){
    this.gasName=gasName;
    this.globalWarmingPotential=globalWarmingPotential;
    this.emissionInKilotonne=emissionInKilotonne;

}
public double calculateEquivalent(){
    return globalWarmingPotential * emissionInKilotonne;
}
@Override
public String toString(){
    return emissionInKilotonne+" kilotonn "+gasName+" tilsvarer "+ calculateEquivalent()+" CO2";
}



}
