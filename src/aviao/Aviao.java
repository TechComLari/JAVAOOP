package aviao;

public class Aviao {
    private String cor;
    private int passageiros;
    private int assentos;
    private String companhia;
    private boolean saidaEmergencia;

    public Aviao(String cor, int passageiros, int assentos, String companhia, boolean saidaEmergencia) {
        this.cor = cor;
        this.passageiros = passageiros;
        this.assentos = assentos;
        this.companhia = companhia;
        this.saidaEmergencia = saidaEmergencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public boolean isSaidaEmergencia() {
        return saidaEmergencia;
    }

    public void setSaidaEmergencia(boolean saidaEmergencia) {
        this.saidaEmergencia = saidaEmergencia;
    }

    public boolean capacidade(){
        if (this.getPassageiros() > this.getAssentos()){
            System.out.println("Não há mais assentos disponiveis :(");
            return false;
        }

        if (this.getPassageiros() == this.getAssentos()){
            System.out.println("Sucesso! Esse foi o último assento disponivel :)");
            return false;
        }

        if (this.getPassageiros() < this.getAssentos()){
            System.out.println("Assento adquirido comsucesso! :)");
            return false;
        }
        return true;
    }

}

