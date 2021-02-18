public class class1 {
    static int a;
    static int f() {
        int a = 3;
        return a;
    }

    static void g() {
        int a = 3;
        System.out.println(a);
    }

    public static void main(String[] args) {
        a = 2;
        System.out.println(a);
        g();
        System.out.println(f());
    }
}


//va afisa 2
// va afisa 3
// va afisa 3
// 2
// 3
//3