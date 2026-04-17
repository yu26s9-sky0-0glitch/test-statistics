package com.pluralsight;
import java.util.Arrays;
public class TestStatistics {
    static void main(){
        int[] testScores = {34,54,98,70,89,67,21,90,43,88};
        int max = testScores[0];
        int min = testScores[0];
        int sum =0;
        for (int score: testScores){
            if (score > max){
                max = score;
            } else if (score<min) {
                min = score;

            }
            sum += score;

        }
        double median;
        Arrays.sort(testScores);
        int middle = testScores.length/2;
        if (testScores.length % 2 ==0){
            median = (double) (testScores[middle]+testScores[middle-1])/2;
        }
        else{
            median =testScores[middle];
        }




        double average = (double) sum/ testScores.length;
        System.out.println(10/2);

        System.out.println("\nMadian:" + median+"\nAverage:" + average+"\nMin: "+min+"\nMax: "+max);
    }
}
