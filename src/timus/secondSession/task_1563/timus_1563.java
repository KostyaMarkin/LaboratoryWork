package timus.secondSession.task_1563;

import java.io.*;
import java.util.HashSet;

public class timus_1563 {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1496/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            HashSet<String> s = new HashSet<>();

            int n = Integer.parseInt(bufferedReader.readLine());

            int count = 0;
            while (n-- > 0) {
                String ln = bufferedReader.readLine().toUpperCase();
                if (s.contains(ln)) count++;
                else s.add(ln);
            }
            System.out.print(count);
        } catch (Exception e) {}
    }

}
