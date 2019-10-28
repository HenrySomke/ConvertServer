package com.ats.job.constants;

import org.apache.jute.Index;

import java.text.DecimalFormat;

/**
 * Created by xu on 2019/10/21.
 */
public class aasda {
    public static void main(String [] args){
        String str = "48/66/" +
                "27/42/" +
                "21/27/" +
                "32/35/" +
                "48/60/" +
                "31/41/" +
                "32/39/" +
                "36/45/" +
                "38/46/" +
                "51/63/" +
                "19/26/" +
                "25/31/" +
                "42/44/" +
                "27/29/" +
                "60/64/" +
                "23/24/" +
                "19/22/" +
                "23/31/" +
                "21/29/" +
                "21/26/" +
                "16/21/" +
                "17/20/" +
                "18/22/" +
                "121/148/" +
                "77/88/" +
                "37/46/" +
                "35/40/" +
                "20/24/" +
                "17/19/" +
                "19/21/" +
                "21/22/" +
                "24/28/" +
                "31/35/" +
                "24/29/" +
                "28/30/" +
                "32/34/" +
                "28/31/" +
                "27/32/" +
                "18/22/" +
                "27/32/" +
                "20/23/" +
                "18/23/" +
                "48/53/";
        String [] arr = str.split("/");
        int i=arr.length;
        DecimalFormat df = new DecimalFormat("#0.00");
        for(int s=0;s<i;s++){
            double g=Integer.parseInt(arr[s]+"");
            double h=Integer.parseInt(arr[s+1]+"");
            double j=g / h;
            System.out.println(df.format(j));
            s=s+1;
        }

    }
}
