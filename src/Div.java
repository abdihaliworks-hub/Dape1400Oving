public class Div {

    public static double divisionStrings(String teller, String nevner) {
        if (teller.isEmpty() || nevner.isEmpty() || nevner.equals("0"))
            return -1;

        int nevn = 0;
        int tell = 0;
        if (teller.matches("\\d+") && nevner.matches("\\d+")) {
            tell = Integer.parseInt(teller);
            nevn = Integer.parseInt(nevner);
        }

if(tell %nevn==0 ){
    return tell/nevn;
} else return -1;
    }
}