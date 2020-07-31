package com.example.iamanupam.recyclercardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    CheckBox cbStatus;
    RadioButton r1, r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        Datavalue[] datavalues = new Datavalue[]{
                new Datavalue("Anupam",R.drawable.a1),
                new Datavalue("Anamika",R.drawable.a2),
                new Datavalue("Pooja",R.drawable.a3),
                new Datavalue("CPr",R.drawable.a4),
                new Datavalue("Usmaan",R.drawable.a5),

        };
        MyAdapter myAdapter = new MyAdapter(datavalues);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);

        /*Log.e("Activity","Created");
        tvClickMe=findViewById(R.id.tvClickMe);
        cbStatus=findViewById(R.id.cbStatus);
        r1=findViewById(R.id.rd1);
        r2=findViewById(R.id.rb2);
        tvClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchSec=new Intent(MainActivity.this,SecondActivity.class);
                if (cbStatus.isChecked()){
                    launchSec.putExtra("type_status","I'm Online");
                }else {
                    launchSec.putExtra("type_status","I'm Offline");
                }

                if(r1.isChecked())
                {
                    launchSec.putExtra("button_status1","good");
                }
                else  if(r2.isChecked())
                {
                    launchSec.putExtra("button_status1","bad");
                }
                else
                {
                    launchSec.putExtra("button_status1", "empty");
                }
                  startActivity(launchSec);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //start service
        Log.e("Activity","Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity","paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity","Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //stop
        Log.e("Activity","Destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activity","Restarted");
    }
}*/

    }



    /*
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.VHolder> {

        Context context;
        String title[];
        int images[];
        private ArrayList arrayList;
        Datavalue[] datavalues;


        public MyAdapter(Context context, String[] title, int[] images, Datavalue[] datavalues) {
            this.context = context;
            this.title = title;
            this.images = images;
            this.datavalues = datavalues;
        }


        //        @NonNull
        @Override
        public MyAdapter.VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            return new VHolder(layoutInflater.inflate(R.layout.row_item, parent, false));
        }


//        public class MyViewHolader extends RecyclerView.ViewHolder {
//            ImageView imageView;
//            TextView title;
//            public MyViewHolader(@NonNull View itemView) {
//                super(itemView);
//                imageView=itemView.findViewById(R.id.im);
//                title=itemView.findViewById(R.id.tv);
//
//            }
//        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.VHolder holder, int position) {
            final Datavalue datavalue = datavalues[position];
            holder.
        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


        public class VHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView title;

            public VHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.im);
                title = itemView.findViewById(R.id.tv);
            }
        }
    }*/

}
