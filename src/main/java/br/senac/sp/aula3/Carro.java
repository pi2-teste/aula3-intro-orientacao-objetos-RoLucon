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

    public Carro(String color) {
        cor = color;
    }
    
    public void descreve(){
        String aux = "";
        if(!fabricante.equals("")){
            aux += "Um " + fabricante;
        }
        if(!modelo.equals("")){
            aux += " " + modelo;
        }
        if(!cor.equals("")){
            aux += " de cor " + cor;
        }
        System.out.println(aux);
        
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
    
    private String formataTextoUpper(String txt){
        String aux = txt.substring(0,1).toUpperCase()+txt.substring(1);
    
    return aux;
    }
    
    private String formataTextoLower(String txt){
        String aux = txt.toLowerCase();
    
    return aux;
    }
}
