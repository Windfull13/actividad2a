public class Main extends Base{

    public static void main(String[] args) {
        String fenaci="";
        String cumple="";
        int cumpleent;
        String sigzod="";

        screen.println("Ingrese una fecha de nacimiento en formato AAAA-MM-DD: ");
        fenaci=keyboard.nextLine();
        cumple=fenaci.substring(5,7)+fenaci.substring(8,10);
        cumpleent=Integer.parseInt(cumple);
        if ((cumpleent>=120 && cumpleent<=131)||(cumpleent>=201 && cumpleent<=218))
            sigzod="Acuario";
        else if ((cumpleent>=219 && cumpleent<=229)||(cumpleent>=301 && cumpleent<=320))
            sigzod="Piscis";
        else if ((cumpleent>=321 && cumpleent<=331)||(cumpleent>=401 && cumpleent<=419))
            sigzod="Aries";
        else if ((cumpleent>=420 && cumpleent<=430)||(cumpleent>=501 && cumpleent<=520))
            sigzod="Tauro";
        else if ((cumpleent>=521 && cumpleent<=531)||(cumpleent>=601 && cumpleent<=620))
            sigzod="Géminis";
        else if ((cumpleent>=621 && cumpleent<=630)||(cumpleent>=701 && cumpleent<=722))
            sigzod="Cáncer";
        else if ((cumpleent>=722 && cumpleent<=731)||(cumpleent>=801 && cumpleent<=822))
            sigzod="Leo";
        else if ((cumpleent>=823 && cumpleent<=831)||(cumpleent>=901 && cumpleent<=922))
            sigzod="Virgo";
        else if ((cumpleent>=923 && cumpleent<=930)||(cumpleent>=1001 && cumpleent<=1022))
            sigzod="Libra";
        else if ((cumpleent>=1023 && cumpleent<=1031)||(cumpleent>=1101 && cumpleent<=1121))
            sigzod="Escorpio";
        else if ((cumpleent>=1122 && cumpleent<=1130)||(cumpleent>=1201 && cumpleent<=1221))
            sigzod="Sagitario";
        else if ((cumpleent>=1222 && cumpleent<=1231)||(cumpleent>=101 && cumpleent<=119))
            sigzod="Capricornio";

        if(!sigzod.isEmpty())
            screen.println("Su signo zodiacal es: "+sigzod);
        else
            screen.println("No se pudo determinar su signo zodiacal");
        }
    }
