package in.soren.khoborkagoj.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.soren.khoborkagoj.R;
import in.soren.khoborkagoj.adapter.HomeAdapter;

public class Home extends Fragment {

    @BindView(R.id.home_recyclerView) RecyclerView recyclerView;
    private View view;

    private List<String> pdfList;
    private HomeAdapter adapter;

    public Home() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null) {
            view =  inflater.inflate(R.layout.fragment_home, container, false);
            ButterKnife.bind(this,view);

            GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
            recyclerView.setLayoutManager(gridLayoutManager);

            pdfList = new ArrayList<>();
            adapter = new HomeAdapter(getActivity());
            recyclerView.setAdapter(adapter);
            adapter.setPdfList(pdfList);

        }

        return view;
    }

}
