package com.projectsweetwish.isitchristmas;

import java.util.Calendar;

/**
 * Created by Tamás on 11/11/2014.
 * <p/>
 * This class counts the day until christmas.
 */
public class DayCounter {


    private int daysInYear; // Does there 365 or 366 day in this year
    private int xmasDay; // On what day is christmas
    private int thisYear; // Which year is now
    private int today; // Todays number
    private int daysUntilXmas;

    // The constuctor sets  which year is now, what day in this year the christmas, and how much days are in this year
    public DayCounter() {
        Calendar c = Calendar.getInstance();
        thisYear = c.get(Calendar.YEAR);

        if (thisYear % 4 == 0 && thisYear % 100 != 0) {
            daysInYear = 366;
        } else {
            daysInYear = 365;
        }
        xmasDay = daysInYear - 6;
        setTodayAndNumOfDays();

    }

    private void setTodayAndNumOfDays() {
        Calendar c = Calendar.getInstance();
        today= c.get(Calendar.DAY_OF_YEAR);
        daysUntilXmas=xmasDay-today;

        // To have a correct date after christmas
        if (daysUntilXmas<0) {
            daysUntilXmas=daysUntilXmas*(-1)+daysInYear;
        }

    }

    public int getDaysUntilXmas() {
        return daysUntilXmas;
    }



}
