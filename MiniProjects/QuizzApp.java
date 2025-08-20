package MiniProjects;

import java.util.ArrayList;
import java.util.Scanner;

class Questions{
    String question;
    String A;
    String B;
    String C;
    String D;
    char ans;
    Questions(String questions,String a,String b,String c,String d,char rightAns){
        question=questions;
        A=a;
        B=b;
        C=c;
        D=d;
        ans=rightAns;
    }

}

public class QuizzApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Questions> al=new ArrayList<>();
        al.add(new Questions("What is a correct syntax to output \"Hello World\" in Java?","A. print(\"Hello World\")","B. System.out.println(\"Hello World\")","C. Console.WriteLine(\"Hello World\")","D. echo(\"Hello World\")",'B'));
        al.add(new Questions(("public class Methods {                        \n" +
                "    public static void add(float a,double b){ \n" +
                "        System.out.println(\"float, double\");  \n" +
                "    }                                         \n" +
                "    public static void add(double a, float b){\n" +
                "        System.out.println(\"double\",\"float\"); \n" +
                "    }                                         \n" +
                "                                              \n" +
                "    public static void main(String[] args) {  \n" +
                "        add(3.14f,3.14f);                     \n" +
                "    }                                         \n" +
                "}                                             "),"A. float double","B. double float ","C. Error","D. None of the above",'C'));
        al.add(new Questions(("public class Methods {                        \n" +
                "    public static void add(int a,int b){ \n" +
                "        System.out.println(\"int, int\");  \n" +
                "    }                                         \n" +
                "    public static void add(char a, int b){\n" +
                "        System.out.println(\"char \",\"int\"); \n" +
                "    }                                         \n" +
                "                                              \n" +
                "    public static void main(String[] args) {  \n" +
                "        add('A','B');                     \n" +
                "    }                                         \n" +
                "}                                             "),"A. int int","B. char int ","C. Error","D. None of the above",'B'));
        al.add(new Questions(("public class Methods {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        byte a=127;\n" +
                "        System.out.print(a++);\n" +
                "    }\n" +
                "}\n"),"A. 127","B. -128","C. -127","D. None of the above",'A'));
        al.add(new Questions(("public class Methods {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        byte a=5;\n" +
                "        byte b=5;\n" +
                "        byte c=a+b;\n" +
                "        System.out.print(c);\n" +
                "        \n" +
                "    }\n" +
                "}\n"),"A. 10","B. Compile time error","C. 0","D. Runtime Error",'B'));
        al.add(new Questions(("Guess the output?" +
                "Sample inputs are a=5,s1=\"java \" \n"+
                "import java.util.*;\n" +
                "public class Methods {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        Scanner s=new Scanner(System.in);\n" +
                "        System.out.print(\"Enter a value: \");\n" +
                "        int a=s.nextInt();\n" +
                "        System.out.print(\"Enter s1 value: \");\n" +
                "        String s1=s.nextLine();\n" +
                "        System.out.println(a);\n" +
                "        System.out.println(s1);\n" +
                "        \n" +
                "        \n" +
                "    }\n" +
                "}\n"),"A. The program will correctly read both inputs and print them.","B. The program will throw an exception at runtime.","C. The program will throw an exception at compile time.","D. None of the above",'B'));
        al.add(new Questions(("public class Methods {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int a=045;\n" +
                "        System.out.print(a);\n" +
                "        \n" +
                "    }\n" +
                "}\n"),"A. 045","B. 45","C. 37","D. 037",'C'));
        al.add(new Questions(("Where s3 is Stored?\n" +
                "public class Methods {\n" +
                "    public static void main(String[] args) {\n" +
                "        String s1=\"Manju\";\n" +
                "        String s2=new String(\"Poojari\");\n" +
                "        String s3=s1+s2\n" +
                "        System.out.print(s3);\n" +
                "    }\n" +
                "}\n"),"A. Stack Memory","B. Heap Memory","C. String Constant Pool","D. Method Area",'B'));

        int score=0;
        System.out.println("Java Quiz");
        for(int i=0;i<al.size();i++){
            Questions q=al.get(i);
            System.out.println((i+1)+" "+q.question);
            System.out.println(q.A);
            System.out.println(q.B);
            System.out.println(q.C);
            System.out.println(q.D);
            System.out.print("Your answer :");
            char c=Character.toUpperCase(sc.next().charAt(0));
            if(q.ans==c){
                System.out.println("Correct!");
                System.out.println("-------------------------------------------------------------");
                score++;
            }else{
                System.out.println("Wrong!");
            }
        }
        System.out.println("-----------------------------Quiz Over----------------------------");
        System.out.println(score+" out of "+al.size());


    }
}
