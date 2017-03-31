package com.true_bunta.calc.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.true_bunta.calc.R;

/**
 * Created by bunta on 31.03.17.
 */
public class CalcBoardFragment extends Fragment {

    public static final String TAG = "CalcBoardFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calc_board_fragment, null);
    }
}
