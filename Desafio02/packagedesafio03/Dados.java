package packagedesafio03;

import java.time.LocalDateTime;


public class Dados {
    private LocalDateTime dataHora;
    private int idDepartamento;
    private String nomeDepartamento;
    private String qntFuncionarios;
    private double menorSalario;
    private double maiorSalario;
    private double mediaSalario;

    public Dados(LocalDateTime dataHora, int idDepartamento, String nomeDepartamento,
            String qntFuncionarios, double menorSalario, double maiorSalario,
            double mediaSalario) {
        this.dataHora = dataHora;
        this.idDepartamento = idDepartamento;
        this.nomeDepartamento = nomeDepartamento;
        this.qntFuncionarios = qntFuncionarios;
        this.menorSalario = menorSalario;
        this.maiorSalario = maiorSalario;
        this.mediaSalario = mediaSalario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public double getMaiorSalario() {
        return maiorSalario;
    }
    public double getMediaSalario() {
        return mediaSalario;
    }
    public double getMenorSalario() {
        return menorSalario;
    }
    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
    public String getQntFuncionarios() {
        return qntFuncionarios;
    }
}
