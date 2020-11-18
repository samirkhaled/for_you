package samir.com.foryou;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int [] photos={R.mipmap.man,R.mipmap.man,R.mipmap.man2,R.mipmap.man3,R.mipmap.man4
                ,R.mipmap.man5,R.mipmap.man6,R.mipmap.man7,R.mipmap.man8,R.mipmap.man9};
        String [] names={"Bhaa","Sameh","Mahmod","Mouhmed","Karm","Saad",
                "Fhiem","Mouza","Hamza","Omar"};

        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler);
        Adapter adapter=new Adapter(MainActivity.this,names,photos);
        recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        recyclerview.setAdapter(adapter);

    }
}
