package com.namtran.lazada.view.manhinhchao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.namtran.lazada.R;
import com.namtran.lazada.view.trangchu.TrangChuActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(SplashScreen.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    // handle error
                } finally {
                    Intent home = new Intent(SplashScreen.this, TrangChuActivity.class);
                    startActivity(home);
                    finish();
                }
            }
        });

        thread.start();
    }
}
