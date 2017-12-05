package com.learning.thatsnotmybook;

public class Main {
    public static void main(String[] args){
        String[]nouns = new String[]{"cover", "page", "text", "story", "plot"};
        String[]adjectives = new String[]{"rough", "smooth", "short", "interesting", "predictable"};

        Book book2 = new Book( "book", nouns, adjectives);
        readBook(book2);
        book2.getPageText(2);
    }

    private static void readBook(Book book){
        System.out.println(book.getTitle());
        System.out.println(book.getText());
    }

}
