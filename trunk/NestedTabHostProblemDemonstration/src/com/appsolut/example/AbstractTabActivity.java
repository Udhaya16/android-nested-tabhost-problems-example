package com.appsolut.example;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;

public class AbstractTabActivity extends TabActivity {

	protected void addTab(final String label, final Class<? extends Activity> clazz) {
		final TabHost tabHost = getTabHost();
		final Intent intent = new Intent(this, clazz);
		final TabHost.TabSpec spec = tabHost.newTabSpec(label);
		spec.setIndicator(label);
		spec.setContent(intent);
		tabHost.addTab(spec);
	}
}
