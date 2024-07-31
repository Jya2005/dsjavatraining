package oops;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class classobject {
    public static void  main(String[]args){
        //print the trainer name, technology
        //print the student name, technology
        Trainer trainer = new Trainer();
        trainer.trainerName = "pawan sharma";
        trainer.trainertechnolgy = "advance java";
        //to call the method of trainer class to print profile
        trainer.printtrainerprofile(trainer.trainerName,trainer.trainertechnolgy);

        System.out.println("my name is " + trainer.trainerName +
                "  my technology is " + trainer.trainertechnolgy);

    }
}
class Trainer {
    String trainerName;
    String trainertechnolgy;

    void printtrainerprofile(String name, String technolgy) {

    }
}


class student{

     String getStudentname;
     String getstudenttechnology;


}