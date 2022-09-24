package APIs;

import LoggerMain.Llogger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.agify.io?name=michael"))
                .GET().build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response =  httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        //Logger.log("this is my test message" + response.body());
        Llogger.log("Please log this message from another project" + response.body());//added a jar file to use this logger




    }
}
