package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Random {
    private Random() {
        System.out.println("Сомневаешься как поступить? Просто напиши \"ГО\"! И я тебе подскажу!");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "866"));
        Random random = new Random();
        while (true) {
            if (reader.readLine().equals("ГО")) {
                System.out.println(random.randomDigital());
                break;
            } else {
                System.out.println("Просто напиши две буквы: ГО");
            }
        }
        reader.close();
   }

   private String randomDigital () {
       char[] answer = "Связываемся с Верховным Оракулом...\n".toCharArray();
       try  {
           for (char x : answer) {
               System.out.print(x);
               Thread.sleep(150);
           }
       } catch (InterruptedException e) {
           System.out.println("Установить связь не удалось...попробуйте бросить монетку!");
       }
       System.out.println("Оракул вещает:");
       if ((int)(random()*2) == 0) {
           return "НИ ЗА ЧТО! Только не вздумай делать это...небеса накажут тебя, невежда!";
       } else {
           return "Да, надо делать дело...как ни крути!";
       }
   }
}
