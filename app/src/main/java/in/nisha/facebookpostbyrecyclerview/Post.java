package in.nisha.facebookpostbyrecyclerview;

public class Post {
    private int id;
    private String title;
    private int likes;
    private int likeCount;
    private int imageId;


    public Post(int id, String title,int likes, int likeCount,int imageId){
        this.id = id;
        this.title= title;
        this.likes=likes;
        this.likeCount = likeCount;
        this.imageId = imageId;


    }

    public int getId()
    {
        return id;

    }

    public void setId(int id)
    {

        this.id=id;
    }

    public  String getTitle(){
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }


    public int getLikes()
    {
        return likes;
        
    }
    public void setLike(int likes){
        
        this.likes = likes;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public  int getImageId()
    {
        return imageId;
    }
    public void setImageId(int imageId){

        this.imageId = imageId;
    }
}
