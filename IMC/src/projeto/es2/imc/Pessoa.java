package projeto.es2.imc;

public class Pessoa {

    private int peso;
    private double altura;
    private char[] sexo = new char[1];
        
    public Pessoa(int peso,double altura, char[] sexo) {
        this.altura = altura;
        this.peso = peso;
        this.sexo[0] = sexo[0];
    }

    public Pessoa() {
        this.altura = 0;
        this.peso = 0;
        this.sexo[0] ='a';
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo[0] = sexo;
    }

    
    public String Mensagem() {
        IMC imc = new IMC();
        return(imc.calculaImc(this.altura, this.peso, this.sexo));
        
    }

    
    

}
