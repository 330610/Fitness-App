package com.example.csastudent2015.fitnessapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by csastudent2015 on 1/12/16.
 */
public class BodyInfoFragment extends Fragment{
    private TextView mHeight;
    private EditText mEnterHeight;
    private TextView mWeight;
    private EditText mEnterWeight;
    private TextView mBMI;
    private TextView mBmIState;



    private Button mNext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bodyinfo, container, false);
        mHeight = (TextView) rootView.findViewById(R.id.height);
        mWeight = (TextView) rootView.findViewById(R.id.weight);

        mEnterWeight = (EditText) rootView.findViewById(R.id.enter_weight);
        mEnterHeight = (EditText) rootView.findViewById(R.id.enter_height);
        mNext = (Button) rootView.findViewById(R.id.button);
        mBMI = (TextView) rootView.findViewById(R.id.BMI);
        mBmIState = (TextView) rootView.findViewById(R.id.BMIState);
        mNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                final FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, new BodyPicFragment(), "BodyPicFragment");
                ft.addToBackStack(null);
                ft.commit();
            }
        });



        return rootView;

    }







}
