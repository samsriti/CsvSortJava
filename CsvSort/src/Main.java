import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "";
        File file = new File("C:\\Users\\samsr\\Desktop\\CsvSort\\numbers.csv");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                //System.out.println(line);
                String [] values = line.split(",");
                int [] numbers = new int[values.length];
                for(int i=0; i< values.length;i++){
                    numbers[i] = Integer.parseInt(values[i]);
                }
                System.out.println(Arrays.toString(numbers));
                sort(numbers);
                System.out.println("Numbers sorted in ascending order are: ");
                for(int i=0; i< numbers.length; i++){
                    System.out.println(numbers[i] + " ");
                }


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException ea) {
            throw new RuntimeException(ea);
        }

    }

    public  static void sort(int[]arr){
        int size = arr.length;
        for(int i=0; i<size;i++){
            for(int j= 1; j<size; j++){
                if (arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

}