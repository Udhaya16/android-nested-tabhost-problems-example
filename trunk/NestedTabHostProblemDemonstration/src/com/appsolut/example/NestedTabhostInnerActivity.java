package com.appsolut.example;

import android.os.Bundle;

public class NestedTabhostInnerActivity extends AbstractTabActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inner_tab_host);
        addTab(getString(R.string.inner), NestedTabhostInnerContentActivity.class);
    }
}
