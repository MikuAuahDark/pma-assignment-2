package id.co.npad93.pm.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_article);
    }

    public void openArticleSource(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.medcom.id/teknologi/game/yKXD6GXK-update-1-4-genshin-impact-ada-dating-simulator-kencan-sama-siapa"));
        startActivity(i);
    }
}
