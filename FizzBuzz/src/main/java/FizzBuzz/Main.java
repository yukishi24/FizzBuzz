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

    for (int i = 1; i <= max; i++) {
      System.out.println(i);
    }
  }

}
