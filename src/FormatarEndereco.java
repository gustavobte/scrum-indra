import java.text.Normalizer;

public class FormatarEndereco {
  
  public static void main(String[] args) {
    System.out.println(removerAcentos("‡¡Û¸".toLowerCase()));
  }
  
  public static String formatar(String str) {
    return removerAcentos(str.toLowerCase());
  }
  
  public static String removerAcentos(String str) {
      return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
  }
  
}

