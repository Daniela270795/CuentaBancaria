import javax.swing.*;

public class cuenta {

    private String numero;  //atributos son privados encapsulamiento
    private String tipo="";
    private double saldoActual=0;
    private double saldoMinimo=0;
    private double ValorInicial=0;

    //Creo constructor


    public cuenta(String numero, String tipo, double valorInicial) {
        this.numero = numero;

        //hago la validadcion ( anotherString: "ahorro") || tipo.equalsIgnoreCase(anotherString: "credito"))
        if(tipo.equalsIgnoreCase("ahorro") || tipo.equalsIgnoreCase("credito")) {
            this.tipo = tipo;
            this.saldoActual = valorInicial;
            this.saldoMinimo = valorInicial;
            ValorInicial = valorInicial*0.1; //el 10 %
        }}



    //genero geter y seter son los que nos permiten acceder a atributos de tipo privado
    //geter leee y muestra
    //seter escribir valores en ese atributo

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorInicial() {
        return ValorInicial;
    }

    public void setValorInicial(double valorInicial) {
        ValorInicial = valorInicial;
    }

    //creo el metodo consinar
    public void consignar(double monto){
       this.saldoActual+=monto; //+=acumula los valores

    }
    //creo metodo retirar
    public void retirar(double monto){
        if((this.saldoActual-monto)<this.saldoMinimo){
            System.out.println("Saldo insuficiente");
            System.out.println("El valor retirado es: "+(this.saldoActual-this.saldoMinimo));
            this.saldoActual=this.saldoMinimo;
        }
        else{
            System.out.println("El valor retirado es: "+monto);
            this.saldoActual-=monto; //disminuyo el valor del monto
        }
    }

    @Override
    public String toString() {
        return "cuenta{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldoActual=" + saldoActual +
                ", saldoMinimo=" + saldoMinimo +
                ", ValorInicial=" + ValorInicial +
                '}';
    }
}
