package People;

import Library.Main;

import java.util.*;

import static Library.Utils.*;
import static Library.Validate.*;
import static Menus.Main_Menu.menu_principal;

public class Clients extends People
{
    public Boolean status; //se status for verdadeiro ele esta com um livro
    public static void client_register()
    {
        Clients c = new Clients();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        c.name = sc.nextLine();
        while (!is_valid_name(c.name)){
            clear();
            System.out.println("Nome invalido!\nDigite um nome valido: ");
            c.name = sc.nextLine();
        }
        System.out.println("Digite o CPF:");
        c.cpf = sc.nextLine();
        while (!is_valid_cpf(c.cpf)){
            clear();
            System.out.println("CPF invalido!\nDigite um cpf valido com 11 digitos numericos: ");
            c.cpf = sc.nextLine();
        }
        System.out.println("Digite o telefone:");
        c.telephone_number = sc.nextLine();
        while (!is_valid_telephone(c.telephone_number)){
            clear();
            System.out.println("Telefone invalido!\nDigite um telefone valido com 11 digitos numericos:");
            c.telephone_number = sc.nextLine();
        }
        c.status = false;
        Main.clients.add(c);
        clear();
        System.out.println("Cliente registrado com sucesso");
    }
    public static void client_list(){
        if(Main.clients.size() == 0){
            System.out.println("Nenhum cliente a ser listado");
            menu_principal();
        }
        for(int i=1;i<=Main.clients.size();i++)
        {
            System.out.println(i + ". Nome: " + Main.clients.get(i-1).name + "\n   CPF: " + Main.clients.get(i-1).cpf + "\n   Telefone: " + Main.clients.get(i-1).telephone_number);
            System.out.print("   Esta com algum livro: ");
            if(Main.clients.get(i-1).status){
                System.out.println("sim");
            }
            else{
                System.out.println("nao");
            }
        }
    }
}
