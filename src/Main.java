public class Main {
    static int f(int x) {
        return x + 1;
    }

    static void t(int a) {
        System.out.println(++a);
    }

    public static void main(String[] args) {
        t(f(f(f(1))));
    }
}

//va afisa 5, se va incrementa de 3 ori 1, 1+3 = 4;
// t incrementeaza intai , apoi afiseaza, respectiv = 5

