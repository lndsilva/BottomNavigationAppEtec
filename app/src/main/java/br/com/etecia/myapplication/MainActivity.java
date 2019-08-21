package br.com.etecia.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btnNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.mFavorito:
                        startActivity(new Intent(getApplicationContext()
                                , FavoritoActivity.class));

                        break;
                    case R.id.mLocal:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Local", Toast.LENGTH_SHORT);

                        break;
                    case R.id.mRecentes:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Recentes", Toast.LENGTH_SHORT);

                        break;
                }
                return true;
            }
        });


    }


}
