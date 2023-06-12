package com.ulbra.qspa;

import javax.swing.JOptionPane;

/**
 *
 * @author André Oliveira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namePerson = getNamePerson();
        double imc = calcIMC(getSizePerson(), getLbPerson());

        JOptionPane.showMessageDialog(null, "Olá " + namePerson + " o resultado do seu IMC é: " + imc + " O resultado caracteriza: " + getMessage(imc));
    }

    public static String getNamePerson() {
        String retrieveNamePerson;
        do {
            retrieveNamePerson = JOptionPane.showInputDialog(null, "Informe seu nome: ");
        } while (retrieveNamePerson == null || retrieveNamePerson.isEmpty());
        return retrieveNamePerson;
    }

    public static double getLbPerson() {
        String value;
        do {
            value = JOptionPane.showInputDialog(null, "Informe seu peso: ");
        } while (value == null || value.isEmpty());
        return Double.parseDouble(value.replace(",", "."));
    }

    public static double getSizePerson() {
        String value;
        do {
            value = JOptionPane.showInputDialog(null, "Informe sua altura: ");
        } while (value == null || value.isEmpty());
        return Double.parseDouble(value.replace(",", "."));
    }

    public static double calcIMC(double size, double lb) {
        return Math.round(lb / (size * size));
    }

    public static String getMessage(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade grau 1";
        } else if (imc < 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}
