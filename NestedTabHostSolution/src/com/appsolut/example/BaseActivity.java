package com.appsolut.example;

import android.app.Activity;
import android.app.TabActivity;


public class BaseActivity extends Activity {
	
	@Override
	/**
	 * This method redirects the
	 * onSearchRequested method call to
	 * the corresponding Activity.
	 */
    public boolean onSearchRequested() {
		Activity context = getActivityContext();
        if (context == this) {
        	return super.onSearchRequested();
        } else {
        	return context.onSearchRequested();
        }
    }
	
	/**
	 * This method will determine the correct
	 * context for the Activity.
	 * If the parent is a TabActivity the
	 * correct context which should be used
	 * is the context of the TabActivity.
	 * Otherwise the Activities context
	 * is sufficient.
	 * 
	 * @return The Activity representing the
	 * correct context.
	 */
    public Activity getActivityContext() {
    	if (getParent() instanceof TabActivity) {
            return getParent();
        } else {
            return this;
        }
    }
}
