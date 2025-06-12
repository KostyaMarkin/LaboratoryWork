package timus.secondSession.task_1545;

import java.io.*;


public class timus_1545 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus/task_1545/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        PrintWriter outFile = new PrintWriter(new OutputStreamWriter(System.out));
        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            int N = Integer.parseInt(bufferedReader.readLine());
            String[] symbols = new String[N];
            for(int i = 0; i< N; i ++){
                symbols[i] = bufferedReader.readLine();
            }
            char query = bufferedReader.readLine().charAt(0);
            for(int i = 0; i < N; i++){
                if(query == symbols[i].charAt(0)){
                    System.out.println(symbols[i]);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
