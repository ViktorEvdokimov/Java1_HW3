import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        taskOne();
    }
    static void taskOne (){
        int ans = (int) (Math.random()*10);
        boolean end;
        for (int i=3; i>0; i--) {
            end = check(i, ans);
            if (end) break;
            //          if (end==false || i==1) System.out.println("Вы проиграли. Загаданное число " + ans + " .");
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
            System.out.println("Загаданное число больше введенного. Осталось попыток " + i + " .");
            return false;
        }
        System.out.println("Загаданное число меньше введенного. Осталось попыток " + i + " .");
        return false;
    }
}