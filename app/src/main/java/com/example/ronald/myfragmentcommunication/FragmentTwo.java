package com.example.ronald.myfragmentcommunication;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
    TextView tv;
    Integer thisCount;



    public FragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_two, container, false);
        tv = (TextView) v.findViewById(R.id.txtCount);

        if(savedInstanceState != null ){
            Integer incount;
            incount = savedInstanceState.getInt("Count");
            thisCount = incount;
            //FragmentOnClickListener act = (FragmentOnClickListener) getActivity();
            //act.FragmentOnClickListener(savedInstanceState.getInt("Count"));
            Log.d("MYDATA", "FragmentTwoOnCreate Count" + incount);
            tv.setText("Count" + incount);
        }
        else{
            Log.d("MYDATA", "EHHHH");
        }


        return v;
    }

    public void setCount(int data) {
        thisCount = data;

        tv.setText("Count: " + data);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(thisCount!=null) {
            Log.d("MYDATA", "This Count is: " + thisCount);
            outState.putInt("Count", thisCount);
        }
        else{
            Log.d("MYDATA", "This Count is: " + 0);
        }


    }
}
