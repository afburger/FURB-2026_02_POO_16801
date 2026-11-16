package exemplos.unidade07.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploGui extends JFrame {

    private JLabel lbPrincipal = new JLabel("Teste");
    private JTextField tfNome = new JTextField();
    private JButton btSalvar = new JButton("Botão");
    private JLabel lbMensagem = new JLabel("...");
    private JButton btTeste = new JButton("Teste");

    public static void main(String[] args) {
        new ExemploGui();
    }

    public ExemploGui() {
        super();
        setLayout(new BorderLayout(10, 10));

        add(lbPrincipal, BorderLayout.WEST);
        add(tfNome, BorderLayout.CENTER);
        add(btSalvar, BorderLayout.EAST);
        add(btTeste, BorderLayout.SOUTH);
        //add(lbMensagem, BorderLayout.SOUTH);
        setSize(320, 240);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        btSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbMensagem.setText("Olá " + tfNome.getText() + "!");
            }
            
        });

        btTeste.addActionListener(x -> executarTeste());
    }
   
    private void executarTeste() {
        String msg = "Olá " + tfNome.getText() + "!";
        new JOptionPane().showMessageDialog(this, msg);
    }

}
