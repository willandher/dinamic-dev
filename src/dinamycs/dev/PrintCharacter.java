package dinamycs.dev;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintCharacter {
    private static String abc = "abcdefghijklmnñopqrstuvwxyz";
    private static String ABC = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";



    private static boolean find(String abc,int i, char[] update){
        int index = abc.indexOf(update[i]);
        if(index<0){
            return false;
        }else{
            update[i] = abc.charAt(index == abc.length() -1 ? 0 : index+ 1);
            return true;
        }
    }
    // Complete the compareTriplets function below.
    static String changeValue(String a) {
        char[] input = a.toCharArray();
        for( int i = 0; i<input.length; i++){
                if(!find(ABC,i,input)){
                    find(abc,i,input);
                };
        }
        System.out.println(String.valueOf(input));
        return input.toString();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("printString.txt"));
        String value = bufferedReader.readLine();
        String result = PrintCharacter.changeValue(value);
        System.out.println(result);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();

    }
}
