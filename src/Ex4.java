import org.junit.Test;

class a{
    int a =1;
    int a() {
        int a = 2;
        return a;
    }
}

public class Ex4 {
    @Test
    public void solve() {
        a a = new a(); // correct
        a x = new a(); //correct
        // x a = new a(); wrong
        // a x = new (); wrong
    }
}
 // 4.2 - x.a