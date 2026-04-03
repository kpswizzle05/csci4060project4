package edu.uga.cs.countryquiz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import edu.uga.cs.countryquiz.MainActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SplashFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class SplashFragment extends Fragment {
    private Button startQuizButton;
    private Button resultsButton;

    public SplashFragment() {
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

    public void onInitializationFinished(boolean success) {
        startQuizButton.setEnabled(success);
        resultsButton.setEnabled(success);
    }
}
