package pavan.udacityandroidnd.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int duration = Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        */

        final CharSequence text1 = "This button will launch my Spotify Streamer App!";
        final CharSequence text2 = "This button will launch my Super Duo Football Scores App!";
        final CharSequence text3 = "This button will launch my Super Duo Library App!";
        final CharSequence text4 = "This button will launch my Build it Bigger  App!";
        final CharSequence text5 = "This button will launch my XYZ Reader App!";
        final CharSequence text6 = "This button will launch my Capstone App!";



        Button button1 = (Button) findViewById(R.id.first_app);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), text1, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button2 = (Button) findViewById(R.id.second_app);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), text2, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button3 = (Button) findViewById(R.id.third_app);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), text3, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button4 = (Button) findViewById(R.id.fourth_app);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), text4, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button5 = (Button) findViewById(R.id.fifth_app);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), text5, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button6 = (Button) findViewById(R.id.own_app);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), text6, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
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
}
