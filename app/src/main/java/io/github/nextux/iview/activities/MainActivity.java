package io.github.nextux.iview.activities;

import android.content.Intent;
import android.os.Bundle;

import io.github.nextux.iview.R;

public class MainActivity extends BaseActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public boolean onSearchRequested() {
        startActivity(new Intent(this, SearchActivity.class));
        return true;
    }
}