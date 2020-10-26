import java.util.Scanner;

public class Submission{

        private String fileName;
        private String fileType;
        private double fileSize;
        private String subDate;
        private int studentID;

        public Submission (){
            subDate="05 Oct 2020";
        }
        //set methods    
        public void set_Name(String fileName_in) 
        { fileName=fileName_in; }
        public void set_Type(String fileType_in) 
        { fileType=fileType_in;}
        public void set_Size(double fileSize_in) 
        {fileSize=fileSize_in;}
        public void set_studentID(int studentID_in) 
        {studentID=studentID_in;}

        //get methods
        public String get_Name ()
        {return fileName;}
        public String get_Type ()
        {return fileType;}
        public double get_Size ()
        {return fileSize;}
        public String get_Date()
        {return subDate;}
        public int get_studentID ()
        {return studentID;}

    
    public static void main (String [] args){
        Submission s=new Submission();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your studentID: ");
	    int studentID_in=sc.nextInt();
        s.set_studentID(studentID_in);

        System.out.println("Enter your file name: ");
	    String fileName_in=sc.next();
        s.set_Name (fileName_in);

        System.out.println("Enter your file type: ");
	    String fileType_in=sc.next();
        s.set_Type(fileType_in);

        System.out.println("Enter your file size: ");
	    double fileSize_in=sc.nextDouble();
        s.set_Size(fileSize_in);

        //output
        System.out.println(s.studentID);
        System.out.println(s.fileName);
        System.out.println(s.fileType);
        System.out.println((s.fileSize)+"mb");
        System.out.print(s.subDate);
    }
    
}