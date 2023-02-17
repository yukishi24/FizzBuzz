/**
 * 
 */
package FizzBuzz;

import java.util.Scanner;
import constant.Constant;

/**
 * 3の倍数の時にFizz<br>
 * 5の倍数の時にBuzz<br>
 * 15の倍数の時にFizzBuzzと表示
 * 
 * @author yukishi
 *
 */
public class Main {

  /**
   * メインメソッド
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(Constant.headStr);

    // Scannerから最大値を取得する。
    int max = sc.nextInt();

    System.out.println(Constant.maxStr + max + Constant.resultStrPrt);
    System.out.println(Constant.resultStr);

    FizzBuzz(max);
  }

  /**
   * FizzBuzz実装メソッド
   * 
   * @param max
   */
  public static void FizzBuzz(int max) {
    String tmp;
    for (int i = 1; i <= max; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        tmp = "FizzBuzz";
      } else if (i % 3 == 0 && i % 5 != 0) {
        tmp = "Fizz";
      } else if (i % 3 != 0 && i % 5 == 0) {
        tmp = "Buzz";
      } else {
        tmp = Integer.valueOf(i).toString();
      }
      System.out.println(tmp);
    }
  }
}
