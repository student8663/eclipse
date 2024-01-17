package p1;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
       // 5 ~ 10 exclusive
       for(int i = 0; i < 5; i++) {
          double ranNum = Math.random() * 5 + 5;
           System.out.println((int)ranNum);
       }
       System.out.println();
       // 3 ~ 8 inclusive
       Random random = new Random();
       for(int i = 0; i < 5; i++) {
           int ran = random.nextInt(5) + 3;
           System.out.println(ran);
       }
    }

}
