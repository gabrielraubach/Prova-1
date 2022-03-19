package br.ulbra.classe;

public class Producao {

    private String Peca;
    private int Segundo;
    private int Segundos;
    private int Minuto;
    private int Hora;
    
    public Producao()
    {
        this.Peca = "Teclado";
        this.Segundos = 100;
    
    }

    public String getPeca() {
        return Peca;
    }

    public void setPeca(String Peca) {
        this.Peca = Peca;
    }

    public int getSegundo() {
        return Segundo;
    }

    public void setSegundo(int Segundo) {
        this.Segundo = Segundo;
        
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setSegundos(int Segundos) {
        if(Segundos > 0)
        {
            this.Segundos = Segundos;
        }
        else 
        {
            this.Segundos = 100;
        }
   
    }

    public int getMinuto() {
        return Minuto;
    }

    public void setMinuto(int Minuto) {
        this.Minuto = Minuto;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }
    
    public void calcularHMS()
    {
        
        this.Segundo = Segundos;
        this.Minuto = Segundos / 60;
        this.Hora = Segundos / 3600;
        
        while (Minuto >= 60)
        {
            Minuto = 60;
        }
        while (Segundo >= 60)
        {
            Segundo = 60; 
        }
        
    }

    @Override
    public String toString() 
    {
        return  " A peça " + this.getPeca() + ", que levou um total de " + this.getSegundos()+ " segundos, " + 
                this.getHora() + ":" +this.getMinuto() + ":" + this.getSegundo() + " para ficar pronta!";}
    
}
