package aislingguinan.b;

import aislingguinan.assignment1.*;
import org.joda.time.LocalDate;

public class main {

    public static void main(String[] args) {
        Student john = new Student(1234, "john doe", "11/3/1993");
        Student jane = new Student(1321, "jane doe", "1/2/1994");
        Student niamh = new Student(2345, "niamh smith", "5/8/1995");
        Student sean = new Student(4421, "sean black", "3/12/1994");
        Student mike = new Student(1521, "mike baker", "23/10/1994");
        Student [] list = {};

        Module CT101 = new Module("CT101", "Intro Programming", list);
        Module CT203 = new Module("CT203", "How not to break everything", list);
        Module CT321 = new Module("CT321", "Advanced Procrastination", list);
        Module FR301 = new Module("FR301", "Non, je n'ai regrette rien", list);
        Module HI321 = new Module("HI321", "Romanes eunt domus", list);

        Module [] modules = {};

        LocalDate s = new LocalDate(2016, 9, 4);
        LocalDate e = new LocalDate(2017, 4, 30);
        Course ba3 = new Course("3BA", "Third Year Arts", modules,s,e);
        Course cs3 = new Course("3CS", "Third Year CS&IT", modules,s,e);
        Course cs1 = new Course("1CS", "First year CS&IT", modules,s,e);
    

        CT101.addStudent(sean);
        CT203.addStudent(niamh);
        CT203.addStudent(mike);
        CT321.addStudent(john);
        CT321.addStudent(niamh);
        CT321.addStudent(mike);
        FR301.addStudent(jane);
        HI321.addStudent(jane);
        ba3.addModule(FR301);
        ba3.addModule(HI321);
        cs3.addModule(CT203);
        cs3.addModule(CT321);
        cs1.addModule(CT101);
        
        for(int x=0;x<cs1.listModule().size();x++){
            cs1.listModule().get(x);
            Module q = ((Module) cs1.listModule().get(x));
            for(int y=0;y<q.listStudent().size();y++){
                q.listStudent().get(y);
                Student z = ((Student)q.listStudent().get(y));
                System.out.println("name: " + z.getName());
                System.out.println("modules: " + q.getName());
                System.out.println(cs1.getName());
                System.out.println("----");
            }
            System.out.println("----");
        }

         for(int x=0;x<cs3.listModule().size();x++){
            cs3.listModule().get(x);
            Module q = ((Module) cs3.listModule().get(x));
            for(int y=0;y<q.listStudent().size();y++){
                q.listStudent().get(y);
                Student z = ((Student)q.listStudent().get(y));
                System.out.println(" name: "+ z.getName());
                System.out.println("modules: " + q.getName());
                System.out.println(cs1.getName());
                System.out.println("----");
            }
            System.out.println("----");
        }
        
        for(int x=0;x<ba3.listModule().size();x++){
            ba3.listModule().get(x);
            Module q = ((Module) ba3.listModule().get(x));
            for(int y=0;y<q.listStudent().size();y++){
                q.listStudent().get(y);
                Student z = ((Student)q.listStudent().get(y));
                System.out.println(" name: "+ z.getName());
                System.out.println("modules: " + q.getName());
                System.out.println(cs1.getName());
                System.out.println("----");
            }
            System.out.println("----");
        }
    }
}
