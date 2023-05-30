import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class AppCrianca {
    public static void main(String[] args) throws Exception {
        var properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        final String OPENAI_API_KEY = 
            properties.getProperty("OPENAI_API_KEY");
        // instanciar o ChatGPTCrianca
        var chatGPTCrianca = new ChatGPTCrianca();
        //Solicitar uma pergunta ao usuário
        String pergunta = JOptionPane.showInputDialog("Faça uma pergunta: ");
        //Chamar o método gerarExplicacao, obter o resultado
        String s = chatGPTCrianca.gerarExplicacao(
            OPENAI_API_KEY,
            pergunta
        );
        //e exibir
        JOptionPane.showMessageDialog(null, s);
    }
}
