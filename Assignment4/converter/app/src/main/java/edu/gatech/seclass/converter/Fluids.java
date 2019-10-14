package edu.gatech.seclass.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Fluids extends AppCompatActivity {

    public String flOzToLtr(double floz) {
        double liter = floz / 33.814;
        return String.valueOf(liter);
    }

    public String ltrToFlOz(double liter) {
        double floz = liter * 33.814;
        return String.valueOf(floz);
    }

    public void handleFluidClick(View view) throws NumberFormatException {
        boolean fchecked = ((RadioButton) view).isChecked();

        try {
            EditText txt = (EditText) findViewById(R.id.fluidText);

            double volume = Double.parseDouble(txt.getText().toString());

            switch (view.getId()) {
                case R.id.flozsset:
                    if (fchecked)
                        txt.setText(ltrToFlOz(volume));
                    break;
                case R.id.litersset:
                    if (fchecked)
                        txt.setText(flOzToLtr(volume));
                    break;
            }
        } catch (NumberFormatException e) {
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluids);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fluids, menu);
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
