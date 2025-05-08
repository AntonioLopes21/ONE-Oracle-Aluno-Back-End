package ConsumoAPI.gravarDadosArquivo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Scanner;

//Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
//Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo,
// serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
//Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
// Utilize o método setPrettyPrinting para alcançar esse resultado.
//Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Veiculo,
// serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

//precisa de ajuste
public class ConversorArquivo {

    public static void main(String[] args) {
        String resposta = " ";
        Scanner scan = new Scanner(System.in);

        Gson gson =  new GsonBuilder().setFieldNamingPolicy
                (FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://foo.com/")).build();

        //HttpResponse<String> response = json
                //.send(request, HttpResponse.BodyHandlers.ofString());

        //json = response.body();

        //Titulo mazeRunner = gson.toJson(json, Titulo.class); //new Titulo("Maze Runner", "Em um mundo pós-apocalíptico, o jovem Thomas (Dylan O'Brien) é abandonado em uma comunidade isolada formada por garotos após toda sua memória ter sido apagada. Logo ele se vê preso em um labirinto, onde será preciso unir forças com outros jovens para que consiga escapar.", 2014);

        //FileWriter arquivo = new FileWriter("arquivo.txt");
       // arquivo.write();

    }
}

class Titulo {
    private String nome;
    private int anoLancamento;
    private String descricao;

    public Titulo(String nome, String descricao, int anoLancamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
