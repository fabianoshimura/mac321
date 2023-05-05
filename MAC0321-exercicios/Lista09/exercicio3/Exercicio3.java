package exercicio3;

import java.util.*;
import java.io.*;

public class Exercicio3 implements StudentDao {
    String pwd = "output3.txt";
    
    List<Student> students;
  
    BufferedReader br;
    PrintWriter writer;

    public Exercicio3() {
        students = new ArrayList<Student>();
    }
    
    public List<Student> getAllStudents() {
        try {
            br = new BufferedReader(new FileReader(pwd));
        } catch (IOException e) {
            //e.printStackTrace();
        }

        String nome = null;
        int roll = 0;

        try {
            nome = br.readLine();
            roll = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            //e.printStackTrace();
        } catch (NumberFormatException e) {
            //e.printStackTrace();
        }

        do {
            Student s = null;

            try {
                s = new Student(nome, roll);
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            }

            students.add(s);

            try {
                nome = br.readLine();
                roll = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            } catch (IOException e) {
                //e.printStackTrace();
            }
        } while (nome != null);
    
        return students;
    }

    public Student getStudent(int rollNo) {
        try {
            br = new BufferedReader(new FileReader(pwd));
        } catch (IOException e) {
            //e.printStackTrace();
        }
        
        String nome = null;
        int roll = 0;
        Student s;

        do {
            try {
                nome = br.readLine();
                roll = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            } catch (IOException e) {
                //e.printStackTrace();
            }

            try {
                s = new Student(nome, roll);
                if(roll == rollNo){
                	return s;
                }
            } catch (NumberFormatException e) {
                //e.printStackTrace();
            }
        } while (nome != null);

        System.out.println("Não foi encontrado nenhum estudante nesse rollNo.");
        return null;
    }

    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        saveTxt();
    }

    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        saveTxt();
    }
    
    public void saveTxt() {
        try {
            writer = new PrintWriter(pwd, "UTF-8");
        } catch (IOException e) {
            //e.printStackTrace();
        }
        
        for (int i = 0; i < students.size(); i++) {
            writer.println("" + students.get(i).getName());
            writer.println("" + students.get(i).getRollNo());
        }
        
        writer.close();
    }
    
    public static void main (String[] args) {
        StudentDao e = new Exercicio3();
        List<Student> lista = new ArrayList<Student>();
        
        lista = e.getAllStudents();
        
        for (Student student : lista) {
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
        }
        
        Student student = lista.get(0);
        student.setName("Josemias");
        e.updateStudent(student);
        
        student = e.getStudent(1);
        System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
        
        student = e.getStudent(0);
        e.deleteStudent(student);
    }
}
