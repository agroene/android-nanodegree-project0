package com.elev8it.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    private void showToast(Context context, CharSequence text)
    {
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchSpotifyStreamerApp(View view)
    {
        CharSequence text = "This button will launch my Spotify Streamer app!";

        showToast(getApplicationContext(), text);
    }

    public void launchScoresApp(View view)
    {
        CharSequence text = "This button will launch my Scores app!";

        showToast(getApplicationContext(), text);
    }


    public void launchLibraryApp(View view)
    {
        CharSequence text = "This button will launch my Library app!";

        showToast(getApplicationContext(), text);
    }

    public void launchBuildItBigger(View view)
    {
        CharSequence text = "This button will launch my Build it Bigger app!";

        showToast(getApplicationContext(), text);
    }

    public void launchXYZReader(View view)
    {
        CharSequence text = "This button will launch my XYZ Reader app!";

        showToast(getApplicationContext(), text);
    }

    public void launchCapstoneApp(View view)
    {
        CharSequence text = "This button will launch my capstone app!";

        showToast(getApplicationContext(), text);
    }
}
