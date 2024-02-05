package com.webscraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScrapper {


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
