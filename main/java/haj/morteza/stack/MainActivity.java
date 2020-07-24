package haj.morteza.stack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.littlemango.stacklayoutmanager.StackLayoutManager;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    RecyclerView.Adapter mAdapter;
    String[] myDataset = new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc = findViewById(R.id.reccc);
        StackLayoutManager manager = new StackLayoutManager();
        rc.setLayoutManager(manager);
        myDataset[0] = "Felan";
        myDataset[1] = "Felan";
        myDataset[2] = "Felan";
        myDataset[3] = "Felan";
        mAdapter = new MyAdapter(myDataset);
        rc.setAdapter(mAdapter);


    }
}
