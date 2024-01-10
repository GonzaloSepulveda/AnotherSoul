package Functions;

import FileManagement.writeJson;

public class socialClass {
    public static void chooseCharacter() {
        writeJson manageJ = new writeJson();
        int characterSpawner = random.generateRandomNumber();
        manageJ.writeIntToFile("character",characterSpawner);
    }
}
