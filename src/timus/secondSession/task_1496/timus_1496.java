package timus.secondSession.task_1496;

import java.io.*;
import java.util.Hashtable;

public class timus_1496 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1496/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int N = Integer.parseInt(bufferedReader.readLine());

            Hashtable<String, Integer> counter = new Hashtable<>();

            for (int i = 0; i < N; ++i) {
                String ln = bufferedReader.readLine().trim();
                if (counter.containsKey(ln)) {
                    int cnt = counter.get(ln);
                    counter.put(ln, Integer.valueOf(cnt + 1));
                } else {
                    counter.put(ln, Integer.valueOf(1));
                }
            }

            for (String k: counter.keySet()) {
                int cnt = counter.get(k);
                if (cnt > 1)
                    outFile.println(k);
            }

            outFile.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

