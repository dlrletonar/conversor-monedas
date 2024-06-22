import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultarTasaCambio consulta = new ConsultarTasaCambio();
        Menu menu = new Menu();
        TipoCambio moneda = null;
        int opcion = 0;
        Double monto = 0.0;

        while (opcion != 9) {
            menu.mostrarMenu();
            System.out.println("Ingrese la opción que desea:");
            try {
                opcion = Integer.parseInt(scan.nextLine());

                if (opcion >= 1 && opcion <= 8) {
                    System.out.println("Ingrese el monto a convertir:");
                    monto = Double.parseDouble(scan.nextLine());
                }

                switch (opcion) {
                    case 1 -> {
                        moneda = consulta.buscaMoneda("USD", "ARS", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " Dólar a Peso argentino");
                    }
                    case 2 -> {
                        moneda = consulta.buscaMoneda("ARS", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Peso argentino a Dólar");
                    }
                    case 3 -> {
                        moneda = consulta.buscaMoneda("USD", "BRL", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Dólar a Real brasileño");
                    }
                    case 4 -> {
                        moneda = consulta.buscaMoneda("BRL", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Real brasileño a Dólar");
                    }
                    case 5 -> {
                        moneda = consulta.buscaMoneda("USD", "COP", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Dólar a Peso colombiano");
                    }
                    case 6 -> {
                        moneda = consulta.buscaMoneda("COP", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Peso colombiano a Dólar");
                    }
                    case 7 -> {
                        moneda = consulta.buscaMoneda("USD", "PEN", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Dólar a Soles peruanos");
                    }
                    case 8 -> {
                        moneda = consulta.buscaMoneda("PEN", "USD", monto);
                        System.out.println("El monto es: " + moneda.conversion_result()+
                                " de Soles Peruano a Dólar");
                    }
                    case 9 -> System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                    default -> System.err.println("Ingrese un número válido...!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Ingrese un numero valido...!");
            }
        }
    }
}
