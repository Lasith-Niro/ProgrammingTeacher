package programming.teacher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.pushpika.pt.R;

public class database_data_entry_initial_2 extends Activity {

    DatabaseHelper mydb;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_database_data_entry_initial_2);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        btn = (Button) findViewById(R.id.go_firstpage);
        btn.setVisibility(View.GONE);
        mydb = new DatabaseHelper(this);
        insertData_tags();
        insertData_Question();
        insertData_tag_ques_assist();
    }

    public void go_first_page(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void insertData_tag_ques_assist() {
        //P
        mydb.insert_tag_que_assist(1, 142);
        mydb.insert_tag_que_assist(1, 143);
        mydb.insert_tag_que_assist(1, 144);
        mydb.insert_tag_que_assist(1, 145);
        mydb.insert_tag_que_assist(1, 146);
        mydb.insert_tag_que_assist(1, 147);

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
    }

    public void insertData_tags() {


        //question 01 class - A
        mydb.insert_Tag("GOTO", "MAIN","None"); //id=1
        mydb.insert_Tag("(8)", "VARIABLE","None"); //id=2
        mydb.insert_Tag("(9)", "VARIABLE","None"); //id=3
        //answer - "1,3"

        //question 02 class - B
        mydb.insert_Tag("GOTO", "MAIN","None"); //id=4
        mydb.insert_Tag("(1_step_forward);", "VARIABLE","None"); //id=5
        //answer - "4,5"

        //question 03 class - C
        mydb.insert_Tag("current_position = current_position" , "MAIN","None"); //id=6
        mydb.insert_Tag( "+", "VARIABLE","None"); //id=7
        mydb.insert_Tag( "3" , "VARIABLE","None"); //id=8
        mydb.insert_Tag("GOTO", "VARIABLE","None"); //id=9
        mydb.insert_Tag( "12" , "VARIABLE","None"); //id=10
        mydb.insert_Tag( "5" , "VARIABLE","None"); //id=11
        mydb.insert_Tag("2" , "VARIABLE","None"); //id=12
        //answer - "6,7,12"

 //?????????????
        //question 04 class - D
        mydb.insert_Tag("current_position" , "MAIN","None"); //id=13
        mydb.insert_Tag("var1=1;", "MAIN","None"); //id=14
        mydb.insert_Tag("var2=2;", "MAIN","None"); //id=15
        mydb.insert_Tag("var3=3;", "MAIN","None"); //id=16
        mydb.insert_Tag("-", "VARIABLE","None"); //id=17
        mydb.insert_Tag("+", "VARIABLE","None"); //id=18
        mydb.insert_Tag("var3", "VARIABLE","None"); //id=19
        mydb.insert_Tag("=", "VARIABLE","None"); //id=20
        mydb.insert_Tag("var2", "VARIABLE","None"); //id=21


        //question 05 class - E
        mydb.insert_Tag("current_position" , "MAIN","None"); //id=22
        mydb.insert_Tag("--", "VARIABLE","None"); //id=23
        mydb.insert_Tag("*", "VARIABLE","None"); //id=24
        mydb.insert_Tag("var1", "VARIABLE","None"); //id=25
        mydb.insert_Tag("#", "VARIABLE","None"); //id=26
        mydb.insert_Tag("-", "VARIABLE","None"); //id=27
        mydb.insert_Tag("++", "VARIABLE","None"); //id=28
        //answer - "22,28"

//?????????????????
        //question 06 class - F
        mydb.insert_Tag("current_position" , "MAIN","None"); //id=29
        mydb.insert_Tag("var1=1;", "MAIN","None"); //id=30
        mydb.insert_Tag("var2=2;", "MAIN","None"); //id=31
        mydb.insert_Tag("var3=3;", "MAIN","None"); //id=32
        mydb.insert_Tag("-", "VARIABLE","None"); //id=33
        mydb.insert_Tag("+", "VARIABLE","None"); //id=34
        mydb.insert_Tag("var3", "VARIABLE","None"); //id=35
        mydb.insert_Tag("=", "VARIABLE","None"); //id=36
        mydb.insert_Tag("var2", "VARIABLE","None"); //id=37
        //answer - ""


        //question 07 class - G
        mydb.insert_Tag("(1_setp_forward)", "MAIN","None"); //id=38
        mydb.insert_Tag("for (", "MAIN","None"); //id=39
        mydb.insert_Tag("foreach (", "MAIN","None"); //id=40
        mydb.insert_Tag("i=1;", "VARIABLE","None"); //id=41
        mydb.insert_Tag("i<=2;", "VARIABLE","None"); //id=42
        mydb.insert_Tag("i++)\n", "VARIABLE","None"); //id=43
        mydb.insert_Tag("\tGoto", "VARIABLE","None"); //id=44
        mydb.insert_Tag("i=0;", "VARIABLE","None"); //id=45
        mydb.insert_Tag("var2", "VARIABLE","None"); //id=46
        //answer - "39,45,42,43,44,38"

        //question 08 class - H

        mydb.insert_Tag("current_position", "MAIN","None"); //id=47
        mydb.insert_Tag("array = [1,2,3,5,20,23,25]", "MAIN","None"); //id=48
        mydb.insert_Tag("+", "VARIABLE","None"); //id=49
        mydb.insert_Tag("=", "VARIABLE","None"); //id=50
        mydb.insert_Tag("array", "VARIABLE","None"); //id=51
        mydb.insert_Tag("[6]", "VARIABLE","None"); //id=52
        mydb.insert_Tag("[5]", "VARIABLE","None"); //id=53
        //answer - "47,50,51,53"

        //question 09 class - I
        mydb.insert_Tag("current_position", "MAIN","None"); //id=54
        mydb.insert_Tag("global var = 2/", "MAIN","None"); //id=55
        mydb.insert_Tag("+", "VARIABLE","None"); //id=56
        mydb.insert_Tag("+=", "VARIABLE","None"); //id=57
        mydb.insert_Tag("gobal var", "VARIABLE","None"); //id=58
        mydb.insert_Tag("var", "VARIABLE","None"); //id=59
        //answer - "54,57,59"


//?????????????

        //question 10 class - J
        mydb.insert_Tag("current_position", "MAIN","None"); //id=60
        mydb.insert_Tag("= /", "MAIN","None"); //id=61
        mydb.insert_Tag("X=5", "VARIABLE","None"); //id=62
        mydb.insert_Tag("Y=3", "VARIABLE","None"); //id=63
        mydb.insert_Tag("K=2", "VARIABLE","None"); //id=64
        mydb.insert_Tag("+", "VARIABLE","None"); //id=65
        mydb.insert_Tag("-", "VARIABLE","None"); //id=66

        //question 11 class - K
        mydb.insert_Tag("current_position", "MAIN","None"); //id=67
        mydb.insert_Tag("Y+X ", "MAIN","None"); //id=68
        mydb.insert_Tag("= /", "MAIN","None"); //id=69
        mydb.insert_Tag("Y=2", "VARIABLE","None"); //id=70
        mydb.insert_Tag("X=1", "VARIABLE","None"); //id=71
        mydb.insert_Tag("K=5", "VARIABLE","None"); //id=72
        mydb.insert_Tag("+", "VARIABLE","None"); //id=73
        mydb.insert_Tag("Y+K", "VARIABLE","None"); //id=74
        //answer- ""


    }




}
