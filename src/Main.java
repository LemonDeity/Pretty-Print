import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(new File("PrettyPrint.dat"));
        ArrayList<String[]> list = new ArrayList<String[]>();
	//Hello World
        while(input.hasNextLine()){
            String str = input.nextLine();
            list.add(str.split(","));
        }
        ArrayList<double[]> nums = new ArrayList<double[]>();
        for(String[] arr : list){
            double[] dArr = new double[arr.length];
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = Double.parseDouble(arr[i]);
            }
            nums.add(dArr);
        }

        for (double[] arr : nums) {
            Node n = new Node(arr);
            n.pPrint();
            System.out.println();
        }
    }
}
