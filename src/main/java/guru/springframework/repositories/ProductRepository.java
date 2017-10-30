package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.neo4j.repository.Neo4jRepository;
//import org.springframework.data.neo4j.repository.GraphRepository; // old import
/**
 * Created by jt on 1/10/17.
 * Commented out interface is not supported by 2.0.0 M5
 */
public interface ProductRepository extends Neo4jRepository<Product, Long> /* extends GraphRepository<Product> */ {
}
