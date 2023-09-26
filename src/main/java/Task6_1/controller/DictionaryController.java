package Task6_1.controller;
import Task6_1.view.DictionaryView;
import Task6_1.model.Dictionary;
public class DictionaryController {
    private Dictionary dictionary = new Dictionary();
    private DictionaryView gui;
    public DictionaryController(DictionaryView gui) {
        this.gui = gui;
        for (int i = 0; i < 10; i++) {
            dictionary.addWord("word" + i, "meaning" + i);
        }
    }
    public void search(){
        String word = gui.getWord();
        String meaning = dictionary.getMeaning(word);
        gui.setMeaning(meaning);
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}
