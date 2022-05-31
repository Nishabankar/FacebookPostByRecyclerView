package in.nisha.facebookpostbyrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Post> post;
    private RecyclerView recyclerpost;
    private PostAdapter postAdapter;
    private int[] imgPost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initViews();
    }

    private void initViews() {
        recyclerpost = findViewById(R.id.recyclerPost);
        recyclerpost.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


    postAdapter=new PostAdapter(post);
    recyclerpost.setAdapter(postAdapter);
}


    private void initData(){
        imgPost=new int[]
                {R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,
                R.drawable.like1,

        };
        post = new ArrayList<Post>();
        for(int i=0; i<=10; i++)
        {
            post.add(
                    new Post(
                            i,
                            "Facebook",
                            0,
                            imgPost[i],
                            R.drawable.like2)
            );
        }
    }
}
