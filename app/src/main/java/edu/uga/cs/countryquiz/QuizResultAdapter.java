package edu.uga.cs.countryquiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuizResultAdapter extends RecyclerView.Adapter<QuizResultAdapter.ViewHolder> {

    private List<Result> results;

    public QuizResultAdapter(List<Result> results) {
        this.results = results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_quiz_result, parent, false);
        return new RecyclerView.ViewHolder(view);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Result result = results.get(position);
        holder.dateText.setText(result.getDate());
        holder.scoreText.setText("Score: " + result.getScore());
    }

    @Override
    public int getItemCount() {
        return results == null ? 0 : results.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView dateText;
        TextView scoreText;

        ViewHolder(View itemView) {
            super(itemView);
            dateText = itemView.findViewById(R.id.itemDateText);
            scoreText = itemView.findViewById(R.id.itemScoreText);
        }

    }
}
