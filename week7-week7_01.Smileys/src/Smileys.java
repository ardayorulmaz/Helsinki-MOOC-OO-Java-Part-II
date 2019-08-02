
public class Smileys {

    private static void printline(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

    private static void printMidline(String stringtoprint) {
        if (stringtoprint.length() % 2 == 0) {
            System.out.print(":) " + stringtoprint + " :)");
        }
        else {System.out.print(":) " + stringtoprint + "  :)");}
        System.out.println("");
    }

    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        int smileyLength;
        if (length%2==0){
          smileyLength = ((length+6)/2);   }
          else { smileyLength= (((length+6)/2))+1;}
        
        printline(smileyLength);
        printMidline(characterString);
        printline(smileyLength);
        
    }
    
    public static void main(String[] args) {
        // Test your method at least with the following
           printWithSmileys("Ardandan");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
}
