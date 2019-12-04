package Menus;

import Library.Main;

import java.util.Scanner;

import static Library.Utils.clear;
import static Menus.Main_Menu.menu_principal;

public class Consulta_Menu {
    public static void menu_consulta()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Consulta simples");
        System.out.println("2 - Consulta livros disponiveis");
        System.out.println("3 - Consulta completa");
        System.out.println("9 - Menu do programa");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                clear();
                if(Main.list.size() == 0){
                    System.out.println("Nenhum livro a ser listado");
                    menu_principal();
                }
                for(int i = 1; i<= Main.list.size(); i++) System.out.println(i + ". " + Main.list.get(i-1).title);
                menu_principal();
                break;
            }
            case 2: {
                clear();
                if(Main.list.size() == 0){
                    System.out.println("Nenhum livro a ser listado");
                    menu_principal();
                }
                int j=0;
                for(int i=1;i<=Main.list.size();i++)
                {
                    if(Main.list.get(i-1).status == true)
                    {
                        j++;
                        System.out.println(j + ". " + Main.list.get(i-1).title);
                    }
                }
                menu_principal();
                break;
            }
            case 3: {
                clear();
                if(Main.list.size() == 0){
                    System.out.println("Nenhum livro a ser listado");
                    menu_principal();
                }
                for(int i=1;i<=Main.list.size();i++)
                {
                    System.out.println(i + ". Nome: " + Main.list.get(i-1).title);
                    System.out.println("   Genero: " + Main.list.get(i-1).genre);
                    System.out.println("   Autor: " + Main.list.get(i-1).author);
                    if(Main.list.get(i-1).status == true) System.out.println("   Status: Disponivel");
                    else System.out.println("   Indisponivel");
                }
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
                menu_consulta();
                break;
            }
        }
    }
}
