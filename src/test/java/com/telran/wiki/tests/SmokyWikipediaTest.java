package com.telran.wiki.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Objects;

public class SmokyWikipediaTest extends TestBase {

    @Test
    public void addArticleAndRemoveTest() throws InterruptedException {
        System.out.println("app launch");

        app.getArticle().search();
        app.getArticle().addToFavorites();
        app.getArticle().createReadingList();
        app.getArticle().goToFavorites();
        Thread.sleep(5000);
        app.getArticle().swipeToTheLeft(By.id("org.wikipedia:id/page_list_item_container"));

    }
}