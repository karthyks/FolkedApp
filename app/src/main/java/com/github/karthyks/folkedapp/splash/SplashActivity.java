package com.github.karthyks.folkedapp.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import com.github.karthyks.folkedapp.R;

/**
 * Created by karthy on 5/14/16.
 */
public class SplashActivity extends AppCompatActivity implements ISplashView {


  private ProgressBar progressBar;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);
  }

  private void injectViews() {
    progressBar = (ProgressBar) findViewById(R.id.progressBar_splash);
  }

  @Override
  public void showProgressBar() {
    progressBar.setVisibility(View.VISIBLE);
  }

  @Override
  public void hideProgressBar() {
    progressBar.setVisibility(View.GONE);
  }
}
