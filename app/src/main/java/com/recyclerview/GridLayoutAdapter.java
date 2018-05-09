package com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Inbridge04 on 09-May-18.
 */

public class GridLayoutAdapter extends RecyclerView.Adapter<GridLayoutAdapter.View_Holder>{
    ArrayList<DataModel> mDataModelArrayList;
    Context mContext;

    public GridLayoutAdapter(ArrayList<DataModel> dataModelArrayList, Context applicationContext) {
        this.mDataModelArrayList = dataModelArrayList;
        this.mContext = applicationContext;
    }

    @Override
    public GridLayoutAdapter.View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.linear_layout_child_view, parent, false);
        View_Holder holder = new View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(GridLayoutAdapter.View_Holder holder, int position) {
        holder.tv_name.setText(mDataModelArrayList.get(position).getName());
        holder.tv_place.setText(mDataModelArrayList.get(position).getPlace());
    }

    @Override
    public int getItemCount() {
        return mDataModelArrayList.size();
    }

    public class View_Holder extends RecyclerView.ViewHolder {

        TextView tv_name, tv_place;

        public View_Holder(View itemView) {
            super(itemView);


            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_place = itemView.findViewById(R.id.tv_place);
        }
    }
}
