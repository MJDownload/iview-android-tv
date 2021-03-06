package io.github.nextux.iview.activities;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import io.github.nextux.iview.R;

public class SearchActivity extends BaseActivity {

    private static final int MY_PERMISSIONS_REQUEST_RECORD_AUDIO = 101;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // check voice record permission

        if (ContextCompat.checkSelfPermission(SearchActivity.this,
                Manifest.permission.READ_CONTACTS)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(SearchActivity.this,
                    Manifest.permission.RECORD_AUDIO)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

                //for now just return to previous screen.
                this.finish();

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(SearchActivity.this,
                        new String[]{Manifest.permission.RECORD_AUDIO},
                        MY_PERMISSIONS_REQUEST_RECORD_AUDIO);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }




    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_RECORD_AUDIO: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    setContentView(R.layout.search_activity);

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.

                    //return to current state.
                    this.finish();

                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }


    @Override
    public boolean onSearchRequested() {
        startActivity(new Intent(this, SearchActivity.class));
        return true;
    }
}