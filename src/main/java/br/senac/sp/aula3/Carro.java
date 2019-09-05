/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    private static String fabricante;
    private String[] rodas;
    private String cor;
    private String modelo;
    private int velocidade;
    private int gasolina = 20;
    private int max_gasolina = 40;

    public Carro() {
    }
    
    public String descreve(){
        boolean flag = false; 
        String aux = "Um";
        if(fabricante != null){
            aux += fabricante;
            flag = true;
        }
        if(modelo!= null){
            aux += " " + modelo;
            flag = true;
        }
        if(cor != null){
            aux += " na cor " + cor;
        }
        if(flag){
            return  aux;
        }else{
            return "Um carro";
        }
    }
    
    public void abastece(int value){
        gasolina += value;
        if(gasolina > max_gasolina){
            gasolina = max_gasolina;
        }
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = formataTextoUpper(fabricante);
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = formataTextoLower(cor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = formataTextoUpper(modelo);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
     public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    
    private String formataTextoUpper(String txt){
        String aux = txt.substring(0,1).toUpperCase()+txt.substring(1);
    
    return aux;
    }
    
    private String formataTextoLower(String txt){
        String aux = txt.toLowerCase();
    
    return aux;
    }

    public int getMax_gasolina() {
        return max_gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {
        this.max_gasolina = max_gasolina;
    }
}
