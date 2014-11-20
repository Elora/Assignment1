package kb50.phonedialler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class CountryActivity extends Activity {
	private TextView country;	
	private TextView number;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_country);
		
		number = (TextView) findViewById(R.id.number1);
		number.setText(getIntent().getStringExtra("tel"));
		
		country = (TextView) findViewById(R.id.country1);
		String phoneNumber = getCountry(getIntent().getStringExtra("tel"));
		country.setText(phoneNumber);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.country, menu);
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
	
    private String getCountry(String phoneNumber){
    	int countrycode = Integer.parseInt(phoneNumber.substring(0, 2));
    	String country = "";
    	switch(countrycode){
    		case 30:
    			country = "Greece";
    		break;
    		case 31:
    			country = "Netherlands";
    		break;
    		case 32:
    			country = "Belgium";
    		break;
    		case 33:
    			country = "France";
    		break;
    		case 34:
    			country = "Spain";
    		break;
    		case 36:
    			country = "Hungary";
    		break;
    		default:
    			country = "Something went wrong...";
    		break;
    	}
    	return country;
    }
    
    public void countryOnClick(View v){
    	switch(v.getId()){
		case R.id.countryButtonBack:
			startActivity(new Intent(this, MainActivity.class));
		break;
		case R.id.countryButtonCall:
			//call the number
		break;
    	}
    }
}

