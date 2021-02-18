class A {
    int x = 1;

    void met() {
        System.out.println("Clasa A");
    }

}

class B extends A {
    int x = 2;

    void met() {
        System.out.println("Clasa B");
    }

}

class C extends B {
    int x = 3;

    void met() {
        System.out.println("Clasa C");
    }

}

class test {
    public static void main(String[] args) {
        A x = new B();
        x.met(); // clasa b

        A x2 = new B();
        System.out.println(x2.x); // 1

        // B x3 = (A)new B();  // error... cast..
        // x3.met();

        B x4 = new C();
        x4.met(); // C
    }
}