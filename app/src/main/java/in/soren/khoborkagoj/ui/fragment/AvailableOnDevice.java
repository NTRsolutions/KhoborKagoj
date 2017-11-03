package in.soren.khoborkagoj.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.soren.khoborkagoj.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AvailableOnDevice extends Fragment {


    public AvailableOnDevice() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_available_on_device, container, false);
    }

}
