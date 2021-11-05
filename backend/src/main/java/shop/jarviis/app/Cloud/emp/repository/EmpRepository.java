package shop.jarviis.app.Cloud.emp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shop.jarviis.app.Cloud.emp.domain.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {

    @Query(value = "select  dept_no, count(*) empCountPerDept, sum(sal) salSum" +
            "from emp\n" +
    )
}
