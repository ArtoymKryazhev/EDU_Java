package Lab_7_2;

public class MainMVP {
    public static void main(String[] args) {
        NotesView view = new ConsoleNotesView();
        NotesPresenter presenter = new NotesPresenter(view);

        presenter.createNote("Покупки", "Купить молоко и хлеб");
        presenter.createNote("Учёба", "Подготовиться к лабораторной по ООП");
        presenter.editNote(1, "Учёба", "Выучить MVC, MVP, MVVM");
        presenter.deleteNote(0);
    }
}
