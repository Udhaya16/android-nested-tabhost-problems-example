package com.appsolut.example;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class NestedTabhostInnerContentActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
    }
    
    /**
     * The context for the AlertDialog.Builder
     * is now changed to the correct context
     * by using the getActivityContext() from
     * the BaseActivity.
     * @param v The view which is the source
     * of the call.
     */
    public void showDialog(View v) {
    	final AlertDialog.Builder builder = new AlertDialog.Builder(getActivityContext());
    	builder.setMessage(getString(R.string.dialogMessage));
    	builder.create().show();
    }
}
