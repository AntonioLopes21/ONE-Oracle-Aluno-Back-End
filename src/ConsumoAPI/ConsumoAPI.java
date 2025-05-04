package ConsumoAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumoAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String tituloFilme;

        System.out.println("Digite o título do filme que deseja buscar: ex (nome+sobrenome) sem espaços");
        tituloFilme = scan.nextLine();

        var endereco = "http://www.omdbapi.com/?t="+ tituloFilme +"&apikey=1f4e86ab";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco)) //caminho dinâmico
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }


}

