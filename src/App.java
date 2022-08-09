import java.time.LocalDate;

import br.marcelokamei.dominio.Curso;
import br.marcelokamei.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(30);
        curso1.setDescricao("Orientação a Objetos");
        curso1.setTitulo("Curso POO Java");
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria sobre POO com JAVA");
        mentoria1.setTitulo("Mentoria POO Java");
        System.out.println(mentoria1);

    }
}
