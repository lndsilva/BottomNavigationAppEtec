package br.com.etecia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class FavoritoActivity extends AppCompatActivity {

    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorito_layout);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //  getSupportActionBar().setTitle("Favoritos");
        // getSupportActionBar().setIcon(R.drawable.ic_favorite);
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_setinha);
        toolbar = (Toolbar) findViewById(R.id.idToolBar);

        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navigation_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
