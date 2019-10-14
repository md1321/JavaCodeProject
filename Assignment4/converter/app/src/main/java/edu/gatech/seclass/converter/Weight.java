package edu.gatech.seclass.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;



    public class Weight extends AppCompatActivity {

        public String poundToKilogram(double pound) {
            double kilogram = pound / 2.20462;
            return String.valueOf(kilogram);
        }

        public String kilogramToPound(double kilogram) {
            double pound = kilogram * 2.20462;
            return String.valueOf(pound);
        }

        public void handleWeightClick(View view) throws NumberFormatException {
            boolean wchecked = ((RadioButton) view).isChecked();

            try {
                EditText txt = (EditText) findViewById(R.id.weightText);

                double mass = Double.parseDouble(txt.getText().toString());

                switch (view.getId()) {
                    case R.id.poundsset:
                        if (wchecked)
                            txt.setText(kilogramToPound(mass));
                        break;
                    case R.id.kilogramsset:
                        if (wchecked)
                            txt.setText(poundToKilogram(mass));
                        break;


                }
            } catch (NumberFormatException e) {
            }
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_weight);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_weight, menu);
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

