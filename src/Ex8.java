class Unu {

    int a = 1;

    void afis() {
        System.out.println(a);

    }
}

    class Doi extends Unu
    {

        int a=2;

        void afis() {System.out.println(a);}

    }

     class t{

        public static void main(String[] args){

            Unu x;

            int n=3;

            if (n==1) {
                x = new Unu();
            }
            else {
                x = new Doi();
            }

                    x.afis();

            System.out.println(x.a);

        }
    }

    // 2 1