package com.Aditya.PBO.Pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField Txt_Nama;
    private JTextField Txt_NIM;
    private JComboBox CB_Prodi;
    private JRadioButton RB_Cowok;
    private JRadioButton RB_Cewek;
    private JTextArea Ta_Alamat;
    private JButton saveButton;
    private JButton clearButton;
    private JTextField Txt_Telp;
    private JPanel jpanel;
    private ButtonGroup JK;

    public Register(){
        super("Form Register");

       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setContentPane(jpanel);
       this.setSize(800, 600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Txt_Nama.setText("");
                Txt_NIM.setText("");
                Txt_Telp.setText("");
                Ta_Alamat.setText("");
                CB_Prodi.setSelectedIndex(0);
                JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String  s = Txt_Nama.getText();
                String  n = Txt_NIM.getText();
                String  t = Txt_Telp.getText();
                String  a = Ta_Alamat.getText();
                String  p = CB_Prodi.getSelectedItem().toString();
                String JK;

                if(RB_Cowok.isSelected()){
                    JK = "Cowok";
                }else if(RB_Cewek.isSelected()){
                    JK = "Cewek";
                }else {
                    JK = "Belum Dipilih";
                }

                if(s.isEmpty() ||   n.isEmpty() || t.isEmpty() || a.isEmpty() || p.isEmpty () || JK.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                }else{
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                }
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new Register();
        frame.setVisible(true);
    }
}
