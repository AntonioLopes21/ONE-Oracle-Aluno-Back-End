package ConsumoAPI.gravarDadosArquivo;

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

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String tituloFilme = "";
        List <Titulo> titulos = new ArrayList<>();
        Gson gson =  new GsonBuilder().setFieldNamingPolicy
                (FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while(!tituloFilme.equalsIgnoreCase("sair")) {


            System.out.println("Digite o título do filme que deseja buscar: ex (nome+sobrenome) sem espaços");
            tituloFilme = scan.nextLine();

            if(tituloFilme.equalsIgnoreCase("sair")) {
                break;
            }

            var endereco = "http://www.omdbapi.com/?t="+ tituloFilme.replace(" " , "+") +"&apikey=1f4e86ab";

            try {


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


                //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);


                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                //data transfer object
                System.out.println("Titulo já convertido:" + meuTitulo);

//                //escrevendo arquivo
                FileWriter escrita = new FileWriter("Filmes.json");
                escrita.write(gson.toJson(titulos));
//                escrita.write(meuTitulo.toString());
                escrita.close();

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Erro de formatação do número:\n " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao pesquisar URI com espaços. Verifique o formato de endereço na qual você precisa pesquisar. (nome+sobrenome)\n " + e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        System.out.println("O programa finalizou corretamente.");

    }


}

