package task2t2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
        //Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
       // Пройдитесь по всем элементам множества и удалите из него все нечетные значения. Выведите оставшиеся элементы в консоль.

public class Numbers {

    public static void main(String[] args) {


        Set<Integer>set = new HashSet<>(20);
        Random r = new Random();
        for (int i = 0; i < 20 ; i++) {
          set.add(r.nextInt(1000));
        }
         set.removeIf(e ->e % 2 == 1);
        System.out.println(set);
        }




    }

