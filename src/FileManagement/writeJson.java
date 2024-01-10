package FileManagement;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class writeJson {
    private static final String FILE_PATH = "dataSave.json";

    public static void writeIntToFile(String key, int value) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
            JSONObject jsonObject = new JSONObject(content);
            jsonObject.put(key, value);
            Files.write(Paths.get(FILE_PATH), jsonObject.toString().getBytes(), StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeStringToFile(String key, String value) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
            JSONObject jsonObject = new JSONObject(content);
            jsonObject.put(key, value);
            Files.write(Paths.get(FILE_PATH), jsonObject.toString().getBytes(), StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int checkJsonInt(String key) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
            JSONObject jsonObject = new JSONObject(content);
            return jsonObject.getInt(key);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static String checkJsonString(String key) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
            JSONObject jsonObject = new JSONObject(content);
            return jsonObject.getString(key);
        } catch (Exception e) {
            e.printStackTrace();
            return "pepe";
        }
    }
}
