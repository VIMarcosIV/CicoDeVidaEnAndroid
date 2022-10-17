package org.iesch.cicodevidaenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("CICLODEVIDA", "Entramos al método onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CICLODEVIDA", "Entramos al método onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CICLODEVIDA", "Entramos al método onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CICLODEVIDA", "Entramos al método onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CICLODEVIDA", "Entramos al método onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CICLODEVIDA", "Entramos al método onDestroy");
    }
}