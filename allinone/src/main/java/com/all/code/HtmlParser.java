package com.all.code;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HtmlParser {

    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/List_of_asanas")
                    .data("query", "Java")
                    .userAgent("Mozilla")
                    .cookie("auth", "token")
                    .timeout(10000)
                    .post();
            Elements content = doc.getElementsByClass("mw-redirect");
            for(Element element: content){
                String title = element.attr("title");
                System.out.println("\""+title+"\",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
