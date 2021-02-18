import org.junit.Test;

class Ab {
    static void M(int x) {System.out.println(1);}
    static void M(float x) {System.out.println(2);}
    static void M(double x) {System.out.println(3);}
    static void M(char x) {System.out.println(1);}
}


public class Ex5 {
    //A.M(3.5) - double;
    @Test
    public void solve() {
        Ab a = new Ab();
        Ab.M(3.5);
    }
}
// 3


