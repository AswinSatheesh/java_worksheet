import java.util.*;      
public class studentDetails {
    private String studentName;
    private int regNo;
    private int physicsMark;
    private int chemistryMark;
    private int mathsMark;
    private int[] cutOff;

    void setStudentName (String studentName){
        this.studentName = studentName;

    }
    String getStudentName () {
        return studentName;
    }
    void setRegNo ( int regNo){
        this.regNo = regNo;
    }
    int getRegNo () {
        return regNo;
    }
    void setPhysicsMark ( int physicsMark){
        this.physicsMark = physicsMark;
    }
    int getPhysicsMark (){
        return physicsMark;
    }
    void setChemistryMark ( int chemistryMark){
        this.chemistryMark = chemistryMark;

    }int getChemistryMark (){
        return chemistryMark;
    }
    void setMathsMark ( int mathsMark){
        this.mathsMark = mathsMark;

    }
    int getMathsMark (){
        return mathsMark;
    }
    void setCutOff(int[] cutOff){
        this.cutOff=cutOff;
    }
    int[] getCutOff(){
        return cutOff;
    }
    //method to get data from author object
    public String toString(){
        return "studentDetails:[studentName="+getStudentName()+", regNo="+getRegNo()+",physicsMark="+getPhysicsMark()+",chemistryMark="+getChemistryMark()+",mathsMark="+getMathsMark()+",cutOff="+ Arrays.toString(getCutOff()) +"]";
    }

}