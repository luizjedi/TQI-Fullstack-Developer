package application.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnderecoRepository extends CrudRepository<Endereco, String> {

}
