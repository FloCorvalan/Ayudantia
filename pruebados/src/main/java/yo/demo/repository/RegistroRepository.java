package yo.demo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yo.demo.model.RegistroModel;

@Repository
public interface RegistroRepository extends MongoRepository<RegistroModel, String>{

}
