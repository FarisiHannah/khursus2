package net.sf.apptoapi.adapters;

import net.sf. apptoapi. R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.sf.apptoapi.model.Rider;

import java.util.List;

public class AdapterRider extends RecyclerView.Adapter<AdapterRider.HolderRider> {

    private Context context;
    private List<Rider> riders;

    public AdapterRider(Context context, List<Rider> riders) {
        this.context = context;
        this.riders = riders;
    }

    @NonNull
    @Override
    public HolderRider onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //menyematkan item rider ke dalam rider
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_rider,parent,false);
        HolderRider holderRider = new HolderRider(view);
        return holderRider;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderRider holder, int position) {
        Rider rider = riders.get(position);
        holder.tvRiderName.setText(rider.getName());
        holder.tvRiderId.setText(rider.getId());
        holder.tvRiderNumber.setText(rider.getNumber());
        holder.tvRiderCountry.setText(rider.getCountry());
        holder.tvRiderSponsor.setText(rider.getSponsor());
    }

    @Override
    public int getItemCount() {
        if(riders!=null)
        {
            return riders.size();
        }
        else {
            Toast.makeText(context, "Rider data is not available", Toast.LENGTH_SHORT);
            return 0;
        }
    }

    public class HolderRider extends RecyclerView.ViewHolder {

        private TextView tvRiderId, tvRiderName, tvRiderNumber, tvRiderSponsor,tvRiderCountry;
        ImageView imageView;

        public HolderRider(@NonNull View itemView) {
            super(itemView);
            tvRiderId=itemView.findViewById(R.id.tvRiderId);
            tvRiderName=itemView.findViewById(R.id.tvRiderName);
            tvRiderNumber=itemView.findViewById(R.id.tvRiderNumber);
            tvRiderSponsor=itemView.findViewById(R.id.tvRiderSponsor);
            tvRiderCountry=itemView.findViewById(R.id.tvRiderCountry);
        }
    }
}
