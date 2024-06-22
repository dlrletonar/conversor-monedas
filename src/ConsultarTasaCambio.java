import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarTasaCambio {
    String apiKey = "4d45acbd654b94c4d8063701";
    String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public TipoCambio buscaMoneda(String baseCode,
                                  String targetCode,
                                  double monto){
        URI direccion = URI.create(baseUrl+apiKey+"/pair/" +
                baseCode + "/" + targetCode + "/" + monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200){
                return new Gson().fromJson(response.body(), TipoCambio.class);
            }else {
                throw new RuntimeException("Error en la respuesta: " + response.statusCode());
            }

        }catch (Exception e){
            throw new RuntimeException("No encontré ese tipo de Moneda. " + e.getMessage(), e);
        }
    }
}
