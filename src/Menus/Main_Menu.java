package Menus;

import java.util.Scanner;

import static Library.Utils.clear;
import static Menus.Book_Menu.*;
import static Menus.Clients_Menu.menu_clients;
import static Menus.Workers_Menu.menu_workers;

public class Main_Menu {
    public static void menu_principal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1 - Livros");
        System.out.println("2 - Clientes");
        System.out.println("3 - Funcionarios");
        System.out.println("9 - Sair do Programa");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                clear();
                menu_book();
                break;
            }
            case 2: {
                clear();
                menu_clients();
                break;
            }
            case 3: {
                clear();
                menu_workers();
                break;
            }
            case 9: {
                System.exit(0);
                break;
            }
            default: {
                clear();
                System.out.println("Opcao inexistente");
                menu_principal();
            }

        }
    }
}
