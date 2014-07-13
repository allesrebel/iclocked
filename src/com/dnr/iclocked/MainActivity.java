package com.dnr.iclocked;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Sets the layout for this Activity. See res/layout/note_editor.xml
		setContentView(R.layout.loading);
	}

}
