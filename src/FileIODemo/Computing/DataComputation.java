package FileIODemo.Computing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Statistics{
    double sum;
    double lowest;
    double highest;
    double average;

    public Statistics(double sum, double lowest, double highest, double average) {
        this.sum = sum;
        this.lowest = lowest;
        this.highest = highest;
        this.average = average;
    }
}
public class DataComputation {
    public static void main(String[] args) {

    }

    public static Statistics descriptivesStat(String filename){
        double sum =0;
        double lowest = 0;
        double highest = 0;
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            if((line = br.readLine()) != null){
                String[] datalist = line.split(",");
                for(String number: datalist){
                    double num = Double.parseDouble(number.trim());
                    sum += num;
                    count++;
                    if(num < lowest){
                        lowest = num;
                    }

                    if(num > highest){
                        highest = num;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        double average = sum / count;
        return new Statistics(sum,lowest,highest,average);
    }
}
