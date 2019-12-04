package Menus;

import java.util.Scanner;

import static Library.Book.*;
import static Library.Utils.clear;
import static Menus.Consulta_Menu.menu_consulta;
import static Menus.Main_Menu.menu_principal;

public class Book_Menu {
    public static void menu_book()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Adicionar");
        System.out.println("2 - Emprestimo");
        System.out.println("3 - Devolucao");
        System.out.println("4 - Consulta");
        System.out.println("5 - Sugerir");
        System.out.println("6 - Ler sugestoes");
        System.out.println("9 - Menu do programa");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                clear();
                add_book();
                menu_principal();
                break;
            }
            case 2: {
                clear();
                book_rent();
                menu_principal();
                break;
            }
            case 3: {
                clear();
                return_book();
                menu_principal();
                break;
            }
            case 4: {
                clear();
                menu_consulta();
                menu_principal();
                break;
            }
            case 5: {
                clear();
                book_sugestion();
                menu_principal();
                break;
            }
            case 6: {
                clear();
                read_sugestions();
                menu_principal();
                break;
            }
            case 9: {
                clear();
                menu_principal();
                break;
            }
            default: {
                clear();
                System.out.println("Opcao inexistente");
                menu_book();
            }
        }
    }
}
