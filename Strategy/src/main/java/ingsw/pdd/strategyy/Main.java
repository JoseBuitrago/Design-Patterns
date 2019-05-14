package ingsw.pdd.strategyy;

import java.util.Scanner;
import ingsw.pdd.strategy.impl.AuthenticationProvider;
import ingsw.pdd.strategy.impl.Principal;
import ingsw.pdd.strategy.impl.providers.OnMemoryAuthenticationProvider;
import ingsw.pdd.strategy.impl.providers.SQLAuthenticationProvider;
import ingsw.pdd.strategy.impl.providers.XMLAuthenticationProvider;

public class Main {
	
	private static Scanner in = new Scanner(System.in);
    private static AuthenticationProvider authProvider = new AuthenticationProvider();

    public static void main(String[] args) {
        changeAuthetificationStrategy();
        Principal principal = null;
        do {
            System.out.println("\n\nFavor Autentificarse");
            System.out.println("Usuario:");
            String userName = in.next();
            System.out.println("Password:");
            String password = in.next();

            principal = authProvider.authenticate(userName, password);
            if (principal == null) {
                System.out.println("Usuario o password inválido");
                System.out.println("¿Desea cambiar el metodo de autentificación? (S/N)");

                String op = in.next();
                if (op.equalsIgnoreCase("S")) {
                    changeAuthetificationStrategy();
                }
            }
        } while (principal == null);

        System.out.println("Autentificación exitosa");
        System.out.println(principal);
    }

    private static void changeAuthetificationStrategy() {
        System.out.println("Introduzca el tipo de Autentificación a utilizar");
        System.out.println("1.-OnMemory Authentication");
        System.out.println("2.-SQL Authentication");
        System.out.println("3.-XML Authentication");
        int op = in.nextInt();
        switch (op) {
            case 1:
                authProvider.setAuthenticationStrategy(
                        new OnMemoryAuthenticationProvider());
                System.out.println("OnMemory Authentication Select >");
                break;
            case 2:
                authProvider.setAuthenticationStrategy(
                        new SQLAuthenticationProvider());
                System.out.println("SQL Authentication Select >");
                break;
            case 3:
                authProvider.setAuthenticationStrategy(
                        new XMLAuthenticationProvider());
                System.out.println("XML Authentication Select >");
                break;
            default:
                System.out.println("Opcion Invalida");
                System.exit(1);
        }
    }

}
