package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.popup_menu);
                popup.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.mercury:
                // do your code
                return true;
            case R.id.venus:
                // do your code
                return true;
            case R.id.earth:
                // do your code
                return true;
            case R.id.mars:
                // do your code
                return true;
            case R.id.jupiter:
                // do your code
                return true;
            case R.id.saturn:
                // do your code
                return true;
            case R.id.uranus:
                // do your code
                return true;
            case R.id.neptune:
                // do your code
                return true;
            case R.id.pluto:
                // do your code
                return true;

            default:
                return false;
        }
    }

}

