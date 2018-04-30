package com.book.cash.cashbook.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.book.cash.cashbook.R;
import com.book.cash.cashbook.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView patientNameView;
    public TextView patientCPFView;
    public TextView dateView;
    public TextView valueView;
    public ImageView starView;
    public TextView numStarsView;


    public PostViewHolder(View itemView) {
        super(itemView);

        dateView = itemView.findViewById(R.id.post_date);
        patientNameView = itemView.findViewById(R.id.post_patient_name);
        patientCPFView = itemView.findViewById(R.id.post_patient_cpf);
        starView = itemView.findViewById(R.id.star);
        numStarsView = itemView.findViewById(R.id.post_num_stars);
        valueView = itemView.findViewById(R.id.post_value);
    }

    public void bindToPost(Post post, View.OnClickListener starClickListener) {
        dateView.setText(post.date);
        patientNameView.setText(post.patientName);
        patientCPFView.setText(post.patientCPF);
        numStarsView.setText(String.valueOf(post.starCount));
        valueView.setText(post.value);

        starView.setOnClickListener(starClickListener);
    }
}
