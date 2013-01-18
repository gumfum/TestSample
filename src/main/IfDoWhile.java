package main;

public class IfDoWhile {
  public void foobar() {
    int i = 0;
    if (i == 1) {
      System.out.println("hoge");
    }

    while (i < 1) {
      System.out.println("piyo");
    }

    do {
      System.out.println("fuga");
      i++;
    } while (i < 2);
  }
}
