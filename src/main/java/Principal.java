
import com.templatemethod.Facebook;
import com.templatemethod.Network;
import com.templatemethod.Twitter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Insira o nome de usuário: ");
        String userName = reader.readLine();
        System.out.print("Insira senha: ");
        String password = reader.readLine();

        // Digite a mensagem.
        System.out.print("Insira mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha a rede social para postar a mensagem.\n"
                + "1 - Facebook\n"
                + "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Cria um objeto de rede adequado e envia a mensagem.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
