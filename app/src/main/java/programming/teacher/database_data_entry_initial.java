package programming.teacher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.pushpika.pt.R;

public class database_data_entry_initial extends Activity {

    DatabaseHelper mydb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_database_data_entry_initial);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        btn = (Button) findViewById(R.id.go_firstpage);
        btn.setVisibility(View.GONE);
        mydb = new DatabaseHelper(this);
        insertData_tags();
        insertData_Question();
        insertData_tag_ques_assist();

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void go_first_page(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void insertData_tag_ques_assist() {
        //P
        mydb.insert_tag_que_assist(1,142);
        mydb.insert_tag_que_assist(1,143);
        mydb.insert_tag_que_assist(1,144);
        mydb.insert_tag_que_assist(1,145);
        mydb.insert_tag_que_assist(1,146);
        mydb.insert_tag_que_assist(1,147);

        //A
        mydb.insert_tag_que_assist(2,1);
        mydb.insert_tag_que_assist(2,2);
        mydb.insert_tag_que_assist(2,3);
        mydb.insert_tag_que_assist(2,4);
        mydb.insert_tag_que_assist(2,5);

        //T
        mydb.insert_tag_que_assist(3,187);
        mydb.insert_tag_que_assist(3,188);
        mydb.insert_tag_que_assist(3,189);
        mydb.insert_tag_que_assist(3,190);
        mydb.insert_tag_que_assist(3,191);
        mydb.insert_tag_que_assist(3,192);
        mydb.insert_tag_que_assist(3,193);
        mydb.insert_tag_que_assist(3,194);
        mydb.insert_tag_que_assist(3,195);
        mydb.insert_tag_que_assist(3,196);

        //U
        mydb.insert_tag_que_assist(4,197);
        mydb.insert_tag_que_assist(4,198);
        mydb.insert_tag_que_assist(4,199);
        mydb.insert_tag_que_assist(4,200);
        mydb.insert_tag_que_assist(4,201);
        mydb.insert_tag_que_assist(4,202);
        mydb.insert_tag_que_assist(4,203);
        mydb.insert_tag_que_assist(4,204);
        mydb.insert_tag_que_assist(4,205);
        mydb.insert_tag_que_assist(4,206);
        mydb.insert_tag_que_assist(4,207);

        //Q
        mydb.insert_tag_que_assist(5,148);
        mydb.insert_tag_que_assist(5,149);
        mydb.insert_tag_que_assist(5,150);
        mydb.insert_tag_que_assist(5,151);
        mydb.insert_tag_que_assist(5,152);
        mydb.insert_tag_que_assist(5,153);
        mydb.insert_tag_que_assist(5,154);
        mydb.insert_tag_que_assist(5,155);
        mydb.insert_tag_que_assist(5,156);
        mydb.insert_tag_que_assist(5,157);
        mydb.insert_tag_que_assist(5,158);
        mydb.insert_tag_que_assist(5,159);
        mydb.insert_tag_que_assist(5,160);

        //R
        mydb.insert_tag_que_assist(6,161);
        mydb.insert_tag_que_assist(6,162);
        mydb.insert_tag_que_assist(6,163);
        mydb.insert_tag_que_assist(6,164);
        mydb.insert_tag_que_assist(6,165);
        mydb.insert_tag_que_assist(6,166);
        mydb.insert_tag_que_assist(6,167);
        mydb.insert_tag_que_assist(6,168);
        mydb.insert_tag_que_assist(6,169);
        mydb.insert_tag_que_assist(6,170);
        mydb.insert_tag_que_assist(6,171);
        mydb.insert_tag_que_assist(6,172);
        mydb.insert_tag_que_assist(6,173);
        mydb.insert_tag_que_assist(6,174);
        mydb.insert_tag_que_assist(6,175);
        mydb.insert_tag_que_assist(6,176);

        //B
        mydb.insert_tag_que_assist(7,6);
        mydb.insert_tag_que_assist(7,7);
        mydb.insert_tag_que_assist(7,8);
        mydb.insert_tag_que_assist(7,9);
        mydb.insert_tag_que_assist(7,10);
        //C
        mydb.insert_tag_que_assist(8,6);
        mydb.insert_tag_que_assist(8,10);
        mydb.insert_tag_que_assist(8,11);
        mydb.insert_tag_que_assist(8,12);
        mydb.insert_tag_que_assist(8,13);
        mydb.insert_tag_que_assist(8,14);
        mydb.insert_tag_que_assist(8,15);
        mydb.insert_tag_que_assist(8,16);

        //D
        mydb.insert_tag_que_assist(9,17);
        mydb.insert_tag_que_assist(9,18);
        mydb.insert_tag_que_assist(9,19);
        mydb.insert_tag_que_assist(9,20);
        mydb.insert_tag_que_assist(9,21);
        mydb.insert_tag_que_assist(9,22);
        mydb.insert_tag_que_assist(9,23);
        mydb.insert_tag_que_assist(9,24);
        mydb.insert_tag_que_assist(9,25);
        mydb.insert_tag_que_assist(9,26);

        //E
        mydb.insert_tag_que_assist(10,27);
        mydb.insert_tag_que_assist(10,28);
        mydb.insert_tag_que_assist(10,29);
        mydb.insert_tag_que_assist(10,30);
        mydb.insert_tag_que_assist(10,31);
        mydb.insert_tag_que_assist(10,32);
        mydb.insert_tag_que_assist(10,33);
        mydb.insert_tag_que_assist(10,34);

        //F
        mydb.insert_tag_que_assist(11,35);
        mydb.insert_tag_que_assist(11,36);
        mydb.insert_tag_que_assist(11,37);
        mydb.insert_tag_que_assist(11,38);
        mydb.insert_tag_que_assist(11,39);
        mydb.insert_tag_que_assist(11,40);
        mydb.insert_tag_que_assist(11,41);
        mydb.insert_tag_que_assist(11,42);
        mydb.insert_tag_que_assist(11,43);

        //G
        mydb.insert_tag_que_assist(12,44);
        mydb.insert_tag_que_assist(12,45);
        mydb.insert_tag_que_assist(12,46);
        mydb.insert_tag_que_assist(12,47);
        mydb.insert_tag_que_assist(12,48);
        mydb.insert_tag_que_assist(12,49);
        mydb.insert_tag_que_assist(12,50);
        mydb.insert_tag_que_assist(12,51);
        mydb.insert_tag_que_assist(12,52);

        //H
        mydb.insert_tag_que_assist(13,53);
        mydb.insert_tag_que_assist(13,54);
        mydb.insert_tag_que_assist(13,55);
        mydb.insert_tag_que_assist(13,56);
        mydb.insert_tag_que_assist(13,57);
        mydb.insert_tag_que_assist(13,58);

        //I
        mydb.insert_tag_que_assist(14,59);
        mydb.insert_tag_que_assist(14,60);
        mydb.insert_tag_que_assist(14,61);
        mydb.insert_tag_que_assist(14,62);
        mydb.insert_tag_que_assist(14,63);
        mydb.insert_tag_que_assist(14,64);
        mydb.insert_tag_que_assist(14,65);
        mydb.insert_tag_que_assist(14,66);

        //J
        mydb.insert_tag_que_assist(15,67);
        mydb.insert_tag_que_assist(15,68);
        mydb.insert_tag_que_assist(15,69);
        mydb.insert_tag_que_assist(15,70);
        mydb.insert_tag_que_assist(15,71);
        mydb.insert_tag_que_assist(15,72);
        mydb.insert_tag_que_assist(15,73);
        mydb.insert_tag_que_assist(15,74);
        mydb.insert_tag_que_assist(15,75);

        //K
        mydb.insert_tag_que_assist(16,76);
        mydb.insert_tag_que_assist(16,77);
        mydb.insert_tag_que_assist(16,78);
        mydb.insert_tag_que_assist(16,79);
        mydb.insert_tag_que_assist(16,80);
        mydb.insert_tag_que_assist(16,81);
        mydb.insert_tag_que_assist(16,82);
        mydb.insert_tag_que_assist(16,83);
        mydb.insert_tag_que_assist(16,84);
        mydb.insert_tag_que_assist(16,85);
        mydb.insert_tag_que_assist(16,86);
        mydb.insert_tag_que_assist(16,87);
        mydb.insert_tag_que_assist(16,88);
        mydb.insert_tag_que_assist(16,89);
        mydb.insert_tag_que_assist(16,90);

        //L
        mydb.insert_tag_que_assist(17,91);
        mydb.insert_tag_que_assist(17,92);
        mydb.insert_tag_que_assist(17,93);
        mydb.insert_tag_que_assist(17,94);
        mydb.insert_tag_que_assist(17,95);
        mydb.insert_tag_que_assist(17,96);
        mydb.insert_tag_que_assist(17,97);
        mydb.insert_tag_que_assist(17,98);
        mydb.insert_tag_que_assist(17,99);


        //M
        mydb.insert_tag_que_assist(18,100);
        mydb.insert_tag_que_assist(18,101);
        mydb.insert_tag_que_assist(18,102);
        mydb.insert_tag_que_assist(18,103);
        mydb.insert_tag_que_assist(18,104);
        mydb.insert_tag_que_assist(18,105);
        mydb.insert_tag_que_assist(18,106);
        mydb.insert_tag_que_assist(18,107);
        mydb.insert_tag_que_assist(18,108);
        mydb.insert_tag_que_assist(18,109);
        mydb.insert_tag_que_assist(18,110);
        mydb.insert_tag_que_assist(18,111);
        mydb.insert_tag_que_assist(18,112);
        mydb.insert_tag_que_assist(18,113);
        mydb.insert_tag_que_assist(18,114);

        //N
        mydb.insert_tag_que_assist(19,115);
        mydb.insert_tag_que_assist(19,116);
        mydb.insert_tag_que_assist(19,117);
        mydb.insert_tag_que_assist(19,118);
        mydb.insert_tag_que_assist(19,119);
        mydb.insert_tag_que_assist(19,120);
        mydb.insert_tag_que_assist(19,121);
        mydb.insert_tag_que_assist(19,122);
        mydb.insert_tag_que_assist(19,123);
        mydb.insert_tag_que_assist(19,124);
        mydb.insert_tag_que_assist(19,125);
        mydb.insert_tag_que_assist(19,126);
        mydb.insert_tag_que_assist(19,127);
        mydb.insert_tag_que_assist(19,128);
        mydb.insert_tag_que_assist(19,129);


        //O
        mydb.insert_tag_que_assist(21,130);
        mydb.insert_tag_que_assist(21,131);
        mydb.insert_tag_que_assist(21,132);
        mydb.insert_tag_que_assist(21,133);
        mydb.insert_tag_que_assist(21,134);
        mydb.insert_tag_que_assist(21,135);
        mydb.insert_tag_que_assist(21,136);
        mydb.insert_tag_que_assist(21,137);
        mydb.insert_tag_que_assist(21,138);
        mydb.insert_tag_que_assist(21,139);
        mydb.insert_tag_que_assist(21,140);
        mydb.insert_tag_que_assist(21,141);


        //S
        mydb.insert_tag_que_assist(20,177);
        mydb.insert_tag_que_assist(20,178);
        mydb.insert_tag_que_assist(20,179);
        mydb.insert_tag_que_assist(20,180);
        mydb.insert_tag_que_assist(20,181);
        mydb.insert_tag_que_assist(20,182);
        mydb.insert_tag_que_assist(20,183);
        mydb.insert_tag_que_assist(20,184);
        mydb.insert_tag_que_assist(20,185);
        mydb.insert_tag_que_assist(20,186);






//        -----------------------------
        //after all data stored
        btn.setVisibility(View.VISIBLE);
    }


    public void insertData_Question() {
        //(String question_topic,String question_desc,
        // String question_class,String answer_sequence,String start_node,String promotion_node, String punishment_node, String promotion_class, String punishment_class){
//        Q1
        mydb.insert_Question(
                "1-Increase value",
                "Increase your score by 2 only using myScore variable and + operator.Then print it",
                "P","145,147,145,144,143,145,146","1","3","1","A","P"
        );
//        Q2
        mydb.insert_Question(
                "2-Swap ",
                "SWAP two values , x=10 and y=20 using temp variable",
                "A","5,2,1,3,4","3","5","3","T", "A"
        );
//        Q3
        mydb.insert_Question(
                "3-Pass by value",
                "Using divide function, increase your score to 6.",
                "T","189,193,191,193,196,187,195,192,192,194","5","6","5","U","T"
        );
//        Q4
        mydb.insert_Question(
                "4-Pass by reference",
                "Using add function, increase your score to 7.\n function add(a,b){\n\treturn a+b;\n}\n You can use myScore parameter without declaring.\nSet your score to n using setMyScore(n).",
                "U","201,198,197,199,204,200,207,200,206,201,202,202,199","6","7","5","Q","T"
        );
//        Q5
        mydb.insert_Question(
                "5-Modular problem",
                "Write a function to return modular value and run it on main function to increase your score by 3 and print it\n * You should find a suitable divisor for this",
                "Q","153,152,157,160,150,157,148,155,153,159,156,154,152,149,151,158,156,151","7","10","5","R","T");
//        Q6
        mydb.insert_Question(
                "6-Recursive function",
                "Write a recursive program to implement power function which returns a^b when pass parameters as a and b.",
                "R","164,171,175,165,170,174,165,161,176,163,169,165,161,167,171,168,163","10","12","7","B","Q");
//        Q7
        mydb.insert_Question(
                "7-If-Else and isPrime() ",
                "Check whether your score is prime or not",
                "B", "10,9,8,6,7", "12", "14", "12", "C", "B"
        );
//        Q8
        mydb.insert_Question(
                "8-If-Elseif-else ",
                "Use if-elseif and else conditions to put numbers into the correct categories.",
                "C", "10,16,15,11,14,12,6,13", "14", "17", "12", "D", "B"
        );
//        Q9
        mydb.insert_Question(
                "9-Switch ",
                "Print month name when month number entered,if that month number is less than 4,print month name as an output",
                "D", "20,18,23,19,17,22,25,17,24,26,17,21,17", "17", "22", "14", "E", "C"
        );
//        Q10
        mydb.insert_Question(
                "10-for loop ",
                "Print even numbers up to your score using for loop",
                "E", "30,34,27,29,33,28,32", "22", "25", "22", "F", "E"
        );
//        Q11
        mydb.insert_Question(
                "11-for-each ",
                "Get the sum of this array using for-each loop",
                "F", "41,39,35,43,37", "25", "31", "22", "G", "E"
        );
//        Q12
        mydb.insert_Question(
                "12-do-while ",
                "Print numbers 10 to 0 using do while loop",
                "G", "47,48,44,46,45,52", "31", "35", "31", "H", "G"
        );
//        Q13
        mydb.insert_Question(
                "13-while-do ",
                "Print Fibonacci Series using while loop until your score",
                "H", "58,53,56,54,57,55", "35", "39", "31", "I", "G"
        );
//        Q14
        mydb.insert_Question(
                "14-Break statement ",
                "Print the 'Algo' word fragment from 'Algorithm' word using break statement",
                "I", "65,60,64,59,61,66,62", "39", "42", "39", "J", "I"
        );
//        Q15
        mydb.insert_Question(
                "15-Continue statement ",
                "Print 'gain' word from 'grain' ",
                "J", "72,74,71,67,75,69,73", "42","45","39","K","I");
//        Q16
        mydb.insert_Question(
                "16-Nested for loop",
                "Print prime number up to your position",
                "K","82,81,87,80,83,81,85,76,89,77,79,86,77,88,90","45","57","45","L","K");
//        Q17
        mydb.insert_Question(
                "17-pattern ",
                "Print below pattern.\n1111\n" +"1     1\n"+"1     1\n"+"1     1\n" +"1111",
                "L","94,93,94,98,92,97,99,91,95,96","57","67","57","M","L");
//        Q18
        mydb.insert_Question(
                "18-Palindrome number",
                "Implement an algorithm for check input (number) is palindrome or not.",
                "M","106,110,112,100,105,101,109,102,107,103,108,111","67","82","57","N","L");
//        Q19
        mydb.insert_Question(
                "19-Sentence Capitalizing",
                "Write a program that accepts sequence of lines as input and prints the lines after making all characters in the sentence capitalized.",
                "N","120,127,124,129,115,119,116,123,125,121,118,128,126,122","82","87","82","S","N");
//        Q20
        mydb.insert_Question(
                "20-OOP concepts",
                "Consider following class.\n class Car{\n\tString color;\n\tfloat speed;\n\tvoid setColor(color);\n\tvoid setSpeed(color);\n\tvoid getSpeed();\n}\nCreate a car object and name it myCar.\nSet it's color to red.\nPrint the color of the car you created.",
                "S","181,177,183,185,181,178,186,177,184,183,179,186,182,177,180,178,186","87","93","82","O","N");
//        Q21
        mydb.insert_Question(
                "21-Bubble sort",
                "Implement the bubble sort algorithm",
                "O","139,133,138,134,141,134,140,132,136,135,130","93","100","87","V","S");

    }

    //
    public void insertData_tags(){

        //keyword is used for mainly use variables

        //question 01 class - A
        mydb.insert_Tag("x=y;\n","MAIN","None"); //id=1
        mydb.insert_Tag("temp=x;\n","MAIN","None"); //id=2
        mydb.insert_Tag("y=temp;\n","MAIN","None"); //id=3
        mydb.insert_Tag("print(x,y)\n","VARIABLE","None"); //id=4
        mydb.insert_Tag("x=10;y=20;\n","VARIABLE","None"); //id=5

        //question 02 class - B
        mydb.insert_Tag("else\n","MAIN","None"); //id=6
        mydb.insert_Tag(" return false\n","VARIABLE","None"); //id=7
        mydb.insert_Tag(" return true\n","VARIABLE","None"); //id=8
        mydb.insert_Tag("(isPrime(myScore))\n","MAIN","None"); //id=9
        mydb.insert_Tag("if","MAIN","None");//id=10

        //question 03 class - C
        //mydb.insert_Tag("if","MAIN","None"); //id=10
        //mydb.insert_Tag("else","MAIN","None"); //id=6

        mydb.insert_Tag("Elseif","MAIN","None"); //id=11
        mydb.insert_Tag(" print(\"x is less than 20\");\n","VARIABLE","None"); //id=12
        mydb.insert_Tag(" print(\"x>20 or x=20\");\n","VARIABLE","None"); //id=13
        mydb.insert_Tag("(x<20)\n","VARIABLE","None"); //id=14
        mydb.insert_Tag(" print(\"x is less than 10\");\n","VARIABLE","None"); //id=15
        mydb.insert_Tag("(x<10)\n","VARIABLE","None"); //id=16


        //question 04 class - D

        mydb.insert_Tag("break\n","MAIN","None");//id=17
        mydb.insert_Tag("(month)\n","VARIABLE","None");//id=18
        mydb.insert_Tag("print('January')\n","VARIABLE","None");//id=19
        mydb.insert_Tag("switch","MAIN","None"); //id=20
        mydb.insert_Tag("default:","MAIN","None");//id=21
        mydb.insert_Tag("case 2:","MAIN","None");//id=22
        mydb.insert_Tag("case 1:","MAIN","None");//id=23
        mydb.insert_Tag("case 3:","MAIN","None");//id=24
        mydb.insert_Tag("print('February')\n","VARIABLE","None"); //id=25
        mydb.insert_Tag("print('March')\n","VARIABLE","None"); //id=26


        //question 05 class - E


        mydb.insert_Tag("i<=myScore;","VARIABLE","None"); //id =27
        mydb.insert_Tag("i%2== 0) \n","VARIABLE","None"); //id=28
        mydb.insert_Tag("i++) { \n","MAIN","None");  //id=29
        mydb.insert_Tag("for ( ","MAIN","None"); //id=30
        mydb.insert_Tag("i>=myScore;","VARIABLE","None"); //id =31
        mydb.insert_Tag("print(i); }\n","VARIABLE","None"); //id=32
        mydb.insert_Tag("if( ","MAIN","None"); //id=33
        mydb.insert_Tag("i=0; ","VARIABLE","None");//id=34

        //question 06 class - F


        mydb.insert_Tag(" item in data ) { \n","VARIABLE","None");//id=35
        mydb.insert_Tag("sum=+data; }\n","VARIABLE","None");//id=36
        mydb.insert_Tag("print(sum); \n","VARIABLE","None");//id=37
        mydb.insert_Tag("print(item) \n","VARIABLE","None");//id=38
        mydb.insert_Tag("for-each( ","MAIN","None");//id=39
        mydb.insert_Tag("sum =+item; } \n","VARIABLE","None");//id=40
        mydb.insert_Tag("data =[20,30,40,50,60]; sum=0; \n","VARIABLE","None");//id=41
        mydb.insert_Tag(" data in item ) { \n","VARIABLE","None");//id=42
        mydb.insert_Tag("sum = sum+item; }\n","VARIABLE","None");//id=43

        //41,39,35,43,37

        //question 07 class - G

        mydb.insert_Tag("print(x); \n","VARIABLE","None"); //id= 44
        mydb.insert_Tag("} while ","MAIN","None"); //id= 45
        mydb.insert_Tag("x = x-1; \n","VARIABLE","None"); //id=46
        mydb.insert_Tag("x = 10; \n","VARIABLE","None"); //id= 47
        mydb.insert_Tag("do{ \n","MAIN","None"); //id= 48
        mydb.insert_Tag("(x < 0); \n","VARIABLE","None"); //id= 49
        mydb.insert_Tag("x = x+1; \n","VARIABLE","None"); //id= 50
        mydb.insert_Tag("x = 9; \n","VARIABLE","None"); //id= 51
        mydb.insert_Tag("(x >= 0); \n","VARIABLE","None"); //id= 52

        //question 08 class - H

        mydb.insert_Tag("while (a<=myScore) \n","MAIN","None");//id=53
        mydb.insert_Tag("temp =b; \n","VARIABLE","None");//id=54
        mydb.insert_Tag("a = temp; \n","VARIABLE","None");//id=55
        mydb.insert_Tag("print(a); \n","VARIABLE","None");//id=56
        mydb.insert_Tag("b =a+b; \n","VARIABLE","None");//id=57
        mydb.insert_Tag("a=0;b=1; \n","VARIABLE","None");//id=58




        //question 09 class - I

        mydb.insert_Tag("letter == ","VARIABLE","None");//id=59
        mydb.insert_Tag("letter in 'ALGORITHM' )\n","VARIABLE","None");//id=60
        mydb.insert_Tag(" r ) \n","VARIABLE","None");//id=61
        mydb.insert_Tag("print(letter); \n","VARIABLE","None");//id=62
        mydb.insert_Tag(" for( \n","MAIN","None");//id=63
        mydb.insert_Tag("if (","MAIN","None");//id=64
        mydb.insert_Tag("for-each( ","MAIN","None");//id=65
        mydb.insert_Tag("break; \n","MAIN","None");//id=66
        //65 60 64 59 61 66 62

        //question 10 class - J

        mydb.insert_Tag(" letter == ","VARIABLE","None");//id=67
        mydb.insert_Tag(" 'i' ) \n","VARIABLE","None");//id=68
        mydb.insert_Tag(" continue; \n","MAIN","None");//id=69
        mydb.insert_Tag(" 'a') \n","VARIABLE","None");//id=70
        mydb.insert_Tag("if ( ","MAIN","None");//id=71
        mydb.insert_Tag("for-each ( ","MAIN","None");//id=72
        mydb.insert_Tag(" print(letter) \n","VARIABLE","None");//id=73
        mydb.insert_Tag("letter in 'grain' )\n","VARIABLE","None");//id=74
        mydb.insert_Tag(" 'r') \n","VARIABLE","None");//id=75

        //72 74 71 67 75 69 73

        //question 11 class - k

        mydb.insert_Tag("j <= i/j;","VARIABLE","None");//id= 76
        mydb.insert_Tag("if","MAIN","None");//id= 77
        mydb.insert_Tag("i--){ \n","VARIABLE","None");//id= 78
        mydb.insert_Tag("(!(i % j)){ \n","VARIABLE","None");//id= 79
        mydb.insert_Tag("i <= end;","VARIABLE","None");//id= 80
        mydb.insert_Tag("for(","MAIN","None");//id= 81
        mydb.insert_Tag("start = 2; end = myScore; \n","VARIABLE","None");//id= 82
        mydb.insert_Tag("i++){ \n","VARIABLE","None");//id= 83
        mydb.insert_Tag("start = myScore; end =2; \n","VARIABLE","None");//id= 84
        mydb.insert_Tag("j = start;","VARIABLE","None");//id= 85
        mydb.insert_Tag("break;}} \n","VARIABLE","None");//id= 86
        mydb.insert_Tag("i = start;","VARIABLE","None");//id= 87
        mydb.insert_Tag("(j>(i/j)){ \n","VARIABLE","None");//id= 88
        mydb.insert_Tag("j++){ \n","VARIABLE","None");//id= 89
        mydb.insert_Tag("print(i);} } \n","MAIN","None");//id= 90

        // 82,81,87,80,83,81,85,76,89,77,79,86,77,88,90



        //question 12 class - L

        mydb.insert_Tag("else {\n","MAIN","None"); //id=91
        mydb.insert_Tag("if","MAIN","None"); //id=92
        mydb.insert_Tag("(i=1;i<=5;i++) { \n","VARIABLE","None"); //id=93
        mydb.insert_Tag("for","MAIN","None"); //id=94
//        mydb.insert_Tag("for","MAIN","None"); //id=94
        mydb.insert_Tag("print(' '); }\n","VARIABLE","None"); //id=95
        mydb.insert_Tag("} println(); } \n","VARIABLE","None"); //id=96
        mydb.insert_Tag("(j==4 || j==1 || i==1 || i==5){ \n","VARIABLE","None"); //id=97
        mydb.insert_Tag("(j=1;j<=4;j++){ \n","VARIABLE","None"); //id=98
        mydb.insert_Tag("print(1); }\n","VARIABLE","None"); //id=99

        //94 93 94 98 92 97 99 91 95 96

        //question 13 class - M

        mydb.insert_Tag("(a > 0){ \n","VARIABLE","None");//id=100
        mydb.insert_Tag("s = s + (a % 10); \n","VARIABLE","None");//id=101
        mydb.insert_Tag("}if","MAIN","None");//id=102
        mydb.insert_Tag("print('Palindrome'); \n","VARIABLE","None");//id=103
        mydb.insert_Tag("t = a;s = len(a) \n","VARIABLE","None");//id=104
        mydb.insert_Tag("s = s * 10; \n","VARIABLE","None");//id=105
        mydb.insert_Tag("a = input(); \n","VARIABLE","None");//id=106
        mydb.insert_Tag("(t == s){ \n","VARIABLE","None");//id=107
        mydb.insert_Tag("}else{ \n","MAIN","None");//id=108
        mydb.insert_Tag("a = a / 10; \n","VARIABLE","None");//id=109
        mydb.insert_Tag("s = 0;t = a; \n","MAIN","None");//id=110
        mydb.insert_Tag("print('Not a palindrome');} \n","VARIABLE","None");//id=111
        mydb.insert_Tag("while","MAIN","None");//id=112
        mydb.insert_Tag("(t == a){ \n","VARIABLE","None");//id=113
        mydb.insert_Tag("(a > 9){ \n","VARIABLE","None");//id=114

        //106,110,112,100,105,101,109,102,107,103,108,111


        //question 14 class - N

        mydb.insert_Tag("if","VARIABLE","None");//id=115
        mydb.insert_Tag("array.","VARIABLE","None");//id=116
        mydb.insert_Tag("(s); \n","VARIABLE","None");//id=117
        mydb.insert_Tag("break; \n","MAIN","None");//id=118
        mydb.insert_Tag("(s): \n","VARIABLE","None");//id=119
        mydb.insert_Tag("array = []; \n","MAIN","None");//id=120
        mydb.insert_Tag("else: \n","MAIN","None");//id=121
        mydb.insert_Tag("print(sentence); \n","VARIABLE","None");//id=122
        mydb.insert_Tag("append","MAIN","None");//id=123
        mydb.insert_Tag("True: \n","VARIABLE","None");//id=124
        mydb.insert_Tag("(s.upper()); \n","VARIABLE","None");//id=125
        mydb.insert_Tag("sentence in array: \n","VARIABLE","None");//id=126
        mydb.insert_Tag("while","MAIN","None");//id=127
        mydb.insert_Tag("for","MAIN","None");//id=128
        mydb.insert_Tag("s = input(); \n","MAIN","None");//id=129

        //120,127,124,129,115,119,116,123,125,121,118,128,126,122

        //question 15 class - O


        mydb.insert_Tag("(j,j+1); \n","VARIABLE","None");//id=130
        mydb.insert_Tag("(j=0;j<=array.length-1;j++): \n","VARIABLE","None");//id=131
        mydb.insert_Tag("if","VARIABLE","None");//id=132
        mydb.insert_Tag("bubble_sort","MAIN","None");//id=133
        mydb.insert_Tag("for","MAIN","None");//id=134
        mydb.insert_Tag("swap","MAIN","None");//id=135
        mydb.insert_Tag("(array[j]>array[j+1]) \n","VARIABLE","None");//id=136
        mydb.insert_Tag("(i,i+1); \n","VARIABLE","None");//id=137
        mydb.insert_Tag("(array): \n","MAIN","None");//id=138
        mydb.insert_Tag("function","MAIN","None");//id=139
        mydb.insert_Tag("(j=0;j<=array.length-1-i;j++): \n","VARIABLE","None");//id=140
        mydb.insert_Tag("(i=0;i<=array.length;i++): \n","VARIABLE","None");//id=141



        //139,133,138,134,141,134,140,132,136,135,130

        //--------------------

        //question 16 class - p

        mydb.insert_Tag("-2;\n","VARIABLE","None");//id=142
        mydb.insert_Tag("print(","MAIN","None");//id=143
        mydb.insert_Tag("+2;\n","VARIABLE","None");//id=144
        mydb.insert_Tag("myScore","MAIN","None");//id=145
        mydb.insert_Tag(");\n","VARIABLE","None");//id=146
        mydb.insert_Tag("=","VARIABLE","None");//id=147

        //145,147,145,144,143,145,146



        //question 17 class - q

        mydb.insert_Tag("modulo","MAIN","None");//id=148
        mydb.insert_Tag("myScore","MAIN","None");//id=149
        mydb.insert_Tag("return","VARIABLE","None");//id=150
        mydb.insert_Tag(");\n","VARIABLE","None");//id=151
        mydb.insert_Tag("getModular(","MAIN","None");//id=152
        mydb.insert_Tag("function","MAIN","None");//id=153
        mydb.insert_Tag("=","VARIABLE","None");//id=154
        mydb.insert_Tag("4;\n","VARIABLE","None");//id=155
        mydb.insert_Tag("value","VARIABLE","None");//id=156
        mydb.insert_Tag("a","VARIABLE","None");//id=157
        mydb.insert_Tag("print(","VARIABLE","None");//id=158
        mydb.insert_Tag("main():\n","VARIABLE","None");//id=159
        mydb.insert_Tag("):\n","VARIABLE","None");//id=160

        //153,152,157,160,150,157,148,155,153,159,156,154,152,149,151,158,156,151


        //question 18 class - r


        mydb.insert_Tag("return","MAIN","None");//id=161
        mydb.insert_Tag("b /","VARIABLE","None");//id=162
        mydb.insert_Tag(";\n","VARIABLE","None");//id=163
        mydb.insert_Tag("function","MAIN","None");//id=164
        mydb.insert_Tag(":\n","VARIABLE","None");//id=165
        mydb.insert_Tag("(b==0)","VARIABLE","None");//id=166
        mydb.insert_Tag("a *","VARIABLE","None");//id=167
        mydb.insert_Tag("( a, b-1 )","VARIABLE","None");//id=168
        mydb.insert_Tag("else","MAIN","None");//id=169
        mydb.insert_Tag("if","MAIN","None");//id=170
        mydb.insert_Tag("powerFunc","MAIN","None");//id=171
        mydb.insert_Tag("b *","VARIABLE","None");//id=172
        mydb.insert_Tag("a /","VARIABLE","None");//id=173
        mydb.insert_Tag("(a==0)","VARIABLE","None");//id=174
        mydb.insert_Tag("(a,b)","VARIABLE","None");//id=175
        mydb.insert_Tag("1","VARIABLE","None");//id=176

        //164,171,175,165,170,174,165,161,176,163,169,165,161,167,171,168,163


        //question 19 class - s


        mydb.insert_Tag("myCar","MAIN","None");//id=177
        mydb.insert_Tag("()","VARIABLE","None");//id=178
        mydb.insert_Tag("Red","VARIABLE","None");//id=179
        mydb.insert_Tag(".getColor","MAIN","None");//id=180
        mydb.insert_Tag("Car","MAIN","None");//id=181
        mydb.insert_Tag("Print","VARIABLE","None");//id=182
        mydb.insert_Tag("=","VARIABLE","None");//id=183
        mydb.insert_Tag(".setColor","MAIN","None");//id=184
        mydb.insert_Tag("new","VARIABLE","None");//id=185
        mydb.insert_Tag(";\n","VARIABLE","None");//id=186


        //181,177,183,185,181,178,186,177,184,183,179,186,182,177,180,178,186

        //question 20 class - t

        mydb.insert_Tag(",","VARIABLE","None");//id=187
        mydb.insert_Tag("10","VARIABLE","None");//id=188
        mydb.insert_Tag("increase","MAIN","None");//id=189
        mydb.insert_Tag("5","VARIABLE","None");//id=190
        mydb.insert_Tag("divide","MAIN","None");//id=191
        mydb.insert_Tag(")","VARIABLE","None");//id=192
        mydb.insert_Tag("(","VARIABLE","None");//id=193
        mydb.insert_Tag(";","VARIABLE","None");//id=194
        mydb.insert_Tag("2","VARIABLE","None");//id=195
        mydb.insert_Tag("12","VARIABLE","None");//id=196


        //189,193,191,193,196,187,195,192,192,194

        //question 21 class - u

        mydb.insert_Tag("1","VARIABLE","None");//id=197
        mydb.insert_Tag("=","VARIABLE","None");//id=198
        mydb.insert_Tag(";\n","VARIABLE","None");//id=199
        mydb.insert_Tag("(","VARIABLE","None");//id=200
        mydb.insert_Tag("value","MAIN","None");//id=201
        mydb.insert_Tag(")","VARIABLE","None");//id=202
        mydb.insert_Tag("myScore + ","MAIN","None");//id=203
        mydb.insert_Tag("setMyScore","MAIN","None");//id=204
        mydb.insert_Tag(">","VARIABLE","None");//id=205
        mydb.insert_Tag("myScore , ","MAIN","None");//id=206
        mydb.insert_Tag("add","MAIN","None");//id=207




        //201,198,197,199,204,200,207,200,206,201,202,202,199

        //question 22 class - V

    }

}