package programming.teacher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.pushpika.pt.R;

public class database_data_entry_initial_new extends Activity {

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
        //A
        mydb.insert_tag_que_assist(1,1);
        mydb.insert_tag_que_assist(1,2);
        mydb.insert_tag_que_assist(1,3);

        //B
        mydb.insert_tag_que_assist(2,4);
        mydb.insert_tag_que_assist(2,5);
        mydb.insert_tag_que_assist(2,6);

        //C

        mydb.insert_tag_que_assist(3, 7);
        mydb.insert_tag_que_assist(3, 8);
        mydb.insert_tag_que_assist(3, 9);
        mydb.insert_tag_que_assist(3, 10);
        mydb.insert_tag_que_assist(3, 11);
        mydb.insert_tag_que_assist(3, 12);


        //D
        mydb.insert_tag_que_assist(4, 13);
        mydb.insert_tag_que_assist(4, 14);
        mydb.insert_tag_que_assist(4, 15);
        mydb.insert_tag_que_assist(4, 16);
        mydb.insert_tag_que_assist(4, 17);
        mydb.insert_tag_que_assist(4, 18);
        mydb.insert_tag_que_assist(4, 19);
        mydb.insert_tag_que_assist(4, 20);
        mydb.insert_tag_que_assist(4, 21);

        //E
        mydb.insert_tag_que_assist(5, 22);
        mydb.insert_tag_que_assist(5, 23);
        mydb.insert_tag_que_assist(5, 24);
        mydb.insert_tag_que_assist(5, 25);
        mydb.insert_tag_que_assist(5, 26);
        mydb.insert_tag_que_assist(5, 27);
        mydb.insert_tag_que_assist(5, 28);

        //F
        mydb.insert_tag_que_assist(6, 29);
        mydb.insert_tag_que_assist(6, 30);
        mydb.insert_tag_que_assist(6, 31);
        mydb.insert_tag_que_assist(6, 32);
        mydb.insert_tag_que_assist(6, 33);
        mydb.insert_tag_que_assist(6, 34);
        mydb.insert_tag_que_assist(6, 35);
        mydb.insert_tag_que_assist(6, 36);
        mydb.insert_tag_que_assist(6, 37);
        mydb.insert_tag_que_assist(6, 38);
        mydb.insert_tag_que_assist(6, 39);

        //G
        mydb.insert_tag_que_assist(7, 40);
        mydb.insert_tag_que_assist(7, 41);
        mydb.insert_tag_que_assist(7, 42);
        mydb.insert_tag_que_assist(7, 43);
        mydb.insert_tag_que_assist(7, 44);
        mydb.insert_tag_que_assist(7, 45);
        mydb.insert_tag_que_assist(7, 46);
        mydb.insert_tag_que_assist(7, 47);
        mydb.insert_tag_que_assist(7, 48);

        //H
        mydb.insert_tag_que_assist(8, 49);
        mydb.insert_tag_que_assist(8, 50);
        mydb.insert_tag_que_assist(8, 51);
        mydb.insert_tag_que_assist(8, 52);
        mydb.insert_tag_que_assist(8, 53);
        mydb.insert_tag_que_assist(8, 54);
        mydb.insert_tag_que_assist(8, 55);

        //I
        mydb.insert_tag_que_assist(9, 56);
        mydb.insert_tag_que_assist(9, 57);
        mydb.insert_tag_que_assist(9, 58);
        mydb.insert_tag_que_assist(9, 59);
        mydb.insert_tag_que_assist(9, 60);
        mydb.insert_tag_que_assist(9, 61);

        //J
        mydb.insert_tag_que_assist(10, 62);
        mydb.insert_tag_que_assist(10, 63);
        mydb.insert_tag_que_assist(10, 64);
        mydb.insert_tag_que_assist(10, 65);
        mydb.insert_tag_que_assist(10, 66);
        mydb.insert_tag_que_assist(10, 67);
        mydb.insert_tag_que_assist(10, 68);
        mydb.insert_tag_que_assist(10, 69);
        mydb.insert_tag_que_assist(10, 70);
        mydb.insert_tag_que_assist(10, 71);

        //K
        mydb.insert_tag_que_assist(11, 72);
        mydb.insert_tag_que_assist(11, 73);
        mydb.insert_tag_que_assist(11, 74);
        mydb.insert_tag_que_assist(11, 75);
        mydb.insert_tag_que_assist(11, 76);
        mydb.insert_tag_que_assist(11, 77);
        mydb.insert_tag_que_assist(11, 78);
        mydb.insert_tag_que_assist(11, 79);
        mydb.insert_tag_que_assist(11, 80);

