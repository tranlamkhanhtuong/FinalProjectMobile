package uitcourse.j11.nt118.appmusichtcl.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import uitcourse.j11.nt118.appmusichtcl.Model.Baihat;
import uitcourse.j11.nt118.appmusichtcl.R;

public class PlayNhacActivity extends AppCompatActivity {

    Toolbar toolbarplaynhac;
    TextView txttimesong, txttotaltimesong;
    SeekBar sktime;
    ImageView imgsuffle, imgplay, imgpre, imgnext, imgrepeat;
    ViewPager viewPagerplaynhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nhac);
        Intent intent = getIntent();
        if(intent.hasExtra("cakhuc")){
            Baihat baihat = intent.getParcelableExtra("cakhuc");

            Toast.makeText(this, baihat.getTenBaiHat(), Toast.LENGTH_SHORT).show();
        }

        if(intent.hasExtra("mangbaihat")){
            ArrayList<Baihat> mangbaihat = intent.getParcelableArrayListExtra("mangbaihat");
            for(int i = 0; i<mangbaihat.size(); i++){
                Log.e("PlayNhac", mangbaihat.get(i).getTenBaiHat());
            }
        }

        init();
    }

    private void init() {
        toolbarplaynhac = findViewById(R.id.toolbarplaynhac);
        txttimesong = findViewById(R.id.textviewtimesong);
        txttotaltimesong = findViewById(R.id.textviewtotaltimesong);
        sktime = findViewById(R.id.seekbarsong);
        imgnext = findViewById(R.id.imagebuttonnext);
        imgplay = findViewById(R.id.imagebuttonplay);
        imgpre = findViewById(R.id.imagebuttonpreview);
        imgrepeat = findViewById(R.id.imagebuttonrepeat);
        imgsuffle = findViewById(R.id.imagebuttonsuffle);
        viewPagerplaynhac = findViewById(R.id.viewpagerplaynhac);

        setSupportActionBar(toolbarplaynhac);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarplaynhac.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        toolbarplaynhac.setTitleTextColor(Color.WHITE);
    }
}
