package com.projectsweetwish.isitchristmas;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class GreenPage extends ActionBarActivity {

    private TextView number;
    private TextView days;
    private TextView until;
    private TextView christmas;
    private DayCounter dc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_page);
        setFonts();
        dc = new DayCounter();
        Log.v("app_verbose", "daysUntilXmas => " + dc.getDaysUntilXmas());
        number.setText(String.valueOf(dc.getDaysUntilXmas()));

    }

    public void setFonts(){
        Typeface robotoCondensedBold = Typeface.createFromAsset(getAssets(), "fonts/RobotoCondensed-Bold.ttf");
        number = (TextView) findViewById(R.id.number);
        days= (TextView) findViewById(R.id.days);
        until = (TextView) findViewById(R.id.until);
        christmas = (TextView) findViewById(R.id.christmas);
        number.setTypeface(robotoCondensedBold);
        days.setTypeface(robotoCondensedBold);
        until.setTypeface(robotoCondensedBold);
        christmas.setTypeface(robotoCondensedBold);

    }

    public void onResume(){
        super.onResume();
        dc = new DayCounter();
        number.setText(String.valueOf(dc.getDaysUntilXmas()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.green_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
        return super.onOptionsItemSelected(item);
    }
}
