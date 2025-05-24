package socialmedia.model;

public class Post {
    private String caption;
    private String postImagePath;

    public Post(String caption, String postImagePath) {
        this.caption = caption;
        this.postImagePath = postImagePath;
    }

    public String getCaption() {
        return caption;
    }

    public String getPostImagePath() {
        return postImagePath;
    }
}
