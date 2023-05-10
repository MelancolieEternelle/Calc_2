public class Razbivka {
    public static String [] razbivka(String vvedyonText, int kolvo){

        String [] strings = vvedyonText.split("\"");
        strings[2] = strings[2].trim();

 //       System.out.println("получено " +vvedyonText);
        if (kolvo == 2) {
            String [] strings2 = strings[2].split(" ");
      //      System.out.println(strings[2] + "znak ");
       //     for (String str: strings2) {
       //         System.out.println(str + "// ");
      //      }
            strings[0]=strings[1];
            strings[1]=strings2[0];
            strings[2]=strings2[1];
            return strings;
        }
        else {
            strings[0]=strings[1];
            strings[1]=strings[2];
            strings[2]=strings[3];
            return strings;
        }
    }
}
