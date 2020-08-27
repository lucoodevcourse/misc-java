package misc;

class Super {
  public static void main(String[] args) {
    System.out.println(new D().world());
    System.out.println(new E().world());
  }
}

interface I {
  String world();
}

abstract class C implements I {
  public C() {
    System.out.println("C");
  }

  public String hello() {
    return "Hello ";
  }

  @Override
  protected void finalize() {
    System.out.println("~C");
  }
}

class D extends C {
  public D() {
    System.out.println("D");
  }

  @Override
  public String hello() {
    return "World ";
  }

  @Override
  public String world() {
    return super.hello() + hello();
  }

  @Override
  protected void finalize() {
    System.out.println("~D");
  }
}

class E extends D {
  public E() {
    System.out.println("E");
  }

  @Override
  public String hello() {
    return "Mundo ";
  }

  @Override
  protected void finalize() {
    System.out.println("~E");
  }
}

/*
abstract class A {
  public abstract void f();
}

abstract class B extends A {
  public void f() { super.f(); } // error!
}
*/
