package Se.lexicon.SPRING_BOOT_LECTURE_1;

import Se.lexicon.SPRING_BOOT_LECTURE_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {

    }
}
