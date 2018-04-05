package com.example.fernana6.activitiesandfragments.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.example.fernana6.activitiesandfragments.R;
import com.example.fernana6.activitiesandfragments.fragment.FragmentBotones1;
import com.example.fernana6.activitiesandfragments.fragment.FragmentBotones2;
import com.example.fernana6.activitiesandfragments.fragment.FragmentListView;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //declaro los fragmentos
        /*FragmentTransaction mFragmentTransaction;
        FragmentManager mFragmentManager;
        //hago un acto de fe
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragmento1, new FragmentBotones1());
        mFragmentTransaction.replace(R.id.fragmento2, new FragmentBotones2());
        mFragmentTransaction.commit();*/


        getSupportFragmentManager().beginTransaction().replace(R.id.fragmento1, new FragmentListView()).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmento2, new FragmentBotones1()).commit();
    }
}
