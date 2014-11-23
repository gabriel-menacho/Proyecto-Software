package com.example.software;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class Niveles extends Activity {
	
	  public void onCreate(Bundle savedInstanceState) {         

	       super.onCreate(savedInstanceState);    
	       setContentView(R.layout.niveles_view);
	       Bundle b = getIntent().getExtras();
	       int value = b.getInt("key");
	       Context context = getApplicationContext();
	       CharSequence text = String.valueOf(value);
	       int duration = Toast.LENGTH_SHORT;

	       Toast toast = Toast.makeText(context, text, duration);
	       toast.show();
	       //rest of the code
	  }
}
