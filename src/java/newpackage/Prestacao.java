/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author zanat
 */
public class Prestacao {
    private int numero;
    private double parcelaFixa;
    private double valorJuros;
    private double custoOperacao;
    private double valorTotalPrestacao;

    public Prestacao(int numero, double parcelaFixa, double valorJuros, double custoOperacao, double valorTotalPrestacao) {
        this.numero = numero;
        this.parcelaFixa = parcelaFixa;
        this.valorJuros = valorJuros;
        this.custoOperacao = custoOperacao;
        this.valorTotalPrestacao = valorTotalPrestacao;
    }

}
