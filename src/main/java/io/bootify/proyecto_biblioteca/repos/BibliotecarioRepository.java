package io.bootify.proyecto_biblioteca.repos;

import io.bootify.proyecto_biblioteca.domain.Bibliotecario;
import io.bootify.proyecto_biblioteca.domain.Lector;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {

    Bibliotecario findFirstByLector(Lector lector);

    boolean existsByLectorId(Long id);

}
