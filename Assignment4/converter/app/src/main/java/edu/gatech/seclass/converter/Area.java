package edu.gatech.seclass.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Area extends AppCompatActivity {

    public String sqFeetSqToSqMeter(double sqFeet) {
        double sqMeter = sqFeet / 10.7639;
        return String.valueOf(sqMeter);
    }

    public String sqMeterToSqFeet(double sqMeter) {
        double sqFeet = sqMeter * 10.7639;
        return String.valueOf(sqFeet);
    }

    public void handleAreaClick(View view) throws NumberFormatException {
        boolean achecked = ((RadioButton) view).isChecked();

        EditText txt = (EditText) findViewById(R.id.areaText);
        try {
            double area = Double.parseDouble(txt.getText().toString());

            switch (view.getId()) {
                case R.id.sqfeetset:
                    if (achecked)
                        txt.setText(sqMeterToSqFeet(area));
                    break;
                case R.id.sqmeterset:
                    if (achecked)
                        txt.setText(sqFeetSqToSqMeter(area));
                    break;
            }
            }catch(NumberFormatException e){
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_area, menu);
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
