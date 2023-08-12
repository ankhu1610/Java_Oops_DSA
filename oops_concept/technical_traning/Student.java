package oops_concept.technical_traning;

public class Student {
    private String roll_no;
    private String name;
    private int maths_mark;
   private int science_marks;
   private int computer_marks;
   Student()
   {
      maths_mark = 0;
      science_marks = 0;
   }
   Student(String roll_no,String name)
   {
      this();
      this.roll_no = roll_no;
      this.name = name;

   }
   public void setRoll_no(String roll_no) {
      this.roll_no = roll_no;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setMaths_mark(int maths_mark) {
      this.maths_mark = maths_mark;
   }

   public void setScience_marks(int science_marks) {
      this.science_marks = science_marks;
   }

   public void setComputer_marks(int computer_marks) {
      this.computer_marks = computer_marks;
   }



   public String getName() {
      return name;
   }

   public int getMaths_mark() {
      return maths_mark;
   }

   public int getScience_marks() {
      return science_marks;
   }

   public int getComputer_marks() {
      return computer_marks;
   }

   public String getRoll_no() {
      return roll_no;
   }
   double percentage()
   {
      return (computer_marks+science_marks+maths_mark)/3;
   }
   char grade()
   {
      if(percentage() > 90)
      {
         return 'A';
      }
      else if (percentage() < 90 && percentage() > 70 )
      {
         return 'B';
      }
      else if (percentage() < 70 && percentage() > 60 )
      {
         return 'C';
      }
      else if (percentage() < 60 && percentage() > 50 )
      {
         return 'D';
      }
      else
      {
         return 'F';
      }
   }
   @Override
   public String toString(){
           return "ROLL_NO "+roll_no+ " Name "+name+" percentage "+percentage()+" grade "+grade();
       }
}
