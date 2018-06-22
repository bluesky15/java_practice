package com.all.okhttp.demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkhttpDemo {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        OkhttpDemo example = new OkhttpDemo();
        //String response = example.run("https://raw.github.com/square/okhttp/master/README.md");
        String response = example.run("http://localhost:3000/");
        System.out.println(response);
    }
}