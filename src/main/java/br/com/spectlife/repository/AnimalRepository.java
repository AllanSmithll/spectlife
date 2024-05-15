package br.com.spectlife.repository;

import br.com.spectlife.model.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {}