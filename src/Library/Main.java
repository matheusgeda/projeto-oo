package Library;

import Human.Clients;
import Human.Workers;

import static Human.Clients.*;
import static Human.Workers.*;
import static Library.Utils.*;
import static Library.Book.*;
import java.util.*;
public class Main {
    static ArrayList<Book> list = new ArrayList<>();
    static ArrayList<String> sugestion = new ArrayList<>();
    public static ArrayList<Clients> clients = new ArrayList<>();
    public static ArrayList<Workers> workers = new ArrayList<>();

    public static void main(String[] args) {
        clear();
        login();
        System.out.print("Logado com sucesso!\n\n");
        menu_principal();
    }

    public static void menu_principal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1 - Livros");
        System.out.println("2 - Clientes");
        System.out.println("3 - Funcionarios");
        System.out.println("9 - Sair do Programa");
        int opt = sc.nextInt();
        switch (opt) {
            case 1: {
                clear();
                menu_livros();
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

    public static void menu_livros()
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
                menu_livros();
            }
        }
    }
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
                if(list.size() == 0){
                    System.out.println("Nenhum livro a ser listado");
                    menu_principal();
                }
                for(int i=1;i<=Main.list.size();i++) System.out.println(i + ". " + Main.list.get(i-1).title);
                menu_principal();
                break;
            }
            case 2: {
                clear();
                if(list.size() == 0){
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
                if(list.size() == 0){
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
                if(workers.size() == 0){
                    System.out.println("Nenhum funcionario a ser demitido");
                    menu_principal();
                }
                System.out.println("Escolha o funcionario a ser demitido");
                for(int i=1;i<=workers.size();i++){
                    System.out.println(i + " " + workers.get(i-1).name);
                }
                int opt2 = sc.nextInt();
                clear();
                System.out.println(workers.get(opt2-1).name + " demitido com sucesso");
                workers.remove(opt2-1);
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
