package com.mycompany.app;

class MyClass {
  private String name;

  MyClass(String name) {
    this.name = name;
  }

  public boolean equals(Object o) {
    if (!(o instanceof MyClass))
      return false;

    MyClass c = (MyClass) o;

    return name.equals(c.name);
  }
}

class EqualityDemo {
  public static void main(String[] args) {
    MyClass c1 = new MyClass("S");
    MyClass c2 = new MyClass("S");
    MyClass c3 = new MyClass("M");

    System.out.println("c1.equals (c2): " + c1.equals(c2));
    System.out.println("c1.equals (c3): " + c1.equals(c3));
  }
}