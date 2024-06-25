package Converter;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ApiConverter {
    private String base_code;
    private String target_code;
    private String conversion_rate;
    private double amount;
    private String apiKey = "24739d7f69dd7f4faf7c668f";
    List<Converter> converterList = new ArrayList<>();

    public ApiConverter(Converter converter){
        this.base_code = converter.getBase_code();
        this.target_code = converter.getTarget_code();
        this.amount = converter.getValue();
    }

    public String callApi() throws RuntimeException {
        this.apiKey = apiKey;
        String uriConsult = this.apiKey + "/pair/" + this.base_code + "/" + this.target_code + "/" + this.amount;

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + uriConsult);


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new Gson();
            Converter converter = gson.fromJson(json, Converter.class);
            converterList.add(converter);
            return converter.toString();

        } catch (Exception e) {
            throw new RuntimeException("Error!!");
            //return "Error" + e.getMessage();
        }

    }

    public List<Converter> getConverterList(){
        return converterList;
    }
}
