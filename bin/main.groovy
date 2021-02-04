#!/usr/bin/env groovy

class Pascal {
  def row(final int k, final int i, final int c) {
      if (k > i) return 0;
      print( c + ", ");
      final int a = c * (i-k)/(k+1);
      return row(k+1, i, a);
  }

  def col(final int i, final int n) {
      if (i > n) return 0;
      row(0, i, 1);
      println("");
      return col(i+1, n);
  }

  /* Driver program to test above
  functions */
  def main(String[] args)
  {
    final int input = 10;
    println("[INPUT] "+ input);
    println("[OUTPUT] ");
    col(0, input);
  }
}
new Pascal().main()
