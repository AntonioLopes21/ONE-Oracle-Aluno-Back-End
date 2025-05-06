package ConsumoAPI;

import br.com.alura.screenmatchs.modelos.Titulo;
import br.com.alura.screenmatchs.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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


        //Gson dependência importada na project structure
        //sistema de gerenciamento de pacotes
        //maven, gradle
        String json = response.body();

        Gson gson =  new GsonBuilder().setFieldNamingPolicy
                (FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        //data transfer object
        Titulo meuTitulo = new Titulo(meuTituloOmdb);

        System.out.println("Titulo já convertido:" + meuTitulo);
    }


}

