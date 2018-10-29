package uitcourse.j11.nt118.appmusichtcl.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import uitcourse.j11.nt118.appmusichtcl.Model.Baihat;
import uitcourse.j11.nt118.appmusichtcl.R;

public class PlayNhacActivity extends AppCompatActivity {

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
    }
}
