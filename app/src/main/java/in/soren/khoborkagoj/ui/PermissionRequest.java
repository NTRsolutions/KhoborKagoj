package in.soren.khoborkagoj.ui;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;

import in.soren.khoborkagoj.Home;
import in.soren.khoborkagoj.R;
import in.soren.khoborkagoj.util.RuntimePermission;

/**
 * @author Gmonetix
 */

public class PermissionRequest extends RuntimePermission {

    private static final int REQUEST_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        requestAppPermission(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.ACCESS_NETWORK_STATE},R.string.permission,REQUEST_PERMISSION);
    }

    @Override
    public void onPermissionGranted(int requestCode) {
        startActivity(new Intent(PermissionRequest.this,Home.class));
        finish();
    }

}
