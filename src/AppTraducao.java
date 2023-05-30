import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class AppTraducao {
    public static void main(String[] args) throws Exception {
        var properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        final String OPENAI_API_KEY = 
            properties.getProperty("OPENAI_API_KEY");
        // instanciar o ChatGPTTraducao
        var chatGPTTraducao = new ChatGPTTraducao();
        //Solicitar texto ao usuário
        String texto = JOptionPane.showInputDialog("Digite um texto a ser traduzido: ");
        //Chamar o método traduzir, obter o resultado
        String s = chatGPTTraducao.traduzir(
            OPENAI_API_KEY, 
            texto
        );
        //e exibir
        JOptionPane.showMessageDialog(null, s);
    }
}
