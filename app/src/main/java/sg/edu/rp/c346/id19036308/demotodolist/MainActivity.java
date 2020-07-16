package sg.edu.rp.c346.id19036308.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoList;
    ArrayList<ToDoItem> toDoList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvToDoList = findViewById(R.id.listViewToDoList);
        toDoList = new ArrayList<>();
        ToDoItem av1 = new ToDoItem("Go for movie", Calendar.getInstance());
        toDoList.add(av1);
        toDoList.add(new ToDoItem("Go for haircut", Calendar.getInstance()));

        adapter = new CustomAdapter(this, R.layout.row, toDoList);
        lvToDoList.setAdapter(adapter);
    }
}
