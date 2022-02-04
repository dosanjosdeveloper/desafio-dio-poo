import br.com.dosanjosdeveloper.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDecricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDecricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDecricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer.");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.InscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("**********");
        System.out.println("Conteúdos Inscritos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularXp());

        System.out.println("------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.InscreverBootCamp(bootCamp);
        System.out.println("Contedúdos Inscristos João: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("**********");
        System.out.println("Contedúdos Inscristos João: "+devJoao.getConteudosInscritos());
        System.out.println("Contedúdos Concluídos João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularXp());
    }
}
