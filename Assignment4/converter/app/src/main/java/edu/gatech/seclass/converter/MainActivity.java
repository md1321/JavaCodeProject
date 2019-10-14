package edu.gatech.seclass.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (savedInstanceState == null)
//            getFragmentManager().beginTransaction()
//            .add(R.id.container, new PlaceholderFragment())
//            .commit();

    }

    public void convDistance(View view) {
        Intent goDist = new Intent(this, Distance.class);
        startActivity(goDist);
    }

    public void convArea(View view) {
        Intent goArea = new Intent(this, Area.class);
        startActivity(goArea);
    }

    public void convCurrency(View view) {
        Intent goCurr = new Intent(this, Currency.class);
        startActivity(goCurr);
    }

    public void convFluid(View view) {
        Intent goFluids = new Intent(this, Fluids.class);
        startActivity(goFluids);
    }

    public void convWeight(View view) {
        Intent goWeight = new Intent(this, Weight.class);
        startActivity(goWeight);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /*
    *A placeholder fragment containing a simple view
     */

//    public static class PlaceholderFragment extends Fragment {
//
//        public PlaceholderFragment(){
//        }
//
//        @Override
//        public View OnCreationView(LayoutInflater inflater) ViewGroup container,
//            Bundle saveInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main, conntainer, false);
//            return rootView;
//
//        }

}
