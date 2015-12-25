package com.drillin.oindrildutta.funfacts;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class FactBook extends AsyncTask<Void, Void, String> {
    /*String[] factUrls = {
            "http://numbersapi.com/random/trivia",
            "http://numbersapi.com/random/math",
            "http://numbersapi.com/random/date",
            "http://numbersapi.com/random/year",
            "http://api.icndb.com/jokes/random",
            "http://astrocast.heroku.com/bites",
            "http://www.fayd.org/api/fact.xml",
            "http://www.sethcardoza.com/api/rest/tools/random_password_generator",
            "http://randomword.setgetgo.com/get.php",
            "http://itsthisforthat.com/api.php?text"};*/
    String[] facts = {
            "111 is the atomic number of the element roentgenium (Rg).",
            "67890 is the number of largest decimal places of π that have been recited from memory.",
            "396 is the displacement in cubic inches of early Chevrolet Big-Block engines.",
            "1000000000000 is the number of bacteria on the surface of the human body.",
            "182 is the carat of the Star of Bombay cabochon-cut star sapphire originating from Sri Lanka.",
            "5e+30 is the number of bacterial cells on Earth.",
            "155 is the number of episodes the TV series Sea Hunt ran in syndication from 1958 to 1961.",
            "3.4e+38 is the number of different possible keys in the AES 128-bit key space (symmetric cipher).",
            "142600 is tonnes of gold mined in the world by the end of 2000.",
            "140 is liters of water needed to produce 1 cup of coffee.",
            "I MADE A DECENT ANDROID APP!"};
    Random randgen = new Random();

    public String getFact() {
        //return doInBackground();
        return facts[randgen.nextInt(facts.length)];
    }

    public static void main(String[] args) {
        FactBook book = new FactBook();
        System.out.println(book.urlFact());
    }

    public String urlFact() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader((new URL("http://numbersapi.com/random/trivia")).openConnection().getInputStream()));
            ArrayList<String> inputLine = new ArrayList<>();
            String tempString;
            while ((tempString = in.readLine()) != null) {
                inputLine.add(tempString);
            }
            in.close();

            for (String s : inputLine) {
                System.out.println(s);
            }
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String oldGetFact() {
        String fact = "O.o";
        try {
            Document doc = Jsoup.connect("http://numbersapi.com/random/trivia").get();
            String title = doc.title();
            Log.d("factgetter", title);
            Elements text = doc.select("pre");
            fact = text.html();
            return fact;
        } catch (Exception e) {
            e.printStackTrace();
            return fact;
        }
    }

    @Override
    protected String doInBackground(Void... params) {
        /*String fact = "O.o";
        try {
            Document doc = Jsoup.connect("http://numbersapi.com/random/trivia").get();
            String title = doc.title();
            Log.d("factgetter", title);
            Elements text = doc.select("pre");
            fact = text.html();
            return fact;
        } catch (Exception e) {
            e.printStackTrace();
            return fact;
        }*/
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader((new URL("http://numbersapi.com/random/trivia")).openConnection().getInputStream()));
            ArrayList<String> inputLine = new ArrayList<>();
            String tempString;
            while ((tempString = in.readLine()) != null) {
                inputLine.add(tempString);
            }
            in.close();

            for (String s : inputLine) {
                System.out.println(s);
            }
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}