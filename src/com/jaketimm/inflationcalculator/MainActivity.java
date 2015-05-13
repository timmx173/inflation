package com.jaketimm.inflationcalculator;

import com.jaketimm.inflationcalculator.R;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     final Spinner spinner = (Spinner) findViewById(R.id.currencyBeforeSpinner);
     // Create an ArrayAdapter using the string array and a default spinner layout
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
             R.array.currency_before_array, android.R.layout.simple_spinner_item);
     // Specify the layout to use when the list of choices appears
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     // Apply the adapter to the spinner
     spinner.setAdapter(adapter);
     
     final Spinner spinner2 = (Spinner) findViewById(R.id.currencyAfterSpinner);
     ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.currency_after_array, android.R.layout.simple_spinner_item);
     adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     spinner2.setAdapter(adapter2);
     final EditText beforeYear = (EditText)findViewById(R.id.beforeYear);
     final EditText afterYear = (EditText)findViewById(R.id.afterYear);
     final EditText beforeText = (EditText)findViewById(R.id.beforeText);
     final EditText afterText = (EditText)findViewById(R.id.afterText);
     final Button button = (Button) findViewById(R.id.calculate);
     button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
        	 final String beforeSpinnerCurrency = spinner.getSelectedItem().toString();
             final String afterSpinnerCurrency = spinner2.getSelectedItem().toString();
        	 String beforeYearValue = beforeYear.getText().toString();
        	 String afterYearValue = afterYear.getText().toString();
        	 String beforeCurrencyValue = beforeText.getText().toString();
        	 //String afterCurrencyValue = afterText.getText().toString();
        	 if (beforeYearValue.matches("") || afterYearValue.matches("") || beforeCurrencyValue.matches("")){
        		DialogFragment newFragment = new NoValuesDialogFragment();
        		newFragment.show(getSupportFragmentManager(), "no values");
        	 }
        	 else{
        	 double afterValue = calculateValues(beforeYearValue, afterYearValue, beforeCurrencyValue, "0", beforeSpinnerCurrency, afterSpinnerCurrency);
        	 double returnValue = round(afterValue, 2);
        	 String returnString = String.valueOf(returnValue);
        	 afterText.setText(returnString);
         }}
     });
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
	protected double calculateValues(String beforeYearValue, String afterYearValue, String beforeCurrencyValue, String afterCurrencyValue, String beforeSpinnerCurrency, String afterSpinnerCurrency) {

		CurrencyObject beforeCurrencyObj = new CurrencyObject();
		beforeCurrencyObj.setCurrencyName(beforeSpinnerCurrency);
		CurrencyObject afterCurrencyObj = new CurrencyObject();
		afterCurrencyObj.setCurrencyName(afterSpinnerCurrency);
		int beforeYearVal = Integer.parseInt(beforeYearValue); 
		int afterYearVal = Integer.parseInt(afterYearValue);
		double beforeCurrencyVal = Double.parseDouble(beforeCurrencyValue);
		int afterCurrencyVal = Integer.parseInt(afterCurrencyValue);
		MathObject mathObject = new MathObject();
		double value = mathObject.doMath(beforeSpinnerCurrency, afterSpinnerCurrency, beforeCurrencyVal, beforeYearVal, afterYearVal);
		return value;
		
	}

	protected void calculateValues(View v, String before, String after) {
		
		CurrencyObject currencyBefore = new CurrencyObject();
		
		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public class NoValuesDialogFragment extends DialogFragment {
    	@Override
    	public Dialog onCreateDialog(Bundle savedInstanceState){
    		AlertDialog.Builder noValues = new AlertDialog.Builder(getActivity());
    		noValues.setMessage(R.string.positiveDialog).setNeutralButton(R.string.negativeDialog, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					
					
				}
			});
    		return noValues.create();
    	}
    }
    
}
