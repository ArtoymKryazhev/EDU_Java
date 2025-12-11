package Lab_7_2;

import java.util.ArrayList;
import java.util.List;

public class NotesPresenter {
    private final NotesView view;
    private final List<NoteModel> notes = new ArrayList<>();

    public NotesPresenter(NotesView view) {
        this.view = view;
    }

    public void createNote(String title, String content) {
        notes.add(new NoteModel(title, content));
        view.showMessage("Заметка создана");
        view.showNotes(notes);
    }

    public void editNote(int index, String newTitle, String newContent) {
        if (index < 0 || index >= notes.size()) {
            view.showMessage("Неверный индекс заметки");
            return;
        }
        NoteModel note = notes.get(index);
        note.setTitle(newTitle);
        note.setContent(newContent);
        view.showMessage("Заметка обновлена");
        view.showNotes(notes);
    }

    public void deleteNote(int index) {
        if (index < 0 || index >= notes.size()) {
            view.showMessage("Неверный индекс заметки");
            return;
        }
        notes.remove(index);
        view.showMessage("Заметка удалена");
        view.showNotes(notes);
    }
}

