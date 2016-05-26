package com.yellowsheep.drinkordrive.ui.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatImageButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yellowsheep.drinkordrive.R;

public class AddDrinkFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    private View mRootView;
    private AppCompatImageButton mAddDrinkButton;

    public AddDrinkFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment AddDrinkFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddDrinkFragment newInstance(String param1, String param2) {
        AddDrinkFragment fragment = new AddDrinkFragment();
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
        View mRootView = inflater.inflate(R.layout.fragment_add_drink, container, false);

        mAddDrinkButton = (AppCompatImageButton) mRootView.findViewById(R.id.btn_add_drink);
        mAddDrinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStackImmediate();
            }
        });
        return mRootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }

        mListener.setTitle(getResources().getText(R.string.add_drink_title).toString());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener.onFragmentDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {

        void onFragmentDetach();
        void setTitle(String title);
    }
}
