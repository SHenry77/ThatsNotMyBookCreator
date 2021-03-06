package com.learning.thatsnotmybook;

public class Book {

    private static String IT_IS_TOO = "It's %s is too %s.";
    private static String IT_IS_SO = "It's %s is so %s.";
    private static String THATS_NOT_MY = "That's not my ";
    private static String THATS_MY = "That's my ";
    private String titularNoun;

    private String[] nouns;
    private String[] adjectives;

    Book(String titularNoun, String[] nouns, String[] adjectives){
        validate(titularNoun, nouns, adjectives);
        this.titularNoun = titularNoun;
        this.nouns = nouns;
        this.adjectives = adjectives;
    }

    public String getTitularNoun() {
        return titularNoun;
    }

    String getTitle(){
        return THATS_NOT_MY + titularNoun;
    }

    public String[] getNouns(){
        return nouns;
    }

    public String[] getAdjectives(){
        return adjectives;
    }

    String getText(){
        StringBuilder builder = new StringBuilder();
        for(int page=0; page< nouns.length; page++){
            builder.append(getPageText(page));
        }
        return builder.toString();
    }

    String getPageText(int pageNum){
        boolean finalPage = pageNum == nouns.length-1;
        StringBuilder builder = new StringBuilder();
        if(finalPage){
            builder.append(THATS_MY );
            builder.append(titularNoun);
            builder.append(". ");
            builder.append(String.format(IT_IS_SO, nouns[pageNum], adjectives[pageNum]));
        } else {
            builder.append(getTitle());
            builder.append(". ");
            builder.append(String.format(IT_IS_TOO, nouns[pageNum], adjectives[pageNum]));
            builder.append(" ");
        }
        return builder.toString();
    }

    private void validate(String titularNoun, String[] nouns, String[] adjectives){
        if( titularNoun == null){
            throw new NullPointerException("titularNoun must not be null");
        }
        if( nouns == null ){
            throw new NullPointerException("nouns must not be null");
        } else {
            for(String noun: nouns){
                if(noun == null){
                    throw new IllegalArgumentException("nouns must not contain nulls");
                }
            }
        }
        if( adjectives == null ){
            throw new NullPointerException("adjectives must not be null");
        } else {
            for(String adj: adjectives){
                if(adj == null){
                    throw new IllegalArgumentException("adjectives must not contain nulls");
                }
            }
        }

        if( nouns.length != adjectives.length){
            throw new IllegalArgumentException("nouns and adjectives must be the same length");
        }
    }

}
