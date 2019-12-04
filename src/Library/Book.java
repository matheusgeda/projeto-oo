package Library;

import java.util.*;

import static People.Clients.client_list;
import static Library.Utils.clear;
import static Library.Validate.*;
import static Menus.Main_Menu.menu_principal;

public class Book
{
    public String title;
    public String genre;
    public String author;
    public Boolean status; //se for verdadeiro o livro esta disponivel
    public static void add_book()
    {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.print("Digite o titulo:\n");
        b.title = sc.nextLine();
        System.out.print("Digite o genero:\n");
        b.genre = sc.nextLine();
        while (!is_valid_name(b.genre)){
            clear();
            System.out.println("Genero invalido!\nDigite um genero valido: ");
            b.genre = sc.nextLine();
        }
        System.out.print("Digite o autor:\n");
        b.author = sc.nextLine();
        while (!is_valid_name(b.author)){
            clear();
            System.out.println("Nome invalido!\nDigite um nome valido: ");
            b.author = sc.nextLine();
        }
        b.status = true;
        clear();
        System.out.print("Livro adicionado!\n\n");
        System.out.println("Titulo: " + b.title);
        System.out.println("Genero: " + b.genre);
        System.out.println("Autor: " + b.author);
        Main.list.add(b);
    }
    public static void book_sugestion()
    {
        String sugestion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo do livro desejado:");
        sugestion = sc.nextLine();
        Main.sugestion.add(sugestion);
        clear();
        System.out.println("Livro adicionado a nossa lista de sugestoes");
    }
    public static void read_sugestions()
    {
        if(Main.sugestion.size() == 0){
            System.out.println("Nenhuma sugestao a ser lida");
            menu_principal();
        }
        for(int i=1;i<=Main.sugestion.size();i++) System.out.println(i + ". " + Main.sugestion.get(i-1));
        System.out.println();
    }
    public static void book_rent()
    {
        int opt, opt2, i;
        Scanner sc = new Scanner(System.in);
        if(Main.list.size()>0 && Main.clients.size()>0)
        {
            System.out.println("Qual seu perfil:");
            client_list();
            opt = sc.nextInt();
            if(Main.clients.get(opt-1).status == true)
            {
                System.out.println("Voce ja esta com um livro");
                menu_principal();
            }
            else{
                Main.clients.get(opt-1).status = true;
            }
            System.out.println("Qual desses livros voce deseja pegar:");
            for(i=1;i<=Main.list.size();i++) System.out.println(i + ". " + Main.list.get(i-1).title);
            opt2 = sc.nextInt();
            if(Main.list.get(opt2-1).status == true)
            {
                Main.list.get(opt2-1).status = false;
                System.out.println("Livro emprestado com sucesso");
            }else{
                System.out.println("Livro esta indisponivel no momento");
                Main.clients.get(opt-1).status = false;
                menu_principal();
            }
        }else {
            System.out.println("Clientes ou livros insuficientes.");
            menu_principal();
        }
    }
    public static void return_book()
    {
        int opt, opt2, i;
        Scanner sc = new Scanner(System.in);
        if(Main.clients.size() == 0 || Main.list.size() == 0) {
            System.out.println("Livros ou clientes insuficientes");
            menu_principal();
        }
        System.out.println("Qual seu perfil: ");
        client_list();
        opt = sc.nextInt();
        if(Main.clients.get(opt-1).status == true)
        {
            System.out.println("Qual desses livros voce deseja devolver:");
            for(i=1;i<=Main.list.size();i++) System.out.println(i + ". " + Main.list.get(i-1).title);
            opt2 = sc.nextInt();
            if (Main.list.get(opt2-1).status == false){
                Main.clients.get(opt-1).status = false;
                Main.list.get(opt2-1).status = true;
                clear();
                System.out.println("Livro devolvido");
                menu_principal();
            }
            else{
                System.out.println("Livro nao esta emprestado");
                menu_principal();
            }
        }
        else{
            System.out.println("Este perfil nao esta com um livro");
            menu_principal();
        }
    }
}