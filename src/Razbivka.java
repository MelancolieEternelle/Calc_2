public class Razbivka {
    public static String [] razbivka(String vvedyonText, int kolvo){
        //System.out.println("получено " +vvedyonText);

        String [] strings = vvedyonText.split(" ");
        for (int i=0; i<3; i++)
            strings[i] = strings[i].trim();

        if ((strings[0].charAt(0) != '\"') || (strings[0].charAt(strings[0].length() - 1) != '\"')) {
            System.out.println("Первый аргумент не взят в ковычки");
            System.exit(0);
        }

        if ((strings[1].charAt(0) == '+') || (strings[1].charAt(0) == '-')) {
            if ((strings[2].charAt(0) != '\"') || (strings[2].charAt(strings[2].length() - 1) != '\"')) {
                System.out.println("Второй аргумент не взят в ковычки");
                System.exit(0);
            }
        }
        if ((strings[1].charAt(0) == '*') || (strings[1].charAt(0) == '/')) {
            try {
                int chislo = Integer.parseInt(strings[2]);
        //        System.out.println("chislo?  "+chislo);
                if ((chislo < 1) || (chislo > 10)) {
                    System.out.println("При умножении и делении вторым аргументом должно быть число без кавычек от 1 до 10");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("При умножении и делении вторым аргументом должно быть число без кавычек от 1 до 10");
                System.exit(0);
            }
        }

        strings[0]=strings[0].replace("\"", "");
        strings[2]=strings[2].replace("\"", "");
        return strings;
    }
}
