package me.whiteship.designpatterns._02_structural_patterns._09_decorator._01_before;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("오징어게임이");
        client.writeComment("참여 하는게 재미 있을까...?");
        client.writeComment("http://naver.com");

    }
}
