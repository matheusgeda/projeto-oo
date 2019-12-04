package Library;

import People.Clients;
import People.Workers;

import static Library.Utils.*;
import static Menus.Main_Menu.menu_principal;

import java.util.*;
public class Main {
    public static ArrayList<Book> list = new ArrayList<>();
    public static ArrayList<String> sugestion = new ArrayList<>();
    public static ArrayList<Clients> clients = new ArrayList<>();
    public static ArrayList<Workers> workers = new ArrayList<>();

    public static void main(String[] args) {
        clear();
        login();
        System.out.print("Logado com sucesso!\n\n");
        menu_principal();
    }
}
