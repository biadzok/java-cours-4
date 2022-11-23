class Main {
  public static void main (String args[]) {
    class B {
public int i = 0;
public void f() {
System.out.println(i);
}
public void g() {
  System.out.println(i);
}
}
class A extends B {
public int i = 1;
public void f() {
System.out.println(i);
}
public void h() {
System.out.println(i);
}
}
A a = new A();
B b = new B();
b.f();
b.g();
a.f();
a.g();
a.h();
b = a;
b.f();
b.g();
b.h();
  }
}