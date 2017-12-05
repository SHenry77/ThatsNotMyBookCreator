package com.learning.thatsnotmybook;

public class Book {

    protected static String THATS_NOT_MY = "That's not my ";
    private String titlularNoun;
    private Page[] pages;

    public Book(String titlularNoun, Page[] pages){
        this.titlularNoun = titlularNoun;
        this.pages = pages;
    }

    public Book(String titlularNoun, String[] nouns, String[] adjectives){
        this.titlularNoun = titlularNoun;
        pages = new Page[nouns.length];
        for(int i=0; i<nouns.length; i++){
            pages[i]= new Page(nouns[i], adjectives[i], i == nouns.length-1);
        }
    }

    public String getTitlularNoun() {
        return titlularNoun;
    }

    public String getTitle(){
        return THATS_NOT_MY + titlularNoun;
    }

    public Page[] getPages(){
        return pages;
    }

}
