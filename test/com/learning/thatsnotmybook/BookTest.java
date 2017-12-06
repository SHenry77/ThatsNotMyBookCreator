package com.learning.thatsnotmybook;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private static String TITLE = "book";
    private static String[]NOUNS = new String[]{"cover", "page", "text", "story", "plot"};
    private static String[]ADJECTIVES = new String[]{"rough", "smooth", "short", "interesting", "predictable"};

    @Test
    public void TestBookCreatedWithValidArgs(){
        Book book = new Book( TITLE, NOUNS, ADJECTIVES);
        assertEquals(TITLE, book.getTitularNoun());
        assertEquals(ADJECTIVES, book.getAdjectives());
        assertEquals(NOUNS, book.getNouns());
    }

    @Test
    public void TestExceptionThrownForEmptyNounArray(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("nouns must not contain nulls");
        new Book(TITLE, new String[1], ADJECTIVES);
    }

    @Test
    public void TestExceptionThrownForEmptyAdjectiveArray(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("adjectives must not contain nulls");
        new Book(TITLE, NOUNS, new String[2]);
    }

    @Test
    public void TestExceptionThrownForNullTitle(){
        exception.expect(NullPointerException.class);
        exception.expectMessage("titularNoun must not be null");
        new Book(null, NOUNS, ADJECTIVES);
    }

    @Test
    public void TestExceptionThrownForNullNouns(){
        exception.expect(NullPointerException.class);
        exception.expectMessage("nouns must not be null");
        new Book(TITLE, null, ADJECTIVES);
    }

    @Test
    public void TestExceptionThrownForNullAdjectives(){
        exception.expect(NullPointerException.class);
        exception.expectMessage("adjectives must not be null");
        new Book(TITLE, NOUNS, null);
    }

    @Test
    public void TestExceptionThrownForNonMatchedLengthArrays(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("nouns and adjectives must be the same length");
        new Book(TITLE, NOUNS, new String[]{"flowery", "broken"});
    }
    //public void TestTitleCorrect(){}
    //public void TestTextCorrect(){}
}
