package Library;
import java.util.Scanner;
public class Utils
{
    private static String login="", password="";
    static void login()
    {
        Scanner sc = new Scanner(System.in);
        while(!login.equals("123"))
        {
            System.out.print("Digite o login:\n");
            login=sc.nextLine();
            if(!(login.equals("123")))
            {
                clear();
                System.out.print("Login incorreto\n\n");
            }
        }
        clear();
        while(!password.equals("123"))
        {
            System.out.print("Digite a senha:\n");
            password=sc.nextLine();
            if(!(password.equals("123")))
            {
                clear();
                System.out.print("Senha incorreta\n\n");
            }
        }
        clear();
    }
    public static void clear(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
