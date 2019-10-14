package edu.gatech.seclass.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Distance extends AppCompatActivity {

    public String milesToKm(double miles) {
        double km = miles * 1.609;
        return String.valueOf(km);
    }

    public String kmToMiles(double km) {
        double miles = km / 1.609;
        return String.valueOf(miles);
    }

    public void handleDistClick(View view) throws NumberFormatException{
        boolean dchecked = ((RadioButton) view).isChecked();

        EditText txt = (EditText) findViewById(R.id.distText);


        try {
            double distance = Double.parseDouble(txt.getText().toString());


            switch (view.getId()) {
                case R.id.milesset:
                    if (dchecked)
                        txt.setText(kmToMiles(distance));
                    break;
                case R.id.kilometerset:
                    if (dchecked)
                        txt.setText(milesToKm(distance));
                    break;
            }
    } catch (NumberFormatException e) {}

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_distance, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
