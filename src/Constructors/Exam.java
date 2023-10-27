package Constructors;

public class Exam {
    int exam_id;
    Reattempt reattempt_exam;

    Exam(){
        exam_id = -1;
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
        this.reattempt_exam = other.reattempt_exam;
    }
}
