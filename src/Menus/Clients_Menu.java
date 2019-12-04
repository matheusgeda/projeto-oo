package Menus;

import java.util.Scanner;

import static Human.Clients.client_list;
import static Human.Clients.client_register;
import static Library.Utils.clear;
import static Menus.Main_Menu.menu_principal;

public class Clients_Menu {
    public static void menu_clients()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Cadastrar novo cliente");
        System.out.println("2 - Consultar clientes");
        System.out.println("9 - Menu do programa");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                clear();
                client_register();
                menu_principal();
                break;
            }
            case 2: {
                clear();
                client_list();
                menu_principal();
                break;
            }
            case 9: {
                clear();
                menu_principal();
                break;
            }
            default:{
                clear();
                System.out.println("Opcao inexistente");
                menu_clients();
                break;
            }
        }
    }
}
