package dinamycs.dev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class PrintArray {


    public static int[] printByMax(List<Integer> array){
        int max = array
                .stream()
                .mapToInt(v -> v)
                .max().getAsInt();
        int newarr[] = new int[max];
        for (int i = 0; i < max; i++) {
            newarr[i] = i+1;
        }
        return newarr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("printArray.txt"));
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int[] value = printByMax(a);
        String valueString = Arrays.toString(value);
        System.out.println(valueString);
        bufferedWriter.write(valueString);
        bufferedReader.close();
        bufferedWriter.close();

    }

}
