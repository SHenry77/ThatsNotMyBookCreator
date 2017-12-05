package com.learning.thatsnotmybook;

public class Main {
    public static void main(String[] args){
        String[]nouns = new String[]{"cover", "page", "text", "story", "plot"};
        String[]adjectives = new String[]{"rough", "smooth", "short", "interesting", "predictable"};
        Page[] pages = new Page[5];
        for(int i=0; i<nouns.length; i++){
            boolean finalPage = i == nouns.length-1;
            pages[i] = new Page(nouns[i], adjectives[i], finalPage);
        }
        Book book = new Book("book", pages);
        Book book2 = new Book( "Book", nouns, adjectives);
        readBook(book);
        readBook(book2);
    }

    public static void readBook(Book book){
        System.out.println(book.getTitle());
        for(Page page: book.getPages()){
            System.out.println(page.getText());
        }
    }

}
