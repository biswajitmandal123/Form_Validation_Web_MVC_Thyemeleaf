package in.biswajit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.biswajit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
