package p5;
//sth to test
public class A {
    public void printNumberType(int v) {
      if (v % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  
    public void M1(int v) {
      this.printNumberType(v);
    }
  }