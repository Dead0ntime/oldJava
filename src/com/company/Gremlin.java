package com.company;

public class Gremlin {
    public int guid;
    public String creator = "Крис Коламбус";
    int maximumAge = 240;
    static int gremlinCount = 0;
    public Gremlin replicate (String creator) {
        Gremlin noob = new Gremlin();
        Gremlin.gremlinCount++;
        noob.creator = "Стивен Спилберг";
        return noob;
    }
}
