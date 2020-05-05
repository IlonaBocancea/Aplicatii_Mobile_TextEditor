package com.example.applicationmy;

import android.preference.PreferenceActivity;
import android.widget.EditText;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends PreferenceActivity {
    public EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addContentView(R.xml.reference);
    }

    private void addContentView(int reference) {
    }
}
