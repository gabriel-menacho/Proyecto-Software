package com.example.software;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class EasyActivity extends Activity {
	Button niv1;
	Button niv2;
	Button niv3;
	Button niv4;
	@Override
    public void onCreate(Bundle savedInstanceState) {         

       super.onCreate(savedInstanceState);    
       setContentView(R.layout.easy_view);
       //rest of the code
       // find view-elements
       niv1 = (Button) findViewById(R.id.Button1);
       niv2 = (Button) findViewById(R.id.Button2);
       niv3 = (Button) findViewById(R.id.Button3);
       niv4 = (Button) findViewById(R.id.Button4);
       
       // create click listener
       OnClickListener n1 = new OnClickListener() {
           @Override
           public void onClick(View v) {
           	Intent i = new Intent(getBaseContext(), Niveles.class);
           	Bundle b = new Bundle();
   			b.putInt("key", 0); //Your id
   			i.putExtras(b); //Put your id to your next Intent
   			startActivity(i);
   			
           }
         };
         
         OnClickListener n2 = new OnClickListener() {
             @Override
             public void onClick(View v) {
            	 	Intent i = new Intent(getBaseContext(), Niveles.class);
                	Bundle b = new Bundle();
        			b.putInt("key", 1); //Your id
        			i.putExtras(b); //Put your id to your next Intent
        			startActivity(i);
             }
           };
           
           OnClickListener n3 = new OnClickListener() {
               @Override
               public void onClick(View v) {
            	   Intent i = new Intent(getBaseContext(), Niveles.class);
                  	Bundle b = new Bundle();
          			b.putInt("key", 2); //Your id
          			i.putExtras(b); //Put your id to your next Intent
          			startActivity(i);
               }
             };
            OnClickListener n4 = new OnClickListener() {
                 @Override
                 public void onClick(View v) {
                	 Intent i = new Intent(getBaseContext(), Niveles.class);
                    	Bundle b = new Bundle();
            			b.putInt("key", 3); //Your id
            			i.putExtras(b); //Put your id to your next Intent
            			startActivity(i);
                 }
               };
         
       // assign click listeners
       niv1.setOnClickListener(n1);
       niv2.setOnClickListener(n2);
       niv3.setOnClickListener(n3);
       niv4.setOnClickListener(n4);
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
}
