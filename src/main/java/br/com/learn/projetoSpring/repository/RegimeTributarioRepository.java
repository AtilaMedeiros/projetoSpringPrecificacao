package br.com.learn.projetoSpring.repository;

import br.com.learn.projetoSpring.model.RegimeTributario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RegimeTributarioRepository extends JpaRepository<RegimeTributario, Long> {
}
