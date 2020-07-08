package pendahuluanarraystrukturdata;

import java.util.Arrays;

public class cariRange {

    int max;
    int min;
    int range;

    public double hitungmax(int data[]) {
        for (int i = 0; i < data.length; i++) {
            max = data[0];
            if (data[i] > max) {
                max = data[i];
            }
        }

        return max;

    }

    public double hitungmin(int data[]) {
        for (int j = 0; j < data.length; j++) {
            min = data[0];
            if (data[j] < min) {
                min = data[j];
            }

        }

        return min;
    }

    public double hitungRange() {
        range = max - min;

        return range;
    }

    public void dataArray(int data[]) {
        System.out.println("Data sebelum urut :");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        System.out.println("");

    }

    public double median(int data[]) {        
        Arrays.sort(data);
        
        System.out.println("data setelah urut : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        System.out.println("");
        double median1=data[data.length/2];
        double median2=(data[(data.length-1)/2] + data[(data.length/2)])/2.0;

        if (data.length % 2 == 1) 
        {
            return median1;
        }
        else
        {
            return median2;
        }

    }

    public static void main(String[] args) {
        int data[] = {7, 3, 5, 9, 15, 6, 4, 2, 11,1,7,10};
        

        cariRange hasil = new cariRange();
        hasil.dataArray(data);
        System.out.println("==========================");
        System.out.println("Median = " + hasil.median(data));
        System.out.println("==========================");
        System.out.println("Nilai Maksimum =" + hasil.hitungmax(data));
        System.out.println("Nilai Minimum = " + hasil.hitungmin(data));;
        System.out.println("Range = " + hasil.hitungRange());;
    }

}
