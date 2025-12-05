package Lab_6_1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class InputManager {

    private static InputManager instance;

    private InputManager() {}

    private Map<String, String> bindings = new HashMap<>();

    private String logFilePath = "src/Lab_6_1/input_log.txt";

    public static InputManager getInstance() {
        if (instance == null) {
            instance = new InputManager();
        }
        return instance;

    }

    public void registerKeyBinding(String action, String key) {
        bindings.put(action, key);
        log("Bind: action = " + action + ", key = " + key);
    }

    public String getKeyForAction(String action) {
        return bindings.get(action);
    }

    private void log(String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(logFilePath, true))) {
            out.println(LocalDateTime.now() + " - " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
