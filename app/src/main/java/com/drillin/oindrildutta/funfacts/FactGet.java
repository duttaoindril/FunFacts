package com.drillin.oindrildutta.funfacts;

import android.util.Log;
import android.widget.Toast;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Random;

public class FactGet {
    public static final String TAG = FactGet.class.getSimpleName();
    private Random randgen = new Random();
    private String[] urls = {
            "http://numbersapi.com/random/trivia",
            "http://numbersapi.com/random/math",
            "http://numbersapi.com/random/date",
            "http://numbersapi.com/random/year",
            "http://api.icndb.com/jokes/random",
            "http://astrocast.heroku.com/bites",
            "http://www.fayd.org/api/fact.xml",
            "http://www.sethcardoza.com/api/rest/tools/random_password_generator",
            "http://randomword.setgetgo.com/get.php",
            "http://itsthisforthat.com/api.php?text"};
    /*
    public String getFact() {
        int pick = randgen.nextInt(4);//urls.length);
        OkHttpClient weatherClient = new OkHttpClient();
        Request request = new Request.Builder().url(urls[pick]).build();
        Call call = weatherClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.v(TAG, "YOUR INTERNET SUCKS");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                try {
                    //Response response = call.execute();
                    if(response.isSuccessful())
                        Log.v(TAG, response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.e(TAG, "FAILED to get weather: ", e);
                }
            }
        });
        if(pick < 5) {
            String fact = "O.o";
            try {
                Document doc = Jsoup.parse(html);
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
    }
    */
}
