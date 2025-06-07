package timus.task_1196;

import java.io.*;
import java.util.HashSet;

public class timus_1196 {
    public static void main(String[] args) {
        String inputFileName = "src/timus/task_1196/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int n = Integer.parseInt(bufferedReader.readLine());
            HashSet<Long> t = new HashSet<>();

            for (int i = 0; i < n; ++i) {
                t.add(Long.parseLong(bufferedReader.readLine()));
            }

            int M = Integer.parseInt(bufferedReader.readLine());
            int count = 0;

            for (int i = 0; i < M; ++i) {
                if (t.contains(Long.parseLong(bufferedReader.readLine())))
                    count++;
            }
            System.out.print(count);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
