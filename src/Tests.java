import org.junit.Test;

public class Tests {
    static int t(int n) {
        if (n != 0) {
            return 10 * t(n / 10) + n % 10;
        } else {
            return 0;
        }
    }

    @Test
    public void solve() {
        System.out.println(t(122)); // va afisa 12
    }
}
