package com.true_bunta.calc.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.true_bunta.calc.R;
import com.true_bunta.calc.fragment.CalcBoardFragment;

public class MainActivity extends FragmentActivity {

    private CalcBoardFragment calcBoardFragment;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcBoardFragment = new CalcBoardFragment();
        manager = getSupportFragmentManager();
    }

    @Override
    protected void onStart() {

        transaction = manager.beginTransaction();

        if (manager.findFragmentByTag(CalcBoardFragment.TAG) == null) {
            transaction.add(R.id.conteiner_Board, calcBoardFragment, CalcBoardFragment.TAG);
        }
        transaction.commit();
        super.onStart();
    }
}
