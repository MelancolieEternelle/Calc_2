import java.util.Scanner;

public class Main {
    int a = 5;
    public static void main(String[] args) {
        String[] slova = new String[3];
        System.out.println("Введите первое слогаемое в виде текста в двойных ковычках, через пробел знак действия и, через еще 1 пробел, слово в двойных ковычках или цифру");
        Scanner scanner = new Scanner(System.in);
        String vvedyonText = scanner.nextLine();
      //  String vvedyonText = "\"weqwe\" - \"qwe\"";
       // String vvedyonText = "\"weqwe1\" / 654k";
        scanner.close();

        int kolvo = 0;
        char [] charArray = vvedyonText.toCharArray();
        for (char element: charArray){
            if (element=='\"') {
                kolvo++;
            }
        }
  //      System.out.println("!!!!!!!!!!! количество kovichek "+kolvo);

        if ((kolvo == 2) || (kolvo==4)) {

            Razbivka razb = new Razbivka();
            slova = razb.razbivka(vvedyonText, kolvo);

           /* for (String element: slova) {
                System.out.println("rezult razbiv " + element);
            }*/

            Deistvie dei = new Deistvie();
            vvedyonText=dei.deistv(slova);
            System.out.println("Konechnii rezult: " + vvedyonText);
        }
        else {
            System.out.println("Некорректный ввод");
            //goto
        }
    }
}
