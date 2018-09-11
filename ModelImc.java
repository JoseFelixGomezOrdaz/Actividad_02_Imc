package models;
import javax.swing.JOptionPane;

public class ModelImc {
    private int imc;
    private int peso;
    private double estatura;

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
        if (estatura>=0 && estatura <=3 ) {
        } 
        else {
            JOptionPane.showMessageDialog(null, "No se puede calcular su IMC");
        } 
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        if (peso>=10 && peso <=400 ) {
        } 
        else {
            JOptionPane.showMessageDialog(null, "No se puede calcular su IMC");
        } 
    }

  
    
    public int IMC(){
        
        this.imc=(int) (this.peso/(this.estatura*this.estatura));
        
        if(imc <= 16){
            JOptionPane.showMessageDialog(null,imc + "Delgadez severa");
            
        }else if(imc > 16.01 && imc<= 16.99){
            JOptionPane.showMessageDialog(null,imc + "Delgadez moderada");
        }else if(imc > 17.00 && imc<= 18.49){
            JOptionPane.showMessageDialog(null,imc + "Delgadez aceptable");
        }else if(imc > 18.50 && imc<= 24.99){
            JOptionPane.showMessageDialog(null,imc + "Peso normal");
        }else if(imc > 25.00 && imc <= 29.99){
            JOptionPane.showMessageDialog(null,imc + "Sobrepeso");
        }else if(imc > 30.00 && imc <= 34.99){
            JOptionPane.showMessageDialog(null,imc + "Obeso: Tipo1");
        }else if(imc > 35.00 && imc <= 39.99){
            JOptionPane.showMessageDialog(null,imc + "Obeso: Tipo2");
        }else{
            JOptionPane.showMessageDialog(null,imc + "Obeso: Tipo3");
        }
        return this.imc;
        
    }
     
}

