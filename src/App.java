import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> listStud1 = new ArrayList<Student>();
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Петр", 23);
        Student s3 = new Student("Ольга", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  22);
        Student s7 = new Student("Катя",  21);
        Student s8 = new Student("Егор",  22);
        Student s9 = new Student("Кейт",  24);
        Student s10 = new Student("Абрам",  21);
        Student s11 = new Student("Максим",  23);
        Student s12 = new Student("Леонард",  22);
        Student s13 = new Student("Коля",  21);
        Student s14 = new Student("Вася",  23);
        Student s15 = new Student("Галя",  25);
        Student s16 = new Student("Боря",  22);

        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);

        StudentGroup group4580 = new StudentGroup(listStud1, 4580);

        for(Student std : group4580)
        {
           // System.out.println(std);
        }

        //System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        //System.out.println("=========================================================");

        for(Student std: group4580)
        {
          //  System.out.println(std);
        }

        List<Student> listStud2 = new ArrayList<>(); //Второй список студентов
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);

        List<Student> listStud3 = new ArrayList<>(); //Третий список студентов
        listStud3.add(s12);
        listStud3.add(s11);
        listStud3.add(s10);
        listStud3.add(s16);

        List<Student> listStud4 = new ArrayList<>(); //Четвертый список студентов
        listStud4.add(s13);
        listStud4.add(s14);
        listStud4.add(s15);

        //Добавление групп для списков студентов
        List<StudentGroup> StdGroupList1 = new ArrayList<>();
        List<StudentGroup> StdGroupList2 = new ArrayList<>();
        StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        StudentGroup group4600 = new StudentGroup(listStud3, 4600);
        StudentGroup group4610 = new StudentGroup(listStud4, 4610);

        //Создание списков групп для объявления потоков
        StdGroupList1.add(group4580);
        StdGroupList1.add(group4590);
        StdGroupList2.add(group4600);
        StdGroupList2.add(group4610);

        //Создание, сортировка и вывод потоков
        StudentSteam stream1 = new StudentSteam(1, StdGroupList1);
        StudentSteam stream2 = new StudentSteam(2, StdGroupList2);
        
        System.out.println("------stream1------");
        Collections.sort(stream1.getgroups());
        for (StudentGroup groups : stream1) {
            System.out.println(groups);
        }
        System.out.println("------stream2-------");
        Collections.sort(stream2.getgroups());
        for (StudentGroup groups : stream2){
            System.out.println(groups);
        }

    }
}