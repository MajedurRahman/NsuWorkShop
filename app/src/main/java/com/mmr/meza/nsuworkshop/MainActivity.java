package com.mmr.meza.nsuworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.mmr.meza.nsuworkshop.Adapter.StudentAdapter;
import com.mmr.meza.nsuworkshop.Model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


 ArrayList<Student> studentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentList = new ArrayList<>();

        final EditText nameET = (EditText) findViewById(R.id.editTextName);
        final EditText depEt = (EditText)findViewById(R.id.editTextDep);
        final EditText cgpaET = (EditText)findViewById(R.id.editTextCGPA);

        Button saveButton=(Button) findViewById(R.id.saveButton);
        Button showDataButton= (Button) findViewById(R.id.showBtn);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String StudentName = nameET.getText().toString();
                String StuentDepartment = depEt.getText().toString();
                String studentCGPA = cgpaET.getText().toString();



                Student student = new Student(StudentName , StuentDepartment ,Double.parseDouble(studentCGPA));

                studentList.add(student);

               // Toast.makeText(MainActivity.this, studentList.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        showDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StudentAdapter studentAdapter = new StudentAdapter(MainActivity.this , studentList);
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

                LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(studentAdapter);
            }
        });



    }
}
