package task6_4.model;

import java.util.ArrayList;
import java.util.List;


public class Notebook {
    private List<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }
    public void addNote (Note note) {
        notes.add(note);
    }

    public Note getNoteByTitle(String title) {
        for (Note note : notes) {
            if (note.getNote().equals(title)) {
                return note;
            }
        }
        return null;
    }

}
