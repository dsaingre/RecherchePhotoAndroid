package com.example.picsearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends Activity{
	
	private Button commencer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_startscreen);
		
		commencer = (Button) findViewById(R.id.commencer);
		commencer.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {	
				Intent main = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(main);
				finish();
			}
		});
		
	}
}
