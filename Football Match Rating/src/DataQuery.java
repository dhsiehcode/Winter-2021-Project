import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Documented;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class DataQuery {

    public static void runQuery(){
        try {
            Document doc = (Document) Jsoup.connect("https://www.transfermarkt.us/norwich-city/spielplan/verein/1123").get();

            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
