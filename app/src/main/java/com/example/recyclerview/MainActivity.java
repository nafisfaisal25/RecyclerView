package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> mImageUrlList = new ArrayList<>();
    List<String> mImageNameList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateImageList();
        initRecyclerView();

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view);
        imageAdapter = new RecyclerViewAdapter(this,mImageNameList ,mImageUrlList );
        recyclerView.setAdapter(imageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void populateImageList() {

        mImageUrlList.add("https://i.picsum.photos/id/100/2500/1656.jpg");
        mImageNameList.add("Tina Rataj");

        mImageUrlList.add("https://i.picsum.photos/id/1000/5626/3635.jpg");
        mImageNameList.add("Lukas Budimaier");

        mImageUrlList.add("https://i.picsum.photos/id/1001/5616/3744.jpg");
        mImageNameList.add("Andrew Ridley");

        mImageUrlList.add("https://i.picsum.photos/id/1002/4312/2868.jpg");
        mImageNameList.add("Patric Fore");

        mImageUrlList.add("https://i.picsum.photos/id/1003/1181/1772.jpg");
        mImageNameList.add("Ben Mure");

        mImageUrlList.add("https://i.picsum.photos/id/1004/5616/3744.jpg");
        mImageNameList.add("Frances Gunn");


        mImageUrlList.add("https://i.picsum.photos/id/1005/5760/3840.jpg");
        mImageNameList.add("William Hoo");

        mImageUrlList.add("https://i.picsum.photos/id/1008/5616/3744.jpg");
        mImageNameList.add("Mike Wilson");

        mImageUrlList.add("https://i.picsum.photos/id/1011/5472/3648.jpg");
        mImageNameList.add("Donald Trump");

        mImageUrlList.add("https://i.picsum.photos/id/1012/3973/2639.jpg");
        mImageNameList.add("Roger Federer");

        mImageUrlList.add("https://i.picsum.photos/id/1015/6000/4000.jpg");
        mImageNameList.add("Lionel Messi");

        mImageUrlList.add("https://i.picsum.photos/id/1018/3914/2935.jpg");
        mImageNameList.add("Tamim Iqbal");

        mImageUrlList.add("https://i.picsum.photos/id/10/2500/1667.jpg");
        mImageNameList.add("Paul jarvis");

        mImageUrlList.add("https://i.picsum.photos/id/100/2500/1656.jpg");
        mImageNameList.add("Tina Rataj");

        mImageUrlList.add("https://i.picsum.photos/id/1000/5626/3635.jpg");
        mImageNameList.add("Lukas Budimaier");

        mImageUrlList.add("https://i.picsum.photos/id/1001/5616/3744.jpg");
        mImageNameList.add("Andrew Ridley");

        mImageUrlList.add("https://i.picsum.photos/id/1002/4312/2868.jpg");
        mImageNameList.add("Patric Fore");

        mImageUrlList.add("https://i.picsum.photos/id/1003/1181/1772.jpg");
        mImageNameList.add("Ben Mure");

        mImageUrlList.add("https://i.picsum.photos/id/1004/5616/3744.jpg");
        mImageNameList.add("Frances Gunn");

        mImageUrlList.add("https://i.picsum.photos/id/1005/5760/3840.jpg");
        mImageNameList.add("William Hoo");

        mImageUrlList.add("https://i.picsum.photos/id/1008/5616/3744.jpg");
        mImageNameList.add("Mike Wilson");

        mImageUrlList.add("https://i.picsum.photos/id/1011/5472/3648.jpg");
        mImageNameList.add("Donald Trump");

        mImageUrlList.add("https://i.picsum.photos/id/1012/3973/2639.jpg");
        mImageNameList.add("Roger Federer");

        mImageUrlList.add("https://i.picsum.photos/id/1015/6000/4000.jpg");
        mImageNameList.add("Lionel Messi");

        mImageUrlList.add("https://i.picsum.photos/id/1018/3914/2935.jpg");
        mImageNameList.add("Tamim Iqbal");

        mImageUrlList.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mImageNameList.add("bangladesh");

    }
}
