public class Main {
    public static void main(String[] args) {
        //instanciar la clase
        cuenta miCuenta = new cuenta("123456", "credito", 150000);
        System.out.println("saldo minimo: " + miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("saldo actual " + miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("saldo actual " + miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        miCuenta.setNumero("987654");
        System.out.println(miCuenta.toString());
        System.out.println("-----------------------------------------------------------");

        cuenta pedro = new cuenta("585858", "prestamo", 5000);
        System.out.println(pedro.toString());

    }

}
