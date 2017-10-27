package com.mmr.meza.nsuworkshop.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mmr.meza.nsuworkshop.Model.Student;
import com.mmr.meza.nsuworkshop.R;

import java.util.ArrayList;

/**
 * Created by Majedur Rahman on 10/27/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    Context context;
    ArrayList<Student> studentList;
    LayoutInflater layoutInflater;

    public StudentAdapter(Context c, ArrayList<Student> stringList) {

        this.context = c;
        studentList = stringList;
        layoutInflater = LayoutInflater.from(context);

        //Constructor Part is Done
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View MyView = layoutInflater.inflate(R.layout.single_item, parent , false);

        StudentViewHolder TukraTukraViewHolder = new StudentViewHolder(MyView);
        return TukraTukraViewHolder;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {

        holder.nameTV.setText(studentList.get(position).getStudentName());
        holder.departmentTV.setText(studentList.get(position).getStudentDepartment());

        if (studentList.get(position).getStudentCGPA() <2){

            int redColor = ContextCompat.getColor(context, R.color.colorRed);
            holder.cardView.setCardBackgroundColor(redColor);
            holder.cgpaTV.setTextColor(Color.WHITE);
            holder.nameTV.setTextColor(Color.WHITE);
            holder.departmentTV.setTextColor(Color.WHITE);

        }
        holder.cgpaTV.setText(studentList.get(position).getStudentCGPA()+ "");
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    /**
     * Need to do somthing Later
     */
    //This Inner Class of RecyclerView
    public class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV;
        TextView cgpaTV;
        TextView departmentTV;
        CardView cardView;

        public StudentViewHolder(View itemView) {
            super(itemView);

            nameTV = (TextView) itemView.findViewById(R.id.studentNameItem);
            cgpaTV = (TextView) itemView.findViewById(R.id.studentCGPA);
            departmentTV = (TextView) itemView.findViewById(R.id.studentDepartment);
            cardView = (CardView) itemView.findViewById(R.id.cardviewItem);


        }
    }

}
