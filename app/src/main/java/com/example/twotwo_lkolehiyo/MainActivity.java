package com.example.twotwo_lkolehiyo;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

/** @noinspection ALL*/
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open,
                R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_Profile);
        }

    }



    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.nav_profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commit();
        } else if (itemId == R.id.nav_schedule) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ScheduleFragment()).commit();
        } else if (itemId == R.id.nav_grades) {
            // Check if the current fragment is already GradesFragment
            if (!(getSupportFragmentManager().findFragmentById(R.id.fragment_container) instanceof GradesFragment)) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GradesFragment()).commit();
            }
        } else if (itemId == R.id.nav_calendar) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CalendarFragment()).commit();
        } else if (itemId == R.id.nav_offices) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OfficesFragment()).commit();
        } else if (itemId == R.id.nav_vicente) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VicenteFragment()).commit();
        } else if (itemId == R.id.nav_history) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SocialsFragment()).commit();
        } else if (itemId == R.id.nav_logout) {
            Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(MainActivity.this, Login_Page.class);
            startActivity(intent);
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}



