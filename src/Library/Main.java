package Library;

import Human.Clients;
import Human.Workers;

import static Human.Clients.*;
import static Human.Workers.*;
import static Library.Utils.*;
import static Library.Book.*;
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
