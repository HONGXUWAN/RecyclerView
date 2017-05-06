package cn.edu.jssvc.whx.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Fruit> fruitlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycler.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitlist);
        recycler.setAdapter(adapter);

    }

    private void initFruits() {
        for (int i=0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.mipmap.ic_launcher);
            fruitlist.add(apple);
            Fruit banana = new Fruit("Banana",R.mipmap.ic_launcher);
            fruitlist.add(banana);
            Fruit apple1 = new Fruit("Apple",R.mipmap.ic_launcher);
            fruitlist.add(apple1);
            Fruit banana1 = new Fruit("Banana",R.mipmap.ic_launcher);
            fruitlist.add(banana1);
            Fruit apple2 = new Fruit("Apple",R.mipmap.ic_launcher);
            fruitlist.add(apple2);
            Fruit banana2 = new Fruit("Banana",R.mipmap.ic_launcher);
            fruitlist.add(banana2);
        }
    }
}
