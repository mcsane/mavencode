package task6_4.model;

public class Note {
    private String note;
    private String content;

    public Note(String title, String content) {
        this.note = title;
        this.content = content;
    }
    public String getNote() {
        return note;
    }
    public String getContent() {
        return content;
    }


}
