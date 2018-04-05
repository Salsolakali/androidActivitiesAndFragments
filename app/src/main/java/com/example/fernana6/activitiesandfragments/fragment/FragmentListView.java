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
 * {@link FragmentListView.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentListView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentListView extends Fragment {

    private OnFragmentInteractionListener mListener;

    public FragmentListView() {
        // Required empty public constructor
    }

    public static FragmentListView newInstance(String param1, String param2) {
        FragmentListView fragment = new FragmentListView();
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
        View view = inflater.inflate(R.layout.fragment_fragment_list_view, container, false);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
