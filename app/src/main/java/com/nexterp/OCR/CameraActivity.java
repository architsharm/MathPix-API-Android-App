package com.nexterp.OCR;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class CameraActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!MarshmallowPermissions.checkPermissionForCamera(this)) {
            MarshmallowPermissions.requestPermissionForCamera(this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
