package com.swordartist.yusukesmallmvp.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.swordartist.yusukesmallmvp.R;
import com.swordartist.yusukesmallmvp.presenter.HomeFragmentPresenter;
import com.swordartist.yusukesmallmvp.presenter.IHomeFragmentPresenter;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment implements IHomeFragmentView {

    private TextView clickCountTextView;
    private IHomeFragmentPresenter homeFragmentPresenter;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HomeFragment.
     */
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        // create presenter
        fragment.createPresenter();
        return fragment;
    }

    public void createPresenter() {
        new HomeFragmentPresenter(getActivity(), this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        clickCountTextView = (TextView) rootView.findViewById(R.id.click_count_text_view);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.fragment_home_image_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onImageViewPressed();
            }
        });
        return rootView;
    }

    public void onImageViewPressed() {
        homeFragmentPresenter.imageViewPressed();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void setPresenter(IHomeFragmentPresenter homeFragmentPresenter) {
        this.homeFragmentPresenter = homeFragmentPresenter;
    }

    @Override
    public void showClickCountTextView(int number) {
        clickCountTextView.setText(String.valueOf(number));
    }
}
