package se.lexicon.springbootlecture2.Repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.springbootlecture2.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
