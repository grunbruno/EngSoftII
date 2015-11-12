/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.es2.imc;

/**
 *
 * @author DANIEL
 */
public class IMC {

    private double calcImc;

    public IMC() {
        calcImc = 0;
    }

    public String calculaImc(double a, int p, char[] se) {
        String msg = "";
        String s = new String(se);
        s= s.toUpperCase();
        
        if ((p <= 0) || (a < 0.60) || (a > 2.40) || (s.equals(""))) {
            msg = "Valores Inválidos - Confira os Valores digitados";
            return msg;
        }
        double c = p / (a * a);
        
        //IMC MASCULINO ABAIXO DE 17.9
        if((c < 17.9) &&(s.equals("M")))
            return msg="Valor incorreto para o sexo Masculino";
        
        //IMC FEMININO ABAIXO DE  15
        if((c < 15) && (s.equals("F")))
            return msg="Valor incorreto para o sexo Feminino";
        
        //IMC Baixo
        if ((c >= 17.9) && (c < 19) && (s.equals("M"))) {
            return msg = "Você está abaixo do peso recomendado.";
        }

        if ((c >= 15) && (c < 18) && (s.equals("F"))) {
            return msg = "Você está abaixo do peso recomendado.";
        }

        //IMC Ideal
        if ((c >= 19) && (c < 25) && (s.equals("M"))) {
            return msg = "Você está muito bem! Continue assim!";
        }

        if ((c >= 18) && (c <= 24.4) && (s.equals("F"))) {
            return msg = "Você está muito bem! Continue assim!";
        }
        
        //IMC Moderado
        if ((c >= 25) && (c <= 27.7) && (s.equals("M"))) {
            return msg = "Você está acima do peso recomendado. Cuidado!";
        }
        
        if ((c >= 24.5) && (c <= 27.2) && (s.equals("F"))) {
            return msg = "Você está acima do peso recomendado. Cuidado!";
        }
        
        // IMC Elevado
        if ((c >=27.8) && (s.equals("M"))) {
            return msg = "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
        }
        
        if ((c >= 27.3) && (s.equals("F"))) {
            return msg = "Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!";
        }
        
        
        return "Erro";
    }

}
