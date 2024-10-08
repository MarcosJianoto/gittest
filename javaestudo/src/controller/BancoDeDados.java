package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import model.Item;

public class BancoDeDados {

    private Item item;

    public BancoDeDados() {

    }

    public void cadastrar(Item item) {
        try {
            OutputStream os = new FileOutputStream("medicamentos.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String linha = item.getNome() + "," + item.getQuantidade() + ", " + item.getTipo();

            bw.write(linha);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();

            System.out.println("O medicamento " + item.getNome() + " Foi cadastrado com sucesso!");

        } catch (Exception e) {
            System.out.println("Não conseguiu cadastrar o medicamento!");
            System.out.println(e);
        }

    }

    public void editar(int codigo) {

    }

    public void pesquisar(int codigo) {

    }

    public void excluir(int codigo) {

    }

    public ArrayList<Item> ler() {
        try {
            InputStream is = new FileInputStream("medicamentos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            ArrayList<String> linhas = new ArrayList<>();

            while (linha != null) {
                System.out.println(linha);
                linhas.add(linha);
                linha = br.readLine();
            }

            System.out.println("O arquivo medicamentos.txt foi lido com sucesso");

            ArrayList<Item> itens = new ArrayList<>();
            Item item;
            String[] elementos = new String[3];

            for (int i = 0; i < linhas.size(); i++) {
                elementos = linhas.get(i).split(",");
                int quantidade = Integer.parseInt(elementos[1]);
                item = new Item(elementos[0], quantidade, elementos[2]);
                itens.add(item);
            }

            System.out.println("Linhas convertidas em objetos com sucesso!");

            return itens;

        } catch (Exception e) {
            System.out.println("Não conseguiu ler o arquivo");
            return null;
        }

    }

}
