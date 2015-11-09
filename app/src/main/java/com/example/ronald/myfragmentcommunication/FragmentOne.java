package com.example.ronald.myfragmentcommunication;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    int count = 0;
    Button b;

    public interface FragmentOnClickListener {
        public void FragmentOnClickListener(int position);
    }


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null) {
            Integer incount;
            incount = savedInstanceState.getInt("Count");
            count = incount;
        }


        View v = inflater.inflate(R.layout.fragment_one, container, false);
        b = (Button) v.findViewById(R.id.btnClickMe);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                FragmentOnClickListener act = (FragmentOnClickListener) getActivity();
                Log.d("MYDATA", "FragmentOneOncreactView Count" + count);
                act.FragmentOnClickListener(count);

            }
        });
        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", count);

    }


}
