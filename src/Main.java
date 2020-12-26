import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }
    static void taskOne (){
        int ans = (int) (Math.random()*10);
        boolean end;
        System.out.println("Попробуйте угадать число от 0 до 9");
        for (int i=2; i>=0; i--) {
            end = check(i, ans);
            if (end) break;
        }

    }
    static boolean check (int i, int ans){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        if (a==ans){
            System.out.println("Вы угадали!");
            return true;
        }
        if (a<ans){
            if (i>0) System.out.println("Загаданное число больше введенного. Осталось попыток " + i + " .");
            else System.out.println("Вы проиграли. Загаданное число " + ans + " .");
            return false;
        }
        if (i>0) System.out.println("Загаданное число меньше введенного. Осталось попыток " + i + " .");
        else System.out.println("Вы проиграли. Загаданное число " + ans + " .");
        return false;


    }
    static void taskTwo () {
        String [] words = new String[] {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int ansNum = (int) (Math.random()*3);
        String ans = words[ansNum];
        checkStr(ans);
    }
    static void checkStr (String ans) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Попробуйте угадать слово");
        String outStr = new String();
        for (int i=0; i<ans.length(); i++) {
            String inSt = sc.next();
            inSt = inSt.toLowerCase();
            boolean end = false;
            for (int j=0; j<ans.length(); j++){
                char a = ans.charAt(j);
                char b = inSt.charAt(j);
                    if (b!=a || ans.length()!=inSt.length()) {
                    outStr = outStr + ans.charAt(i);
                    if (ans.equals(outStr)) {
                        end = true;
                        System.out.println("Вы не угадали. Загаданное слово " + outStr);
                        break;
                    } else System.out.printf("Вы не угадали. Подсказка : %.15s%n", outStr + "###############" );
                    end= false;
                    break;
                } else if (j==(ans.length()-1) && ans.length() == inSt.length() && a==b){
                    end=true;
                    System.out.println("Вы угадали!!");
                }
            }
            if (end) break;
        }


    }


}