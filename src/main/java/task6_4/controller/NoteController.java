package task6_4.controller;

import javafx.scene.control.ListView;
import task6_4.model.Note;
import task6_4.model.Notebook;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.util.List;

public class NoteController {
    private Notebook notebook;
    @FXML
    private TextField title;
    @FXML
    private TextArea content;
    @FXML
    private ListView listView;
    @FXML TextField kaka;


    public NoteController() {
        notebook = new Notebook();

    }
    @FXML
    public void addNotes() {
        String titleValue = title.getText();
        String contentValue = content.getText();
        Note note = new Note (titleValue, contentValue);
        notebook.addNote (note);
        title.clear();
        content.clear();
        listView.getItems().add(note.getNote());
    }
    @FXML
    public void search(){
        String titleC = (String) listView.getSelectionModel().getSelectedItem();
        if (titleC != null) {
            kaka.setText(notebook.getNoteByTitle(titleC).getContent());
        }
    }


}
