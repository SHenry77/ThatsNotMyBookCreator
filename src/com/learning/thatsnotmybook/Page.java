package com.learning.thatsnotmybook;


public class Page {

    public static String IT_IS_TOO = "It's %s is too %s.";
    public static String IT_IS_SO = "It's %s is so %s.";

    private String noun;
    private String adjective;
    private boolean finalPage;

    public Page(String noun, String adjective){
        this(noun, adjective, false);
    }

    public Page(String noun, String adjective, boolean finalPage){
        this.noun = noun;
        this.adjective = adjective;
        this.finalPage = finalPage;
    }

    public String getNoun(){
        return noun;
    }

    public String getAdjective(){
        return adjective;
    }

    public String getText(){
        return finalPage ? String.format(IT_IS_SO, noun, adjective): String.format(IT_IS_TOO, noun, adjective);
    }
}
