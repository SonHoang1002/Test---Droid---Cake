package com.example.droid_______cake;



import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    String cake = "You don't choose cake";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ClickCart(View view) {
        Intent i = new Intent(getApplicationContext(), OrderActivity.class);
        i.putExtra("cake", cake);
        startActivity(i);
    }
    public void orderCake(View view) {
        switch (view.getId()) {
            case R.id.donut:
                Toast.makeText(this, R.string.donut_order_message, Toast.LENGTH_SHORT).show();
                cake = getString(R.string.donut_order_message);
                break;
            case R.id.froyo:
                Toast.makeText(this, R.string.froyo_order_message, Toast.LENGTH_SHORT).show();
                cake = getString(R.string.froyo_order_message);
                break;
            case R.id.ice_cream:
                Toast.makeText(this, R.string.ice_cream_order_message, Toast.LENGTH_SHORT).show();
                cake = getString(R.string.ice_cream_order_message);
                break;
            default:
                break;
        }
    }





    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}