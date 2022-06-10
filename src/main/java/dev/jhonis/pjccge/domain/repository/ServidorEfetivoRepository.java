package dev.jhonis.pjccge.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jhonis.pjccge.domain.entity.ServidorEfetivo;

public interface ServidorEfetivoRepository extends JpaRepository<ServidorEfetivo, Long>{

	Optional<ServidorEfetivo> findByMatricula(String matricula);
}
