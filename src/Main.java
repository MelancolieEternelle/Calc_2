import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] slova = new String[3];
        System.out.println("Введите первый аргумент в виде текста в двойных ковычках, через пробел знак действия и, через еще 1 пробел, 2-й аргумент в двойных ковычках или цифру");
        Scanner scanner = new Scanner(System.in);
        String vvedyonText = scanner.nextLine();
       // String vvedyonText = "14 + \"qwe\"";
       // String vvedyonText = "\"140\" + \"500\"";
        //String vvedyonText = "\"weqwhjkhjke\" / 3";
        //String vvedyonText = "\"weqwe1\" * 10";
        //String vvedyonText = "\"weqwe1\" - \"qwe\"";
        //scanner.close();

        int kolvo = 0;
        char [] charArray = vvedyonText.toCharArray();
        for (char element: charArray){
            if (element=='\"') {
                kolvo++;
            }
        }
  //      System.out.println("!!!!!!!!!!! количество kovichek "+kolvo);

        Razbivka razb = new Razbivka();
        slova = razb.razbivka(vvedyonText, kolvo);
        //if slova[0]
        /*for (String element: slova) {
            System.out.println("rezult razbiv " + element);
        }*/


        Deistvie dei = new Deistvie();
        vvedyonText = dei.deistv(slova);
        if (vvedyonText.length() > 40){
            System.out.println("Konechnii rezult: " + vvedyonText.substring(0,39)+ "...");
        }
        else{
            System.out.println("Konechnii rezult: " + vvedyonText);
        }
    }
}
