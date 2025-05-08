package br.com.alura.buscadorCep;

import br.com.alura.screenmatchs.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatchs.modelos.Titulo;
import br.com.alura.screenmatchs.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscadorCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String tituloCep = "";
        List <String> listaDeCeps = new ArrayList<>();


        Gson gson =  new GsonBuilder().setPrettyPrinting().create();


        try {




        while(!tituloCep.equalsIgnoreCase("sair")) {
            System.out.println("Digite um cep:");
            tituloCep = scan.nextLine();

            if(tituloCep.equalsIgnoreCase("sair")) {
                break;
            }

            if(tituloCep.length() != 8) {
                System.out.println("Formato de cep inválido! Digite o seu cep com 8 dígitos.");
            }
            //caminho da api
            String caminhoApi = "https://viacep.com.br/ws/"+ tituloCep +"/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(caminhoApi)) //caminho
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());




            String retornoJson = response.body();
            System.out.println(retornoJson);

            listaDeCeps.add(retornoJson);

            FileWriter retornoConvertidoEmArquivo = new FileWriter("Ceps pesquisados.json");
            retornoConvertidoEmArquivo.write(gson.toJson(listaDeCeps));

            retornoConvertidoEmArquivo.close();





        }
        } catch (IllegalArgumentException e) {
            System.out.println("URL inválida." + e.getMessage());
        }

        System.out.println("O programa finalizou corretamente.");

    }


}

