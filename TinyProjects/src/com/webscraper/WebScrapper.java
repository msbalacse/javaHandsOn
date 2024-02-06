package com.webscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScrapper {

    public List getAllParagraph(String url) throws IOException {
        List<String> paragraphs = new ArrayList<>();

        Document document = Jsoup.connect(url).get();

        Elements title = document.select("h1");
        Elements paragraph = document.select(".pw-post-body-paragraph");

        for (Element t:
             title) {
            paragraphs.add(t.text());
        }
        paragraphs.add("+++++++++++++++++++++++++++++++++++");
        for(Element p:paragraph){
            paragraphs.add(p.text());
        }
        return paragraphs;
    }

    public List getAllLinks(String url) throws IOException {

        List<String> links = new ArrayList<>();

        Document document = Jsoup.connect(url).get();

        Elements link = document.select("a");

        for (Element l:link) {
            String href = l.attr("href");
            links.add(href);
        }

        return links;
    }
}
