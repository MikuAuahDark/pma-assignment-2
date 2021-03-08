package id.co.npad93.pm.t2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void openArticle(View view) {
        startActivity(new Intent(this, ArticleActivity.class));
    }

    public void openBiodata(View view) {
        startActivity(new Intent(this, BiodataActivity.class));
    }
}
