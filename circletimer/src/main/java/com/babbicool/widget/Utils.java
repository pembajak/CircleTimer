package com.babbicool.widget;

import android.content.res.Resources;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    private Utils() {
    }

    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return  dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp){
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }

    public static String getFormated(String format, long time) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = new Date();
        date.setTime(time);
        return dateFormat.format(date);
    }
}
