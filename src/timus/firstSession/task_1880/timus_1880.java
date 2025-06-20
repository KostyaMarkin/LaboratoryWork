package timus.firstSession.task_1880;
import java.io.*;
import java.util.Arrays;

public class timus_1880 {
    public static void main(String[] args) throws  IOException {

        String inputFileName = "src/timus/task_1880/task.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                    new BufferedReader(new FileReader(inputFileName));
        int size1 = Integer.parseInt(bufferedReader.readLine());
        String[] strings1 = bufferedReader.readLine().split(" ");
        int size2 = Integer.parseInt(bufferedReader.readLine());
        String[] strings2 = bufferedReader.readLine().split(" ");
        int size3 = Integer.parseInt(bufferedReader.readLine());
        String[] strings3 = bufferedReader.readLine().split(" ");

        int allSize = size1 + size2+size3;
        String[] strings = new String[allSize];

        for(int i =0, x = 0, y = 0; i < allSize; i++){
            if(i <size1){
                strings[i] = strings1[i];
                continue;
            }
            if( i< (size1 + size2)){
                strings[i] = strings2[x];
                x++;
                continue;
            }
            strings[i] = strings3[y];
            y++;
        }

        Arrays.sort(strings);

        int count = 0;

        for(int i = 1; i < strings.length - 1; i++){
            if(strings[i-1].equals(strings[i]) && strings[i].equals(strings[i+1])){
                count++;
            }
        }
        System.out.println(count);

    }
}
