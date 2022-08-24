package br.com.learn.projetoSpring.repository;

import br.com.learn.projetoSpring.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {


/*    @Query(value = "SELECT * FROM tb_empresas e" +
            "WHERE e.nome = ?1", nativeQuery = true)
    List<Empresa> findByNome(String nome);*/


    //note que a formacao da var precisa conter o mesmo nome do campo na tabela findBy"nome"
    List<Empresa> findByNome(String nome);


//    @Query("select * from tb_empresas e where e.nome like %?1")
//    List<Empresa> findByNome(String firstname);



//    @Query(value = "SELECT * FROM tb_matriculas m " +
//            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
//            "WHERE a.bairro = :bairro", nativeQuery = true)
//        //@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
//    List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
