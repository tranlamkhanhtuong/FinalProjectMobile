package uitcourse.j11.nt118.appmusichtcl.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import uitcourse.j11.nt118.appmusichtcl.R;

public class DanhsachtatcaAlbumActivity extends AppCompatActivity {

    RecyclerView recyclerViewAlalbum;
    Toolbar toolbaralbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsachtatca_album);
        init();
    }

    // Anh xa
    private void init() {
        recyclerViewAlalbum = findViewById(R.id.recyclerviewAlalbum);
        toolbaralbum = findViewById(R.id.toolbaralalbum);
        // Tro ve
        setSupportActionBar(toolbaralbum);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tất cả album");
        toolbaralbum.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
