package trabalho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    public List<Aluno> listaAlunos;
    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaAlunos = new ArrayList<>();
    }

    public void gravarArquivo(Aluno p) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);
            // Formato: Código,Descrição,PreçoCusto,PreçoVenda,Estoque
            escritor.write(p.getNome() + "," + 
                           p.getDataNasc() + "," + 
                           p.getSexo() + ","+ 
                           p.getMatricula());
            escritor.newLine();
            escritor.close();
            arqw.close();

            System.out.println("Aluno salvo no arquivo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> lerArquivo() {
        System.out.println("Alunos lidos do arquivo:");
        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                String nome = campos[0];
                String dataNasc = campos[1];
                String sexo = campos[2];
                String matricula = campos[3];
               

                Aluno aluno = new Aluno(nome, dataNasc, sexo, matricula);
                listaAlunos.add(aluno);
            }
            leitor.close();
            arqr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }

}
