package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = false;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임이");
        client.writeComment("참여 하는게 재미 있을까...?");
        client.writeComment("http://naver.com");
    }
}
