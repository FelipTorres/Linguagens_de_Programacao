package br.com.exemplojformattedtextfield;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class TestandoJFormattedTextField extends JFrame{
    public static void main(String[] args) {
        TestandoJFormattedTextField field = new TestandoJFormattedTextField();
        field.TestaJFormattedTextField();
    }

    private void TestaJFormattedTextField(){
        Container janela = getContentPane();
        setLayout(null);

        // rótulos de botão

        JLabel labelCEP = new JLabel("CEP:");
            labelCEP.setBounds(50,40,100,20);
        JLabel labeltel = new JLabel("telefone:");
            labeltel.setBounds(50,80,100,20);
        JLabel labelCpf = new JLabel("CPF:");
            labelCpf.setBounds(50,120,100,20);
        JLabel labelData = new JLabel("Data:");
        labelData.setBounds(50,160,100,20);

        // Máscaras

        MaskFormatter mascaraCep = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;

        try {
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##) # ####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraData = new MaskFormatter("##/##/####");

            mascaraCep.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCep.setPlaceholderCharacter('_');
            mascaraCep.setPlaceholderCharacter('_');
    
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: "+ excp.getMessage());
            System.exit(-1);
        }

        // Seta as máscaras nos objetos JFormattesTextField
        JFormattedTextField jFormattedTextCep = new JFormattedTextField(mascaraCep);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);

        jFormattedTextCep.setBounds(150,40,100,20);
        jFormattedTextTel.setBounds(150,80,100,20);
        jFormattedTextCpf.setBounds(150,120,100,20);
        jFormattedTextData.setBounds(150,160,100,20);

        // Adicona os rótulos e os campos de textos com máscara na tela 
        janela.add(labelData);
        janela.add(labelCpf);
        janela.add(labeltel);
        janela.add(labelCEP);
        janela.add(jFormattedTextCep);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextData);

        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
