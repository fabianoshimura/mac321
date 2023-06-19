class Value {
  int i;
//  boolean equals( Value v ) {
//	  return i == v.i;
//  }
}

public class EqualsMethod {
  public static void main(String[] args) {
    Value v1 = new Value();
    Value v2 = new Value();
    v1.i = v2.i = 100;
    //v1=v2;
    System.out.println(v1.equals(v2));
    System.out.println(v1==v2);
  }
} ///:~
