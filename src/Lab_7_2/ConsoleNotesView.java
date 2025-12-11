package Lab_7_2;

import java.util.List;

public class ConsoleNotesView implements NotesView {

    @Override
    public void showNotes(List<NoteModel> notes) {
        System.out.println("=== Список заметок ===");
        if (notes.isEmpty()) {
            System.out.println("(пусто)");
        } else {
            for (int i = 0; i < notes.size(); i++) {
                System.out.println(i + ": " + notes.get(i));
            }
        }
        System.out.println();
    }

    @Override
    public void showMessage(String message) {
        System.out.println("[INFO] " + message);
    }
}

