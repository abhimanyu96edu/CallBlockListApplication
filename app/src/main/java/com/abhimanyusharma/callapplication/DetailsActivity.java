package com.abhimanyusharma.callapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.abhimanyusharma.callapplication.TableModel.CallData;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        try {

            listView = (ListView) findViewById(R.id.list);

            final ArrayList<String> itemList = new ArrayList<String>();

            java.util.List<CallData> list1 = CallData.getCallDataValue();

            //for (int i = 0; i < list1.size(); i++) {      (showing first entry twice if started from i=0)
            for (int i = 1; i < list1.size(); i++) {
                CallData cd = list1.get(i);

                //cd.getNumber();
                //cd.getTime();
                itemList.add("" + String.valueOf(cd.getNumber()) + "         " + String.valueOf(cd.getTime()));

            }

            ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemList);
            listView.setAdapter(adapter);
        } catch (Exception e) {

            Toast.makeText(getApplicationContext(), "No Call Yet!!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }

}
/*
* EducationData ed = new EducationData();
        ed.userEmail = u_userEmail;
        ed.e_college = e_college.getText().toString().trim();
        ed.e_course = e_course.getText().toString().trim();
        ed.e_marks = e_marks.getText().toString().trim();
        ed.e_end_date = e_end_date.getText().toString().trim();

        ed.save();
_______________________________________________________________________________________________
        java.util.List<EducationData> list1 = EducationData.getEducationValue(u_userEmail);
        //list.setSymbolIndent(42);
        for (int i = 0; i < list1.size(); i++) {
            EducationData ed = list1.get(i);

            table.addCell(new Paragraph(ed.getE_college(), normalFont));
            table.addCell(new Paragraph(ed.getE_course(), normalFont));
            table.addCell(new Paragraph(ed.getE_marks(), normalFont));
            table.addCell(new Paragraph(ed.getE_end_date(), normalFont));
        }

        //Generate Table Contents
        //table.addCell(u_e_college);
        //table.addCell(u_e_course);
        //table.addCell(u_e_marks);
        //table.addCell(u_e_end_date);

        document.add(table);
_________________________________________________________________________________________________

        long d=1483901400*1000L;
        Date date = new Date(d); // your date

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss, dd-MM-yyyy");
        String date1 = formatter.format(date.getTime());
____________________________________________________________________________________________________

Intent intent=getIntent();
        Bundle b=intent.getExtras();
        if(b!=null){
            // Display rejected number in the TextView
            tv.setText(b.getString("number"));
        }
*
*/


//http://www.worldbestlearningcenter.com/tips/Android-reject-call.htm