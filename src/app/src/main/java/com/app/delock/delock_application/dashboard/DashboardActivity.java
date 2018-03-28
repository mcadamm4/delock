package com.app.delock.delock_application.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.app.delock.delock_application.R;
import com.app.delock.delock_application.browse.BrowseActivity;
import com.app.delock.delock_application.my_profile.MyProfileActivity;
import com.google.android.gms.common.data.DataHolder;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navMenu = findViewById(R.id.navigation);
        navMenu.setSelectedItemId(R.id.navigation_dashboard);
        navMenu.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        Intent intent;
                        // set item as selected to persist highlight
                        switch (menuItem.getItemId()) {
                            case R.id.navigation_home:
                                intent = new Intent(DashboardActivity.this, BrowseActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.navigation_dashboard:
                                break;
                            case R.id.navigation_myProfile:
                                intent = new Intent(DashboardActivity.this, MyProfileActivity.class);
                                startActivity(intent);
                                break;
                        }
                        return true;
                    }
                });
    }

}
