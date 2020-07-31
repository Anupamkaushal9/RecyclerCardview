package com.example.iamanupam.recyclercardview;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    // String title[];
    // int images[];
    Datavalue datavalues[];
    public MyAdapter( Datavalue[] datavalues)
    {
        this.datavalues = datavalues;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.row_item, parent, false);
        return new MyViewHolader(v);
    }



    public class MyViewHolader extends RecyclerView.ViewHolder {
         public ImageView imageView;
        public TextView title;
        public RelativeLayout relativeLayout;
        public MyViewHolader(@NonNull View itemView) {
            super(itemView);
            this.imageView=itemView.findViewById(R.id.im);
            this.title=itemView.findViewById(R.id.tv);
            this.relativeLayout = itemView.findViewById(R.id.relativelayout);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //Datavalue datavalue = datavalues[position];
        if (holder instanceof MyAdapter.MyViewHolader){
            ((MyAdapter.MyViewHolader) holder).imageView.setImageResource(datavalues[position].getImages());
            ((MyAdapter.MyViewHolader) holder).title.setText(datavalues[position].getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return datavalues.length;
    }
}
