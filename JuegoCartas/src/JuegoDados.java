
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
 
 
public class JuegoDados extends JFrame implements ActionListener
{
    public JTextArea txtJugador01 = new JTextArea(20,22);
    public JTextArea txtJugador02 = new JTextArea(20,22);
    public JComboBox cbxModoJuego = new JComboBox();
    public JButton btnJugar = new JButton("JUGAR"); 
    public JLabel lblJugador01 = new JLabel("          JUGADOR 01");
    public JLabel lblJugador02 = new JLabel("          JUGADOR 02");
    public JScrollPane spnJugador01 = new JScrollPane(txtJugador01);
    public JScrollPane spnJugador02 = new JScrollPane(txtJugador02);
    public int NumPartida = 0;
 
    public JuegoDados()
    {
        super("JUEGO DE DADOS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setResizable(false);
         
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.CENTER,50,20);
        this.setLayout(DISTRIBUIDOR);
         
        this.btnJugar.addActionListener(this);
         
        this.txtJugador01.setEditable(false);
        this.txtJugador02.setEditable(false);
         
        this.cbxModoJuego.addItem("JUGADOR VS JUGADOR");
        this.cbxModoJuego.addItem("JUGADOR VS MAQUINA");
        this.txtJugador01.setSize(100,200);
        this.add(this.lblJugador01);
        this.add(this.lblJugador02);
        this.add(this.spnJugador01);
        this.add(this.spnJugador02);
        this.add(this.cbxModoJuego);
        this.add(this.btnJugar);        
    }
 
    @Override
    public void actionPerformed(ActionEvent AE) 
    {       
        int Resultado01,Resultado02;
         
        this.NumPartida++;
        if(this.cbxModoJuego.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this,"TURNO DE JUGADOR 01");
            Resultado01 = TirarDadoJugador(1,"JUGADOR 01");
             
            JOptionPane.showMessageDialog(this,"TURNO DE JUGADOR 02");
            Resultado02 = TirarDadoJugador(2,"JUGADOR 02");    
             
            if(Resultado01 > Resultado02)
            {
                JOptionPane.showMessageDialog(this,"GANO EL JUGADOR 01\n\n TOTAL = " + Resultado01);
            }
            else if(Resultado01 < Resultado02)
            {
                JOptionPane.showMessageDialog(this,"GANO EL JUGADOR 02\n\n TOTAL = " + Resultado02);
            }
            else if(Resultado01 == Resultado02)
            {
                JOptionPane.showMessageDialog(this,"EMPATES..¡¡¡\n\n TOTAL = " + Resultado01);
            }           
        }
        else
        {
            JOptionPane.showMessageDialog(this,"TURNO DE JUGADOR 01");
            Resultado01 = TirarDadoJugador(1,"JUGADOR 01");
             
            Resultado02 = TirarDadoJugador(3,"MAQUINA");    
             
            if(Resultado01 > Resultado02)
            {
                JOptionPane.showMessageDialog(this,"GANO EL JUGADOR 01\n\n TOTAL = " + Resultado01);
            }
            else if(Resultado01 < Resultado02)
            {
                JOptionPane.showMessageDialog(this,"GANO LA MAQUINA\n\n TOTAL = " + Resultado02);
            }
            else if(Resultado01 == Resultado02)
            {
                JOptionPane.showMessageDialog(this,"EMPATES..¡¡¡\n\n TOTAL = " + Resultado01);
            }              
        }
    }
     
    //--Jugador01 = 1, Jugador02 = 2, Maquina = 3
    public int TirarDadoJugador(int Jugador,String NomJugador)
    {
        int Dado01,Dado02,SumaDados;        
         
        Dado01 = GenerarAleatorioDado();
        Dado02 = GenerarAleatorioDado();
        SumaDados = Dado01 + Dado02;
             
        JOptionPane.showMessageDialog(this,"RESULTADO DE TIRAR DADOS PARA " + NomJugador
                                         + "\n\nDADO 01 : " + Dado01 + "\nDADO 02 : " + Dado02
                                         + "\n\n TOTAL SUMAN " + SumaDados);
         
        switch(Jugador)
        {
            case 1: this.txtJugador01.setText(this.txtJugador01.getText() + "\nJUEGO "
                                            + this.NumPartida + ": TOTAL " + SumaDados
                                            + " DADO 01: " + Dado01 + " DADO 02: " + Dado02);break;
                 
            case 2: this.txtJugador02.setText(this.txtJugador02.getText() + "\nJUEGO "
                                            + this.NumPartida + ": TOTAL " + SumaDados
                                            + " DADO 01: " + Dado01 + " DADO 02: " + Dado02);break;
                 
            case 3: this.txtJugador02.setText(this.txtJugador02.getText() + "\nJUEGO " + "\nJUEGO "
                                            + this.NumPartida + ": TOTAL " + SumaDados
                                            + " DADO 01: " + Dado01 + " DADO 02: " + Dado02);break;    
        }
         
        return SumaDados;
    }
    public int GenerarAleatorioDado()
    {
        Random Aleatorio = new Random();
        int Dado;
         
        Dado = Aleatorio.nextInt(6)+1;
         
        return Dado;
    }
     
    public static void main(String[] ARGUMENTOS)
    {
        JuegoDados Dados = new JuegoDados();
        Dados.setVisible(true);
    }
}