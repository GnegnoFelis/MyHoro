package com.gnegno.horoscope;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentSecond extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static final String KEY = "taurus";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private BroadcastReceiver broadcastReceiver;

    public FragmentSecond() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSecond newInstance(String param1, String param2) {
        FragmentSecond fragment = new FragmentSecond();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_second, container, false);
        ImageView iv_imageZodiac = view.findViewById(R.id.iv_imageZodiac2);
        iv_imageZodiac.setImageDrawable(getResources().getDrawable
                (getResources().getIdentifier(KEY,"drawable", "com.gnegno.horoscope")));
        TextView tv_DescriptZodiac2 = view.findViewById(R.id.tv_NameOfZodiac2);
        tv_DescriptZodiac2.setText(KEY);

        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String text = intent.getStringExtra("taurus");
                TextView tv_DescriptZodiac = view.findViewById(R.id.tv_DescriptZodiac2);
                tv_DescriptZodiac.setText(text);
            }
        };

        return view;

    }

}
