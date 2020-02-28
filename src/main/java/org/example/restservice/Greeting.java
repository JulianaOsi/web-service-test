package org.example.restservice;

public class Greeting {
    private final long id;
    private final String content;
    private final int[] arr = {5, 4, 1};

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int[] getArr() {return arr;}
}
