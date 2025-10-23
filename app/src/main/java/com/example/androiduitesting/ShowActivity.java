package com.example.androiduitesting;

import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.androiduitesting.databinding.ActivityShowBinding;

public class ShowActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
private ActivityShowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Button button = findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras= getIntent().getExtras();
        TextView textbox = findViewById(R.id.textCityName);
        textbox.setText(extras.getString("city"));
    }
}