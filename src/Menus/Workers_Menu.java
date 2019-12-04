package Menus;

import Library.Main;

import java.util.Scanner;

import static People.Workers.worker_register;
import static People.Workers.workers_list;
import static Library.Utils.clear;
import static Menus.Main_Menu.menu_principal;

public class Workers_Menu {
    public static void menu_workers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Contratar funcionario");
        System.out.println("2 - Demitir funcionario");
        System.out.println("3 - Consultar funcionarios");
        System.out.println("9 - Menu do programa");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                clear();
                worker_register();
                menu_principal();
                break;
            }
            case 2: {
                clear();
                if(Main.workers.size() == 0){
                    System.out.println("Nenhum funcionario a ser demitido");
                    menu_principal();
                }
                System.out.println("Escolha o funcionario a ser demitido");
                for(int i=1;i<=Main.workers.size();i++){
                    System.out.println(i + " " + Main.workers.get(i-1).name);
                }
                int opt2 = sc.nextInt();
                clear();
                System.out.println(Main.workers.get(opt2-1).name + " demitido com sucesso");
                Main.workers.remove(opt2-1);
                menu_principal();
                break;
            }
            case 3: {
                clear();
                workers_list();
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
                menu_workers();
                break;
            }
        }
    }
}
