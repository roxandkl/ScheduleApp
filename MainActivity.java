package com.example.scheduler;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

class Globals{
    static Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    static int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);

    static LocalTime time = LocalTime.now();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
    static int comparetime = Integer.parseInt(time.format(formatter));

    static String output;
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // TextView watch = (TextView) findViewById(R.id.watch);
        //Date temp = Globals.calendar.getTime();
        //watch.setText((CharSequence) temp);

        chooseday(Globals.dayofweek, Globals.comparetime);

        TextView mainoutput = (TextView) findViewById(R.id.mainoutput);
        String join = Globals.output;
        mainoutput.setText(join);
    }





    public static String informatik_FT() {
        Globals.output="Informatik_FT \nMid = 814 003 1606 \nKennwort = 001148";
        return Globals.output;
    }

    public static String mathe_HK() {
        Globals.output = "Mathe_HK \nMid= 602 138 0304 \nKennwort = 5Nz6V0";
        return Globals.output;
    }

    public static String physiks_HS() {
        Globals.output="Physiks_HS \nMid = 572 418 8429 \nKennwort = 120386";
        return Globals.output;
    }

    public static String chemie_HM() {
        Globals.output = "Chemie_HM  \nMid = 698 674 4268 \nKennwort = 115348";
        return Globals.output;
    }


    public static String deutsch_FS() {
        Globals.output ="Deutsch_FS \nMid = 848 3996 2025 \nKennwort = 841955";
        return Globals.output;
    }

    public static String deutsch_FvW() {
        Globals.output ="Deutsch_FvW \nMid = ########### \nKennwort = ######";
        return Globals.output;
    }

    public static String monday(int z) {
        if (z > 730 && z < 850) {
            informatik_FT();}
        else if (z > 910 && z < 1030) {
            deutsch_FS();}
        else if (z > 1040 && z < 1200) {
            mathe_HK();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String tuesday(int z) {
        if (z > 730 && z < 850) {
            mathe_HK();}
        else if (z > 910 && z < 1030) {
            chemie_HM();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String wednesday(int z) {
        if (z > 730 && z < 850) {
            deutsch_FS();}
        else if (z > 910 && z < 1030) {
            informatik_FT();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String thursday(int z) {
        if (z > 730 && z < 850) {
            physiks_HS();}
        else if (z > 910 && z < 1030) {
            chemie_HM();}
        else if (z > 1040 && z< 1200) {
            deutsch_FvW();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String friday(int z) {
        if (z > 730 && z < 850) {
            deutsch_FvW();}
        else if (z > 910 && z < 1030) {
            mathe_HK();}
        else if (z > 1040 && z < 1200) {
            physiks_HS();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String saturday(int z) {
        Globals.output = "Keinen Unterricht Jetzt. Heute ist Samstag";
        return Globals.output;
    }

    public static String sunday(int z) {
        Globals.output = "Keinen Unterricht Jetzt. Heute ist Sonntag";
        return Globals.output;
    }


    public static String chooseday(int y, int x) {
        switch (y) {

            case 1:sunday(x); break;
            case 2:monday(x); break;
            case 3:tuesday(x); break;
            case 4:wednesday(x); break;
            case 5:thursday(x); break;
            case 6:friday(x); break;
            case 7:saturday(x);break;
            default: break;
        }
        return Globals.output;

    }
}
