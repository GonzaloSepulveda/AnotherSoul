package gameEvents;

import Characters.randomSetters;
import FileManagement.writeJson;

import java.util.Random;

public class beingBorn {
    public static void bornMessage(){
        writeJson manageJ = new writeJson();
        String[] socialClass = {"peasant","peasant","peasant","peasant","peasant",
                                "peasant","peasant","peasant","peasant","peasant",
                                "peasant","peasant","peasant","peasant","peasant",
                                "crafter","crafter","crafter","crafter","crafter",
                                "crafter","crafter","crafter","crafter","crafter",
                                "burgher","burgher","burgher","burgher","burgher",
                                            "noble","noble","noble","king","king"};

        determineGender();
        System.out.print("A " + socialClass[writeJson.checkJsonInt("character")] + " has been born");
        System.out.println(" under the banner of " + writeJson.checkJsonString("legacy") + "!" );
    }

    public static void determineGender(){
        Random random = new Random();
        int randomIndex = random.nextInt(2);
        if(randomIndex==0){
            writeJson.writeStringToFile("gender","male");
            randomSetters.getRandomMaleName();
        }
        if(randomIndex==1){
            writeJson.writeStringToFile("gender","female");
            randomSetters.getRandomFemaleName();
        }
    }
}
