package kb50.phonedialler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	private EditText phoneField;
	private Intent i;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneField = (EditText) findViewById(R.id.phone_input);
        i = new Intent("kb50.PhoneDialler.CountryActivity");
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
    
    public void onClick(View v){
    	switch(v.getId()){
    		case R.id.show_country:
    			//String phone = ;
    			i.putExtra("tel", phoneField.getText().toString());
    			startActivity(i);
    		break;
    		case R.id.btn_1:
    			phoneField.setText(phoneField.getText() + "1");
    		break;
    		case R.id.btn_2:
    			phoneField.setText(phoneField.getText() + "2");
    		break;
    		case R.id.btn_3:
    			phoneField.setText(phoneField.getText() + "3");
    		break;
    		case R.id.btn_4:
    			phoneField.setText(phoneField.getText() + "4");
    		break;
    		case R.id.btn_5:
    			phoneField.setText(phoneField.getText() + "5");
    		break;
    		case R.id.btn_6:
    			phoneField.setText(phoneField.getText() + "6");
    		break;
    		case R.id.btn_7:
    			phoneField.setText(phoneField.getText() + "7");
    		break;
    		case R.id.btn_8:
    			phoneField.setText(phoneField.getText() + "8");
    		break;
    		case R.id.btn_9:
    			phoneField.setText(phoneField.getText() + "9");
    		break;
    		case R.id.btn_0:
    			phoneField.setText(phoneField.getText() + "0");
    		break;
    		case R.id.btn_back:
    			String phrase = phoneField.getText().toString();
    			String rephrase = "";
    			
    			if(phrase.length() >= 1){
    				rephrase = phrase.substring(0, phrase.length() - 1);
    				phoneField.setText(rephrase);
    			}
    		break;
    		case R.id.btn_ocd:
    			Context context = getApplicationContext();
    			CharSequence text = "I'm filler...";
    			int duration = Toast.LENGTH_SHORT;
    			
    			Toast toast = Toast.makeText(context, text, duration);
    			toast.show();
    		break;    		
    	}
    }
}
