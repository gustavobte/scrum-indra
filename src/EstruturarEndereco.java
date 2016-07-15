import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EstruturarEndereco {
  
  static String ex = FormatarEndereco.formatar("rua asdffas");
  
  public static void main(String[] args) {
    Matcher rua = retiraRua(ex);
    Matcher lote = retiraLote(ex);
    
    while (rua.find()) {
      System.out.println(rua.group(0));
    }
    
    if (lote.find())
      System.out.println(lote.group(0));
  }
  
  public static Matcher retiraRua(String str) {
    String patt = "((rua)|(r\\.)|(avenida)|(av\\.))[\\s:].*";
    Pattern regex = Pattern.compile(patt);
    Matcher resultado = regex.matcher(str);
    
    return resultado;
  }
  
  public static Matcher retiraLote(String str) {
    String patt = "((lote)|(lt\\.)|(l\\.))[\\s:]d{1,3}";
    Pattern regex = Pattern.compile(patt);
    Matcher resultado = regex.matcher(str);
    
    return resultado;
  }
  
  public static Matcher retiraQuadra(String str) {
    String patt = "(quadra \\w+)";
    Pattern regex = Pattern.compile(patt);
    Matcher resultado = regex.matcher(str);
    
    return resultado;
  }

}
