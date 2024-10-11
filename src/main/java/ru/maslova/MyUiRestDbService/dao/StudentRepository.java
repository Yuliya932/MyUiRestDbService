package ru.maslova.MyUiRestDbService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.maslova.MyUiRestDbService.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
