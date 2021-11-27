package com.telran.wiki.tests;

import org.testng.annotations.Test;

import java.util.Objects;

public class SmokyWikipediaTest extends TestBase {

    @Test
    public void addArticleAndRemoveTest() {
        System.out.println("app launch");

        app.getArticle().search();
//        app.getArticle().addToFavorites();
//        app.getArticle().createReadingList();
//        app.getArticle().close();
//        app.getArticle().goToFavorites();
//        app.getArticle().removeFromFavorites();
    }
}