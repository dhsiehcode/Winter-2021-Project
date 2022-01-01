import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Documented;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class DataQuery {

    public static void runQuery(){
        try {
            Document doc = Jsoup.connect("https://www.transfermarkt.us/norwich-city/spielplan/verein/1123").get();

            Elements divs = doc.select("div"); // get the divs

            ArrayList<Element> tableDivs = new ArrayList<>();

            for (Element e: divs){
                if (e.toString().contains("table-header")){
                    tableDivs.add(e);
                }
            }

            Element correctA = null;
            Element correctDiv = null;

            /*for (Element e:tableDivs){
                for (Element j:e.select("a")){
                    if (j.toString().contains("Premier League")){
                        correctA = j;
                        correctDiv = e;
                        break;
                    }
                }
            }*/

            for (Element e:tableDivs){
                if (e.toString().contains("responsive-table")){
                    correctDiv = e;
                }
            }

            Elements trs = correctDiv.select("tr");

            for (Element e:trs){
                System.out.println(e.toString());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
