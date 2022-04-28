package packagedesafio03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Desafio03 {

    public static void main(String[] args) {
        String caminhoArquivoDepartamento, caminhoArquivoFuncionarios;

        try {
            caminhoArquivoDepartamento = "C:\\Users\\henri\\OneDrive\\Documentos\\Java\\Desafio02\\src\\ArquivoDepartamento.txt";
            caminhoArquivoFuncionarios = "C:\\Users\\henri\\OneDrive\\Documentos\\Java\\Desafio02\\src\\ArquivoFuncionarios.txt";

            List<String> listPalavrasDep = new ArrayList<>();

            FileReader arqDep = new FileReader(caminhoArquivoDepartamento);
            BufferedReader lerArqDep = new BufferedReader(arqDep);

            String linhaDep = lerArqDep.readLine();

            while (linhaDep != null) {
                String[] palavrasDaLinha = linhaDep.split(";");

                for (String palavra : palavrasDaLinha) {
                    if (palavra.trim().length() > 1 && !"".equals(palavra.trim())) {
                        listPalavrasDep.add(palavra);
                    }
                    
                }

                linhaDep = lerArqDep.readLine(); // lê da segunda até a última linhaDep
            }

            arqDep.close();

            List<String> listPalavrasFunc = new ArrayList<>();

            FileReader arqFunc = new FileReader(caminhoArquivoFuncionarios);
            BufferedReader lerArqFunc = new BufferedReader(arqFunc);

            String linhaFunc = lerArqFunc.readLine();

            while (linhaFunc != null) {
                String[] palavrasDaLinha = linhaFunc.split(";");

                for (String palavra : palavrasDaLinha) {
                    if (palavra.trim().length() > 1 && !"".equals(palavra.trim())) {
                        listPalavrasFunc.add(palavra);
                    }

                }

                linhaFunc = lerArqFunc.readLine(); // lê da segunda até a última linhaFunc
            }

            arqFunc.close();

            System.out.printf("");
            System.out.printf(listPalavrasFunc.toString());

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }
}
