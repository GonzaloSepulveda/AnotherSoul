package Characters;
import FileManagement.writeJson;

import java.util.Random;

public class randomSetters {


    public static void main(String[] args) {
        String randomLegacyName = getRandomLegacyName();
        System.out.println("Random Legacy Name: " + randomLegacyName);
    }
    public static String getRandomLegacyName() {
        writeJson manageJ = new writeJson();
        String[] legacyNames = {
                "Blackthorn", "Ravenshaw", "Ironwood", "Silverhelm", "Stonegate",
                "Frostbane", "Dragonheart", "Stormrider", "Emberforge", "Wyrmwood",
                "Hawkthorne", "Shadowvale", "Thornfield", "Winterfell", "Starcrest",
                "Firestone", "Wolfhaven", "Ravenspire", "Oakenshield", "Stormwatch",
                "Emberfall", "Frostvale", "Ironcrest", "Thunderstone", "Swiftwind",
                "Blackwater", "Goldengrove", "Falconridge", "Moonshadow", "Ashenwood",
                "Stormkeep", "Sunfire", "Frostwind", "Silverwood", "Shadowmere",
                "Hawkwind", "Stormcloak", "Emberglade", "Ravensong", "Frosthammer",
                "Ironhand", "Blackthistle", "Stormblade", "Fireforge", "Winterthorn",
                "Nightshade", "Silverpeak", "Hawksworn", "Shadowdancer", "Stonevale",
                "Aetherblade", "Duskshroud", "Sablethorn", "Lunarshade", "Cinderheart",
                "Blazefall", "Starwhisper", "Gloomraven", "Frostbane", "Shadowdust",
                "Thunderstrike", "Ironheart", "Mistweaver", "Whitestar", "Ravencrest",
                "Silentstorm", "Stormweaver", "Emberwhisper", "Nightflame", "Wintermoon",
                "Sunshadow", "Swordbreaker", "Frostgale", "Shadowveil", "Stormblade",
                "Runeblade", "Silverthorn", "Swiftshadow", "Blizzardheart", "Moonfire",
                "Abyssalbane", "Dreadrider", "Whisperingwind", "Firesong", "Darkshard",
                "Moonshroud", "Stormraven", "Shadowfire", "Voidwalker", "Thornshadow",
                "Blazefrost", "Dragonshade", "Eclipsesong", "Dawnfire", "Frostthistle",
                "Starstrike", "Shadowflame", "Silverfrost", "Steelthorn", "Mysticblade"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(legacyNames.length);
        manageJ.writeStringToFile("legacy",legacyNames[randomIndex]);
        return legacyNames[randomIndex];
    }

    public static String getRandomMaleName() {
        writeJson manageJ = new writeJson();
        String[] MaleNames = {
                "Eldric", "Gareth", "Alden", "Cormac", "Einar",
                "Leofric", "Gideon", "Alistair", "Lysander", "Cedric",
                "Thaddeus", "Benedict", "Edmund", "Roderick", "Lucius",
                "Alaric", "Gawain", "Tobias", "Wulfric", "Darian",
                "Cyril", "Emeric", "Finnian", "Ulric", "Malcolm",
                "Caelum", "Faelan", "Bran", "Siegfried", "Lorcan",
                "Quentin", "Dorian", "Cassius", "Fergus", "Gareth",
                "Edric", "Aldric", "Lancelot", "Tristan", "Percival",
                "Gideon", "Gawain", "Thorne", "Elric", "Valerian",
                "Cedric", "Alden", "Balthazar", "Aurelius", "Gregor",
                "Oswald", "Isidore", "Gervaise", "Fulco", "Osric"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(MaleNames.length);
        manageJ.writeStringToFile("name",MaleNames[randomIndex]);
        return MaleNames[randomIndex];
    }
    public static String getRandomFemaleName() {
        writeJson manageJ = new writeJson();
        String[] FemaleNames = {
                "Isolde", "Elysande", "Aveline", "Rosamund", "Eowyn",
                "Guinevere", "Rowena", "Morgana", "Arianwen", "Elowen",
                "Genevieve", "Seraphina", "Brienne", "Melisande", "Ygraine",
                "Giselle", "Odette", "Isabeau", "Lorelei", "Thalassa",
                "Eleanor", "Faelan", "Linnea", "Rhiannon", "Sylvaine",
                "Aisling", "Fiona", "Ailith", "Amalthea", "Elara",
                "Ceridwen", "Gwendolyn", "Morwenna", "Isolfr", "Ondine",
                "Cassiopeia", "Eilis", "Finola", "Isolde", "Ondine",
                "Eiluned", "Olwen", "Rosalind", "Leontia", "Leocadia",
                "Althea", "Carys", "Eira", "Eluned", "Fenella",
                "Eilwen", "Gwenyth", "Isolde", "Lyonesse", "Meliora"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(FemaleNames.length);
        manageJ.writeStringToFile("name",FemaleNames[randomIndex]);
        return FemaleNames[randomIndex];
    }





    public static String getRandomJob() {
        String[] jobs = {
                "Blacksmith", "Brewer", "Carpenter",
                "Fletcher", "Tailor", "Alchemist", "Apothecary",
                "Scribe", "Minstrel", "Weaver","Mason",
                "Maiden of the night", "Jester"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(jobs.length);
        writeJson.writeStringToFile("job",jobs[randomIndex]);
        return jobs[randomIndex];
    }

}
