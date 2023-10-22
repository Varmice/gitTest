package com.itheima;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WeekMonDemo1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i=0;i<12;i++){
            cal.set(2019,i,1);
            while (cal.get(Calendar.DAY_OF_WEEK)!=Calendar.MONDAY){
                cal.add(Calendar.DATE,1);
            }
            System.out.println(sdf.format(cal.getTime()));
            continue;
        }
    }
}
