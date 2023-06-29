package DesignPattern.Builder;

public class User {
    private final String userId;
    private final String emailId;
    private final String userName;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public User(userBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.userId;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserName() {
        return userName;
    }

    //inner class to create objects
    static class userBuilder {

        private String userId;
        private String userName;
        private String emailId;

        public userBuilder() {

        }

        public userBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public userBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public userBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
