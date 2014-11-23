package com.example.software;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DifficultyActivity extends Activity {

	Button easy;
	Button medium;
	Button hard;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.difficulty_view);

		// find view-elements
		easy = (Button) findViewById(R.id.easybutton);
		medium = (Button) findViewById(R.id.mediumbutton);
		hard = (Button) findViewById(R.id.hardbutton);

		// create click listener
		OnClickListener oclEasy = new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), EasyActivity.class);
				startActivity(i);
			}
		};

		OnClickListener oclMedium = new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), MediumActivity.class);
				startActivity(i);
			}
		};

		OnClickListener oclHard = new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getBaseContext(), HardActivity.class);
				startActivity(i);
			}
		};

		// assign click listeners
		easy.setOnClickListener(oclEasy);
		medium.setOnClickListener(oclMedium);
		hard.setOnClickListener(oclHard);
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
