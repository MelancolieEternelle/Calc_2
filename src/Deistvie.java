import java.nio.file.FileSystemNotFoundException;

public class Deistvie {
    String itog;
    String deistv(String str []){

        char a = str[1].charAt(0);

        Deistvie dei = new Deistvie();
        switch(a){
            case '-':
                itog = dei.vichet(str);
                break;
            case '+':
                itog="\""+str[0]+str[2]+"\"";
                System.out.println(itog);
                break;
            case '*':
                itog = dei.umnozh(str);
                break;
            case '/':
                itog = dei.delen(str);
                break;

            default:
            System.out.println("Вы ввели некорректный знак действия");
        }
        return itog;
    }
    String vichet(String str []){
        itog=str[0].replace(str[2], "");
        return itog;
    }
    String umnozh(String str []) {
        int chislo;
//        System.out.println("massiv imnog: "+str[2]+"."+itog+"."+str[0]);
        chislo = Integer.parseInt(str[2]);
            for (int i = 0; i < chislo; i++) {
                if (i == 0) {
                    itog = str[0];
                } else {
                    itog = itog + str[0];
                }
                //System.out.println(itog + " " + str[0]);
            }
        return itog;
    }
    String delen(String str[]){
        int chislo;
        try{
                chislo = Integer.parseInt(str[2]);
                for (int i= 0; i< str[0].length()/chislo; i++) {
                if (i == 0) {
                    //System.out.println("/////////////////////////////////////////"+str[0].charAt(0));
                    itog = String.valueOf(str[0].charAt(0));
                } else {
                    itog = itog + String.valueOf(str[0].charAt(i));
                }
            }
        } catch(NumberFormatException  e){
            itog = "число не число";
            System.exit(0);

        }
        return itog;
    }

}
