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

        TextView watch = (TextView) findViewById(R.id.watch);
        Date temp = Globals.calendar.getTime();
        watch.setText((CharSequence) temp);

        chooseday();

        TextView mainoutput = (TextView) findViewById(R.id.mainoutput);
        String join = Globals.output;
        mainoutput.setText(join);
    }





    public static String informatik_FT() {
        Globals.output="Informatik_FT" + "\nMid = ###########" + "\nKennwort = ######";
        return Globals.output;
    }

    public static String mathe_HK() {
        Globals.output = "Mathe_HK"+ "\nMid= " + "###########" + "\nKennwort = #####";
        return Globals.output;
    }

    public static String physiks_HS() {
        Globals.output="Physiks_HS" + "\nMid = ##########" + "\nKennwort = ######";
        return Globals.output;
    }

    public static String chemie_HM() {
        Globals.output = "Chemie_HM "+"\nMid = ##########" +"\nKennwort = #######";
        return Globals.output;
    }

    public static String deutsch_FS() {
        Globals.output ="Deutsch_FS"+ "\nMid = #########"+"\nKennwort = #######";
        return Globals.output;
    }

    public static String deutsch_FvW() {
        Globals.output ="Deutsch_FvW" + "\nMid = ###########"+ "\nKennwort = ######";
        return Globals.output;
    }

    public static String monday() {
        if (Globals.comparetime > 730 && Globals.comparetime < 850) {
            informatik_FT();}
        else if (Globals.comparetime > 910 && Globals.comparetime < 1030) {
            deutsch_FS();}
        else if (Globals.comparetime > 1030 && Globals.comparetime < 1200) {
            mathe_HK();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String tuesday() {
        if (Globals.comparetime > 730 && Globals.comparetime < 850) {
            mathe_HK();}
        else if (Globals.comparetime > 910 && Globals.comparetime < 1030) {
            chemie_HM();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String wednesday() {
        if (Globals.comparetime > 730 && Globals.comparetime < 850) {
            deutsch_FS();}
        else if (Globals.comparetime > 910 && Globals.comparetime < 1030) {
            informatik_FT();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String thursday() {
        if (Globals.comparetime > 730 && Globals.comparetime < 850) {
            physiks_HS();}
        else if (Globals.comparetime > 910 && Globals.comparetime < 1030) {
            chemie_HM();}
        else if (Globals.comparetime > 1030 && Globals.comparetime< 1200) {
            deutsch_FvW();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String friday() {
        if (Globals.comparetime > 730 && Globals.comparetime < 850) {
            deutsch_FvW();}
        else if (Globals.comparetime > 910 && Globals.comparetime < 1030) {
            mathe_HK();}
        else if (Globals.comparetime > 1030 && Globals.comparetime < 1200) {
            physiks_HS();}
        else {
            Globals.output= "Keinen Unterricht Jetzt.";}
        return Globals.output;
    }

    public static String saturday() {
        Globals.output = "Keinen Unterricht Jetzt. Heute ist Samstag";
        return Globals.output;
    }

    public static String sunday() {
        Globals.output = "Keinen Unterricht Jetzt. Heute ist Sonntag";
        return Globals.output;
    }


    public static String chooseday() {
        switch (Globals.dayofweek) {

            case 1:sunday(); break;
            case 2:monday(); break;
            case 3:tuesday(); break;
            case 4:wednesday(); break;
            case 5:thursday(); break;
            case 6:friday(); break;
            case 7:saturday();break;
            default: break;
        }
        return Globals.output;

    }
}
