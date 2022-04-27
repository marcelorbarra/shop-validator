package br.com.marcelorbarra.repository;

import br.com.marcelorbarra.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByIdentifier(String identifier);

}
