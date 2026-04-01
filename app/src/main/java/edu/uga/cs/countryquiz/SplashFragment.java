package edu.uga.cs.countryquiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import MainActivity
import edu.uga.cs.countryquiz.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SplashFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SplashFragment extends Fragment {
    private Button startQuizButton;
    private Button resultsButton;

    public SplashFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SplashFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SplashFragment newInstance(String param1, String param2) {
        SplashFragment fragment = new SplashFragment();
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
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        startQuizButton = view.findViewById(R.id.startButton);
        resultsButton = view.findViewById(R.id.resultsButton);

        startQuizButton.setEnabled(false);
        resultsButton.setEnabled(false);

        //new InitializeDatabaseTask(requireContext(), this).execute();

        startQuizButton.setOnClickListener( v ->
                ((edu.uga.cs.countryquiz.MainActivity) requireActivity()).showFragment(new QuizFragment(), true)
        );
        resultsButton.setOnClickListener(v ->
                ((edu.uga.cs.countryquiz.MainActivity) requireActivity()).showFragment(new ResultsFragment(), true)
        );
    }
}
