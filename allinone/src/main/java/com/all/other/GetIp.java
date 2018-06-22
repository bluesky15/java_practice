package com.all.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class GetIp {
    public static void main(String[] args)  {

        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = null;
            in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));
            String ip = in.readLine(); //you get the IP as a String
            System.out.println(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
