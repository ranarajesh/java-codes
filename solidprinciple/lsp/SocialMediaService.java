package solidprinciple.lsp;

public abstract  class SocialMediaService {
    public abstract  void chatWithFriend();

    public abstract void publishPost(Object post);

    public abstract  void sendPhotosAndVideos();

    public abstract  void groupVideoCall(String... users);
}
