package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private static final String Tag = "Practical2";
    private static final String Key = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.my_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent test = new Intent(MainActivity.this, TestActivity.class);
                test.putExtra(Key,"Message to pass");
                startActivity(test);


            }
        });


    }


    @Override
    protected void onStart()
    {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext() , "onStart called" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(Tag , "onStart called");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext() , "onResume called" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(Tag, "onResume called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext() , "onPause called" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(Tag , "onPause called");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext() , "onStop called" , Toast.LENGTH_LONG);
        toast.show();
        Log.d(Tag , "onStop called");
    }
    @Override
    protected void onDestroy() {

        Toast toast = Toast.makeText(getApplicationContext() , "onDestroy called" , Toast.LENGTH_LONG);
        toast.show();
        Log.e(Tag , "onDestroy called");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Toast toast = Toast.makeText(getApplicationContext() , "onRestart called" , Toast.LENGTH_LONG);
        toast.show();
        Log.i(Tag , "onRestart called");
        super.onRestart();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}