package com.company;

public class Credits {
    public static void main(String[] args) {
        String title = "Акулий Торнадо";
        int year = 2013;
        String director = "Энтони Ферранте";
        String role1 = "Джон";
        String actor1 = "Джонатан Ватсон";
        String role2 = "Джэк";
        String actor2 = "Джэкус Патрошитель";
        String role3 = "Роза";
        String actor3 = "Валерия";
        String role4 = "Бабулька";
        String actor4 = "Нина Ивановна";

        System.out.println(title + " (" + year + ")\n" +
                "Режиссёр" + "\t" + director + "\n" +
                role1 + "\t" + actor1 + "\t" + "\n" +
                role2 + "\t" + actor2 + "\t" + "\n" +
                role3 + "\t" + actor3 + "\t" + "\n" +
                role4 + "\t" + actor4);
    }
}
