import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        taskOne();
    }
    static void taskOne (){
        int ans = (int) (Math.random()*9);
        boolean end;
        System.out.println("Попробуйте угадать число от 0 до 9");
        for (int i=2; i>=0; i--) {
            end = check(i, ans);
            if (end) break;
        }

    }
    static boolean check (int i, int ans){
        Scanner sc = new Scanner(System.in);
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
}