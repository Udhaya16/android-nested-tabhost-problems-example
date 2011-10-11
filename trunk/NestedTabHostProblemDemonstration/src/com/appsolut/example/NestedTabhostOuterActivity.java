package com.appsolut.example;

import android.os.Bundle;

public class NestedTabhostOuterActivity extends AbstractTabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outer_tab_host);
        
        addTab(getString(R.string.outer), NestedTabhostInnerActivity.class);
    }


}