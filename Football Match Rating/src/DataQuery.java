import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class DataQuery {

    public static void runQuery(){
        try {
            System.out.println(getURLContent("https://www.transfermarkt.us/norwich-city/spielplan/verein/1123"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getURLContent(String inputURL) throws IOException {
        StringBuilder content = new StringBuilder();

        URL url = new URL(inputURL);

        /*URLConnection connection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            content.append(line + "\n");
        }
        bufferedReader.close();*/
        Scanner sc = new Scanner(url.openStream());
        while (sc.hasNext()){
            content.append(sc.next());
        }
        return content.toString();
    }
}
