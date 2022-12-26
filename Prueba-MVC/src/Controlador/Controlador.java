
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.botonSumar.addActionListener(this);
        vista.botonRestar.addActionListener(this);
        vista.botonMult.addActionListener(this);
        vista.botonDividir.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Calculador");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==vista.botonSumar) {
            modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
            modelo.sumar();
            vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
        }
        
        if(e.getSource()== vista.botonRestar){
            modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
            modelo.restar();
            vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
        }
        
        if(e.getSource()==vista.botonMult){
            modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
            modelo.multiplicar();
            vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
        }
        
        if(e.getSource()==vista.botonDividir){
            modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));
            modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));
            modelo.dividir();
            vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
        }
    }
}
