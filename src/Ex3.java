import org.junit.Test;

public class Ex3 {
    static int t(int n) {
        if (n != 0) {
            System.out.println( "Aici: " + n%2);
            System.out.println((n % 2) * n + t(n - 1));
            return (n % 2) * n + t(n - 1);
        } else {
            return 0;
        }
    }

    @Test
    public void solve() {
        System.out.println(t(5));
    }
}

// (5/2) //1 * 5 + t(4); //5 + t(4)
// (4/2) //0 * 4 + t(3); // 0 + t(3)
// (3/2) //1 * 3 + t(2); // 3 + t(2)
//(2/2) //0 * 2 + t(1); // 0
// (1/2) //1 * 1 + t(0) // 1
//stop -> result 9

// va calcula ? ceva...