        //L

//      after all data stored
        btn.setVisibility(View.VISIBLE);
    }


    public void insertData_Question() {
        /**question_topic,
         * question_desc,
         * question_class, answer_sequence, start_node, promotion_node, punishment_node, promotion_class, punishment_class*/

        /**Don't put spaces in answer sequence*/
        //Q1 - A
        mydb.insert_Question(
                "1-Goto function",
                "Using GOTO function increase your position to 3.",
                "A","1,3","1","9","1","B","A"
        );

        // Q2 - B
        mydb.insert_Question(
                "2-Goto function",
                "Using GO function increase your position to 5.",
                "B","4,5","9","10","9","C","B"
        );

        //Q3 -  C
        mydb.insert_Question(
                "3-Operators",
                "Use GO function to change your position to 4.",
                "C","7,11","10","12","9","D","B"
        );

        //Q4 - D
        mydb.insert_Question(
                "4-Variables",
                "Using predefined variable(s) increase your current position by 2.",
                "D","21,13,17","12","14","12","E","D"
        );

        //Q5 - E
        mydb.insert_Question(
                "5-Variables",
                "Use add operation and GO statement to increase your position by 3",
                "E","26,27,24,23,22","14","15","14","F","E"
        );

        //Q6  - F
        mydb.insert_Question(
                "6-Variables",
                "Goto next position(16) and come back to 15.(3 marks)",
                "F","30,29,36,29,34,37,38,39","15","18","15","G","F"
        );

        //Q7 - G
        mydb.insert_Question(
                "7-For loop",
                "Using for loop increase your position by 2",
                "G","41,47,44,45,46,40","18","20","18","H","G"
        );

        //Q8 - H
        mydb.insert_Question(
                "8-Arrays",
                "Using array indexing increase your position to 23. First declare an array.",
                "H","50,49,52,53,55","20","23","20","I","H"
        );

        //Q9 - I
        mydb.insert_Question(
                "9-Variables",
                "Using given global variables increment your position to 25.",
                "I","57,56,59,61","23","25","23","J","I"
        );

        //Q10 - J
        mydb.insert_Question(
                "10-Variables",
                "By changing variables increase your position to 28.",
                "J","64,66,69,63,69,68,71,62,63,62,67,69","25","28","25","K","J"
        );

        //Q11 - K
        mydb.insert_Question(
                "11-Variables",
                "Change variables and use them to change your position.",
                "K","76,75,79,72,73,72,78,74","28","30","28","L","K"
        );

    }
    public void insertData_tags(){
        //question 1 class - A
        mydb.insert_Tag("GOTO", "MAIN","None"); //id=1
        mydb.insert_Tag("(5)", "VARIABLE","None"); //id=2
        mydb.insert_Tag("(3)", "VARIABLE","None"); //id=3
        //answer - "1,3"

        //question 2 class - B
        mydb.insert_Tag("GO", "MAIN","None"); //id=4
        mydb.insert_Tag("(2_step_forward);", "VARIABLE","None"); //id=5
        mydb.insert_Tag("(3_step_forward);", "VARIABLE","None"); //id=6
        //answer - "4,5"

        //question 3 class - C
        mydb.insert_Tag( "GO", "MAIN","None"); //id=7
        mydb.insert_Tag( "(currentPosition - 1);" , "VARIABLE","None"); //id=8
        mydb.insert_Tag("(2_step_forward);", "VARIABLE","None"); //id=9
        mydb.insert_Tag( "(2_step_backward);" , "VARIABLE","None"); //id=10
        mydb.insert_Tag( "(1_step_backward);" , "VARIABLE","None"); //id=11
        mydb.insert_Tag("(4);" , "VARIABLE","None"); //id=12
        //answer - "7,11"

        //question 4 class - D
        mydb.insert_Tag("GO" , "MAIN","None"); //id=13
        mydb.insert_Tag("var1=1; \n", "VARIABLE","None"); //id=14
        mydb.insert_Tag("var2=2; \n", "VARIABLE","None"); //id=15
        mydb.insert_Tag("var3=3; \n", "VARIABLE","None"); //id=16
        mydb.insert_Tag("X_steps_forward", "MAIN","None"); //id=17
        mydb.insert_Tag("(2_steps_forward)", "VARIABLE","None"); //id=18
        mydb.insert_Tag("X=1", "VARIABLE","None"); //id=19
        mydb.insert_Tag("X=3", "VARIABLE","None"); //id=20
        mydb.insert_Tag("X=2", "VARIABLE","None"); //id=21
        //answer "21,13,17"

        //question 5 class - E
        mydb.insert_Tag("(Y_steps_forward);" , "MAIN","None"); //id=22
        mydb.insert_Tag("GO", "VARIABLE","None"); //id=23
        mydb.insert_Tag("A+B\n", "VARIABLE","None"); //id=24
        mydb.insert_Tag("(3_steps_forward)", "VARIABLE","None"); //id=25
        mydb.insert_Tag("A=2,B=1", "VARIABLE","None"); //id=26
        mydb.insert_Tag("Y = ", "VARIABLE","None"); //id=27
        mydb.insert_Tag("A=2,B=2\n", "VARIABLE","None"); //id=28
        //answer - "26,27,24,23,22"

        //question 6 class - F
        mydb.insert_Tag("current_position" , "MAIN","None"); //id=29
        mydb.insert_Tag("var1=1;\n", "MAIN","None"); //id=30
        mydb.insert_Tag("var2=2;\n", "MAIN","None"); //id=31
        mydb.insert_Tag("var3=3;\n", "MAIN","None"); //id=32
        mydb.insert_Tag("-", "VARIABLE","None"); //id=33
        mydb.insert_Tag("+", "VARIABLE","None"); //id=34
        mydb.insert_Tag("var3\n", "VARIABLE","None"); //id=35
        mydb.insert_Tag("=", "VARIABLE","None"); //id=36
        mydb.insert_Tag("var1\n", "VARIABLE","None"); //id=37
        mydb.insert_Tag("GOTO", "MAIN","None"); //id=38
        mydb.insert_Tag("(1_step_backword);\n", "VARIABLE","None"); //id=39
        //answer - 30,29,36,29,34,37,38,39

        //question 7 class - G
        mydb.insert_Tag("(1_setp_forward)", "MAIN","None"); //id=40
        mydb.insert_Tag("for (", "MAIN","None"); //id=41
        mydb.insert_Tag("foreach (", "MAIN","None"); //id=42
        mydb.insert_Tag("i=1;", "VARIABLE","None"); //id=43
        mydb.insert_Tag("i<=2;", "VARIABLE","None"); //id=44
        mydb.insert_Tag("i++)\n", "VARIABLE","None"); //id=45
        mydb.insert_Tag("\tGOTO", "VARIABLE","None"); //id=46
        mydb.insert_Tag("i=0;", "VARIABLE","None"); //id=47
        mydb.insert_Tag("var2", "VARIABLE","None"); //id=48
        //answer - "41, 47, 44, 45, 46, 40"

        //question 8 class - H
        mydb.insert_Tag("current_position", "MAIN","None"); //id=49
        mydb.insert_Tag("array = [1,2,3,5,20,23,25]\n", "MAIN","None"); //id=50
        mydb.insert_Tag("+", "VARIABLE","None"); //id=51
        mydb.insert_Tag("=", "VARIABLE","None"); //id=52
        mydb.insert_Tag("array", "VARIABLE","None"); //id=53
        mydb.insert_Tag("[6]", "VARIABLE","None"); //id=54
        mydb.insert_Tag("[5]", "VARIABLE","None"); //id=55
        //answer - "50,49,52,53,55"


        //question 9 class - I
        mydb.insert_Tag("current_position", "MAIN","None"); //id=56
        mydb.insert_Tag("global var = 2\n", "MAIN","None"); //id=57
        mydb.insert_Tag("+", "VARIABLE","None"); //id=58
        mydb.insert_Tag("+=", "VARIABLE","None"); //id=59
        mydb.insert_Tag("global var", "VARIABLE","None"); //id=60
        mydb.insert_Tag("var", "VARIABLE","None"); //id=61
        //answer - "57,56,59,61"

        //question 10 class - J
        mydb.insert_Tag("current_position", "MAIN","None"); //id=62
        mydb.insert_Tag("= /", "MAIN","None"); //id=63
        mydb.insert_Tag("X=5", "VARIABLE","None"); //id=64
        mydb.insert_Tag("Y=6", "VARIABLE","None"); //id=65
        mydb.insert_Tag("K=2", "VARIABLE","None"); //id=66
        mydb.insert_Tag("+", "VARIABLE","None"); //id=67
        mydb.insert_Tag("-", "VARIABLE","None"); //id=68
        mydb.insert_Tag("X", "VARIABLE","None"); //id=69
        mydb.insert_Tag("Y ", "VARIABLE","None"); //id=70
        mydb.insert_Tag("K", "VARIABLE","None"); //id=71
        //answer - "64, 66, 69, 63, 69, 68, 71, 62, 63, 62, 67, 69"


        //question 11 class - K
        mydb.insert_Tag("current_position", "MAIN","None"); //id=72
        mydb.insert_Tag("= /", "MAIN","None");     //id=73
        mydb.insert_Tag("(Y+X)", "MAIN","None"); //id=74
        mydb.insert_Tag("Y=2", "VARIABLE","None"); //id=75
        mydb.insert_Tag("X=1", "VARIABLE","None"); //id=76
        mydb.insert_Tag("K=5", "VARIABLE","None"); //id=77
        mydb.insert_Tag("+", "VARIABLE","None");   //id=78
        mydb.insert_Tag("Y=X", "VARIABLE","None"); //id=79
        mydb.insert_Tag("X=Y", "VARIABLE","None"); //id=80
        //answer- "76, 75, 79, 72, 73, 72, 78, 74"
    }
}
