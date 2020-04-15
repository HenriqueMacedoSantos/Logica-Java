
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fornecedor {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    public Fornecedor(){
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean valida(String email) {
        boolean inValido = true;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                inValido = false;
            }
        }
        return inValido;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail: " + email + 
               "\nEndereço: " + endereco;
    }
}
