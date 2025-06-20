package timus.secondSession.task_1607;

import java.io.PrintStream;
import java.util.Scanner;

public class timus_1607 {
    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(System.in);
            PrintStream outFile = new PrintStream(System.out);

            int a = inFile.nextInt();
            int b = inFile.nextInt();
            int c = inFile.nextInt();
            int d = inFile.nextInt();

            int ans;
            Boolean f = true;

            while (true) {
                if (f && a >= c) {
                    ans = a;
                    break;
                } else if (f && a+b >= c) {
                    ans = c;
                    break;
                } else if (!f && a >= c) {
                    ans = c;
                    break;
                } else if (!f && a >= c-d) {
                    ans = a;
                    break;
                } else {
                    if (f)
                        a += b;
                    else
                        c -= d;
                    f ^= true;
                }
            }

            outFile.println(ans);

            inFile.close();
            outFile.close();
        } catch (Exception ex) {}
    }
}
