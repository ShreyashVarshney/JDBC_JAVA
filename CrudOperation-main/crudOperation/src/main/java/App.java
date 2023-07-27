import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Student student=new Student();
        student.setName("shreyash");
        student.setEmail("shreyashvarshney37@gmail.com");
        StudentDao studentDao=StudentDaoFactory.getStudentDao();
        studentDao.addStudent(student);
    }
}
