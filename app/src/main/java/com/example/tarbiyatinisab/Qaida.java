package com.example.tarbiyatinisab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tarbiyatinisab.fragments.qFragment_1;
import com.example.tarbiyatinisab.fragments.qFragment_10;
import com.example.tarbiyatinisab.fragments.qFragment_11;
import com.example.tarbiyatinisab.fragments.qFragment_12;
import com.example.tarbiyatinisab.fragments.qFragment_13;
import com.example.tarbiyatinisab.fragments.qFragment_14;
import com.example.tarbiyatinisab.fragments.qFragment_15;
import com.example.tarbiyatinisab.fragments.qFragment_16;
import com.example.tarbiyatinisab.fragments.qFragment_17;
import com.example.tarbiyatinisab.fragments.qFragment_2;
import com.example.tarbiyatinisab.fragments.qFragment_4;
import com.example.tarbiyatinisab.fragments.qFragment_5;
import com.example.tarbiyatinisab.fragments.qFragment_6;
import com.example.tarbiyatinisab.fragments.qFragment_7;
import com.example.tarbiyatinisab.fragments.qFragment_8;
import com.example.tarbiyatinisab.fragments.qFragment_9;
import com.example.tarbiyatinisab.fragments.qFragmeny_3;
import com.example.tarbiyatinisab.fragments.q_fragmentCover;

import java.util.ArrayList;
import java.util.List;

public class Qaida extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qaida);

        viewPager = findViewById(R.id.Q_view_pager);

        List<Fragment> list = new ArrayList<>();
        list.add(new q_fragmentCover());
        list.add(new qFragment_1());
        list.add(new qFragment_2());
        list.add(new qFragmeny_3());
        list.add(new qFragment_4());
        list.add(new qFragment_5());
        list.add(new qFragment_6());
        list.add(new qFragment_7());
        list.add(new qFragment_8());
        list.add(new qFragment_9());
        list.add(new qFragment_10());
        list.add(new qFragment_11());
        list.add(new qFragment_12());
        list.add(new qFragment_13());
        list.add(new qFragment_14());
        list.add(new qFragment_15());
        list.add(new qFragment_16());
        list.add(new qFragment_17());

        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);

    }
}
