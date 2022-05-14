package Aula04ex;

import java.util.Locale;


public class idomaSistema {
    public static void main(String[] args) {
        Locale language = Locale.getDefault();
        System.out.print("O idioma do sistema está em: ");
        System.out.println (language.getDisplayLanguage()); // imprime “Português”

    }
}
