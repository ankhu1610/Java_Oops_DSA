package oops_concept.technical_traning;

public class MarkSheet {
    public static void main(String[] args) {
        Student ankit = new Student("200105006","ankit");
        ankit.setMaths_mark(95);
        ankit.setComputer_marks(80);
        ankit.setScience_marks(78);
//        @Override
        System.out.println(ankit);
    }
}
