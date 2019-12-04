package Library;

public class Validate {
    public static boolean is_valid_cpf(String cpf)
    {
        if(only_numbers(cpf) && cpf.length() == 11)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean only_numbers(String cpf)
    {
        return cpf.matches("[0-9]*");
    }
    public static boolean is_valid_name(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    public static boolean is_valid_telephone(String telephone)
    {
        if(only_numbers(telephone) && telephone.length() == 11)
        {
            return true;
        }
        else return false;
    }
}
