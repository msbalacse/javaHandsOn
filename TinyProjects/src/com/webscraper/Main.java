package com.webscraper;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        WebScrapper ws = new WebScrapper();

        List<String> links = ws.getAllLinks("https://itextpdf.com/");

        for (String link:
             links) {
            if(link.contains("https://")){
                System.out.println(link);
            }
        }

    }
}
