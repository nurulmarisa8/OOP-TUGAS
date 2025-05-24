package socialmedia.model;

public class User {
    private String nickName;
    private String fullName;
    private String profileImagePath;

    public User(String nickName, String fullName, String profileImagePath) {
        this.nickName = nickName;
        this.fullName = fullName;
        this.profileImagePath = profileImagePath;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }
}
