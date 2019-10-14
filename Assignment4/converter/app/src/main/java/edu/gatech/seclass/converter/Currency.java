package edu.gatech.seclass.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Currency extends AppCompatActivity {

    public String dollarToEuros(double dollars) {
        double euros = dollars * 1.11;
        return String.valueOf(euros);
    }

    public String eurosToDollars(double euros) {
        double dollars = euros / 1.11;
        return String.valueOf(dollars);
    }

    public void handleCurrClick(View view) throws NumberFormatException{
        boolean cchecked = ((RadioButton) view).isChecked();

        EditText txt = (EditText) findViewById(R.id.currencyText);

        try {
            double currency = Double.parseDouble(txt.getText().toString());

            switch(view.getId()) {
                case R.id.dollarsset:
                    if(cchecked)
                        txt.setText(eurosToDollars(currency));
                    break;
                case R.id.eurosset:
                    if(cchecked)
                        txt.setText(dollarToEuros(currency));
                    break;
        }

        }catch (NumberFormatException e) {}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_currency, menu);
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
