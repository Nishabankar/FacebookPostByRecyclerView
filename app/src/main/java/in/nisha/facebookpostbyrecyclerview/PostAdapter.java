package in.nisha.facebookpostbyrecyclerview;

import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private ArrayList<Post>post;

    public PostAdapter(ArrayList<Post>posts){
        this.post = posts;
    }

    public class PostViewHolder extends  RecyclerView.ViewHolder {
        public ImageView imgPost;
        public ImageView imgLikeButton;
        public TextView txtPostTitle, txtPostLikes;


        public PostViewHolder(@NonNull View itemView)
        {
            super(itemView);

            imgPost = itemView.findViewById(R.id.imgPost);
            imgLikeButton=itemView.findViewById(R.id.imgLikeButton);
            txtPostTitle = itemView.findViewById(R.id.txtPostTitle);
            txtPostLikes = itemView.findViewById(R.id.txtPostLikes);

        }
    }


     @Override
     public  PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
         LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
         View view = layoutInflater.inflate(R.layout.post_view, null);

         return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder,int position) {
        Post posts = post.get(position);

        holder.imgPost.setImageResource(posts.getImageId());
        holder.txtPostTitle.setText(posts.getTitle());
        holder.txtPostLikes.setText("" + posts.getLikes());
        holder.imgLikeButton.setImageResource(posts.getLikeCount());

//        holder.imgPost.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(v.getContext(), "image:" +posts.getTitle(),Toast.LENGTH_LONG).show();
//                    }
//                }
//
//
//        );


//        holder.txtPostTitle.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(v.getContext(), "title:" +posts.getTitle(),Toast.LENGTH_LONG).show();
//                    }
//                }
//
//
//        );

        holder.imgLikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int likes = Integer.parseInt(holder.txtPostLikes.getText().toString());
                likes++;
                holder.txtPostLikes.setText("" + likes);
            }
        });
    }


    @Override
     public  int getItemCount(){

        return  post.size();
    }
}
//
//



