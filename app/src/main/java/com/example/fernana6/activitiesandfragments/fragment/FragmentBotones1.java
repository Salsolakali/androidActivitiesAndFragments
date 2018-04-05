package com.example.fernana6.activitiesandfragments.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fernana6.activitiesandfragments.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentBotones1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentBotones1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentBotones1 extends Fragment {

    private OnFragmentInteractionListener mListener;

    public FragmentBotones1() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static FragmentBotones1 newInstance(String param1, String param2) {
        FragmentBotones1 fragment = new FragmentBotones1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fragment_botones1, container, false);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
