class AC {

    int a,b;

    AC(int a, int b) {this.a=a; this.b=b;}

    AC(int x) {b=x;}

    void Afis() { System.out.print(a+" " +b);}

}

class ex {

    public static void main(String[] args) {

        AC x = new AC(3);

        x.Afis();

    }

}

// 0 3