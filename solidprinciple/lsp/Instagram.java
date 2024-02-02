package solidprinciple.lsp;

public class Instagram extends SocialMediaService {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {  // This method is suppoted the by the Instagram social media plattform and it voilets the LSP principle. To solve this issue we have abstracted out using interfaces


    }
}
