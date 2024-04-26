package fatec.com.sigvs.ti_model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Req01CadastrarLivro {
 
    Biblioteca biblioteca;
    @Test
    public void ct01_cadastrar_livro_com_sucesso(){
        //dado que o usuario entrou com as informações de livro
        biblioteca = new Biblioteca();
        //quando o ususraio confirma a operação
        Livro livro = new Livro ("Engenharia de software","Presman");
        biblioteca.save(livro);
        // entao o livro fica disponivel para consulta
        assertEquals(1, biblioteca.size());

    }
}