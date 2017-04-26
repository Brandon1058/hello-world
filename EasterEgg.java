/*
Brandon Miller
4/18/17
ITSE 1302
*/


    public class EasterEgg {

        char chrSymbol = '0';

        public void setSymbol(char pchrSymbol) {
            chrSymbol = pchrSymbol;
        }
        public char getSymbol() {
            return chrSymbol;
        }
        public String toString() {
        String strEgg = "";
        strEgg += ("  __  ");
        strEgg += (" /" + chrSymbol + chrSymbol + "\\");
        strEgg += ("/" + chrSymbol +  chrSymbol + chrSymbol + chrSymbol + "\\");
        strEgg += ("|" + chrSymbol + chrSymbol + chrSymbol + chrSymbol + "|");
        strEgg += ("\\___/\n");
        return strEgg = "";
        }
        
        public EasterEgg() {
            setSymbol('#');
        }

          public EasterEgg(char pchrOutput) {
            setSymbol(pchrOutput);
        }

        public static void main(String [] strEgg) {

        EasterEgg objEgg = new EasterEgg();
        System.out.print(objEgg);

        objEgg.setSymbol('#');
        System.out.print(objEgg);

        objEgg.setSymbol('&');
        System.out.print(objEgg);

        objEgg.setSymbol('$');
        System.out.print(objEgg);

        }

    }
