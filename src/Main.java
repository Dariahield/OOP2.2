public class Main {
    public static void main(String[] args) {

        GryffindorStudent harryPotter = new GryffindorStudent( "Harry Potter",
                80,
                60,
                100,
                90,
                100);
        GryffindorStudent hermioneJeanGranger = new GryffindorStudent( "Hermione Jean Granger",
                70,
                40,
                90,
                70,
                40);
        GryffindorStudent ronWeasley = new GryffindorStudent("Ron Weasley",
                50,
                50,
                85,
                80,
                85);


        SlytherinStudent  dracoLuciusMalfoy = new SlytherinStudent("Draco Lucius Malfoy",
                65,
                75,
                45,
                97,
                59,
                80,
                88);

        SlytherinStudent  grahamMontague = new SlytherinStudent("Graham Montague",
                74,
                86,
                77,
                92,
                75,
                90,
                100);
        SlytherinStudent  gregoryGoyle = new SlytherinStudent("Gregory Goyle",
                44,
                76,
                79,
                91,
                52,
                60,
                40);

        HufflepuffStudent zahariyaSmith = new HufflepuffStudent("Zahariya Smith",
                99,
                92,
                29,
                90,
                57);
        HufflepuffStudent cedricDiggory = new HufflepuffStudent("Cedric Diggory",
                44,
                60,
                77,
                90,
                57);
        HufflepuffStudent justinFinchFletchleyy = new HufflepuffStudent("Justin Finch-Fletchley",
                44,
                60,
                77,
                90,
                57);
        RavenclawStudent choChang = new RavenclawStudent("Cho Chang",
                44,
                60,
                77,
                90,
                57);
        RavenclawStudent padmaPatil = new RavenclawStudent("Padma Patil",
                44,
                60,
                77,
                90,
                57);
        RavenclawStudent marcusBelby = new RavenclawStudent("Marcus Belby",
                44,
                60,
                77,
                90,
                57);


        harryPotter.compare(ronWeasley);
        dracoLuciusMalfoy.compareStudents(ronWeasley);
    }
}