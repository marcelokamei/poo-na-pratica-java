import java.time.LocalDate;

import br.marcelokamei.dominio.Bootcamp;
import br.marcelokamei.dominio.Curso;
import br.marcelokamei.dominio.Dev;
import br.marcelokamei.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setCargaHoraria(15);
        curso1.setDescricao("Orientação a Objetos");
        curso1.setTitulo("Curso POO Java");
        // System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria sobre POO com JAVA");
        mentoria1.setTitulo("Mentoria POO Java");
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKamei = new Dev();
        devKamei.setNome("Marcelo");
        devKamei.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Kamei: " + devKamei.getConteudosInscritos());
        System.out.println("----+++++++---");

        devKamei.progredir();
        devKamei.progredir();
        System.out.println("Conteudos inscritos Kamei: " + devKamei.getConteudosInscritos());
        System.out.println("Conteudos concluídos Kamei: " + devKamei.getConteudosConcluidos());
        System.out.println("XP: "+devKamei.calcularTotalXp());
        
        System.out.println("---------------");
        System.out.println("---------------");
        
        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("----+++++++---");
        
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteudos inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluídos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: "+devPedro.calcularTotalXp());
        
    }
}
