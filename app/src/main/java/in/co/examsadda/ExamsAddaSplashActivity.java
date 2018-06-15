package in.co.examsadda;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import in.co.examsadda.view.HomeActivity;

public class ExamsAddaSplashActivity extends AppCompatActivity {

    private static final String TAG = ExamsAddaSplashActivity.class.getSimpleName();

    private final int SPLASH_DISPLAY_LENGTH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_exams_adda_splash );
        ActionBar actionBar = getSupportActionBar();
        if(null != actionBar){
            actionBar.hide();
        }

        new Handler().postDelayed( new Runnable(){
            @Override
            public void run(){
                Intent startActivityIntent = new Intent(ExamsAddaSplashActivity.this, HomeActivity.class);
                startActivity(startActivityIntent);
                ExamsAddaSplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
