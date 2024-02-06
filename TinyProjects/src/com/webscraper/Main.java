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

        System.out.println("--------------------------------------------------------------------------------");

        List<String> paragraph = ws.getAllParagraph("https://medium.com/@julienetienne/stop-using-localstorage-64a6d6805da8");

        for (String para:
             paragraph) {
            System.out.print(" =>  ");
            System.out.println(para);
        }

    }
}
