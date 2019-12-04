package People;

import Library.Main;

import java.util.*;

import static Library.Utils.*;
import static Library.Validate.*;
import static Menus.Main_Menu.menu_principal;

public class Workers extends People {
    private String salary;
    public String function;
    public static void worker_register()
    {
        Workers w = new Workers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        w.name = sc.nextLine();
        while (!is_valid_name(w.name)){
            clear();
            System.out.println("Nome invalido!\nDigite um nome valido: ");
            w.name = sc.nextLine();
        }
        System.out.println("Digite o CPF:");
        w.cpf = sc.nextLine();
        while (!is_valid_cpf(w.cpf)){
            clear();
            System.out.println("CPF invalido!\nDigite um cpf valido com 11 digitos numericos: ");
            w.cpf = sc.nextLine();
        }
        System.out.println("Digite o telefone:");
        w.telephone_number = sc.nextLine();
        while (!is_valid_telephone(w.telephone_number)){
            clear();
            System.out.println("Telefone invalido!\nDigite um telefone valido com 11 digitos numericos:");
            w.telephone_number = sc.nextLine();
        }
        System.out.println("Digite o salario:");
        w.salary = sc.nextLine();
        while (!only_numbers(w.salary)){
            clear();
            System.out.println("Salario invalido!\nDigite um salario valido com apenas digitos numericos:");
            w.salary = sc.nextLine();
        }
        System.out.println("Digite a funcao do funcionario:");
        w.function = sc.nextLine();
        while (!is_valid_name(w.function)){
            clear();
            System.out.println("Funcao invalida!\nDigite uma funcao valida apenas com caracteres:");
            w.function = sc.nextLine();
        }
        Main.workers.add(w);
        System.out.println("Funcionario contratado com sucesso!");
    }
    public static void workers_list(){
        if (Main.workers.size() == 0){
            clear();
            System.out.println("Nenhum funcionario encontrado");
            menu_principal();
        }
        for(int i=1;i<=Main.workers.size();i++){
            System.out.println(i + " Nome: " + Main.workers.get(i-1).name);
            System.out.println("  CPF: " + Main.workers.get(i-1).cpf);
            System.out.println("  Telefone: " + Main.workers.get(i-1).telephone_number);
            System.out.println("  Salario: " + Main.workers.get(i-1).salary + " reais");
            System.out.println("  Funcao: " + Main.workers.get(i-1).function);
        }
    }
}

