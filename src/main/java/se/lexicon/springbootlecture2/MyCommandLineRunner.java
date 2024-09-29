package se.lexicon.springbootlecture2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.springbootlecture2.Repository.AddressRepository;
import se.lexicon.springbootlecture2.Repository.StudentRepository;
import se.lexicon.springbootlecture2.entity.Address;
import se.lexicon.springbootlecture2.entity.Student;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;


    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("Test Street", "Test City", "12345");
        //Address savedAddress = addressRepository.save(address);
        studentRepository.save(new Student("John", "Doe", "johndoe@test.se", address));


    }
}
