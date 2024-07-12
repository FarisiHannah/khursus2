package net.sf.apptoapi.adapters;

import net.sf.apptoapi.DetailActivity;
import net.sf. apptoapi. R;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import net.sf.apptoapi.model.Rider;

import java.util.List;

public class AdapterRider extends RecyclerView.Adapter<AdapterRider.HolderRider> {

    private final Context context;
    private final List<Rider> riders;

    public AdapterRider(Context context, List<Rider> riders) {
        this.context = context;
        this.riders = riders;
    }

    @NonNull
    @Override
    public HolderRider onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //menyematkan item rider ke dalam rider
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item_rider,parent,false);
        return new HolderRider(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderRider holder, int position) {
        Rider rider = riders.get(position);
        holder.tvRiderName.setText(rider.getName());
        holder.tvRiderId.setText(rider.getId());
        holder.tvRiderNumber.setText(rider.getNumber());
        holder.tvRiderCountry.setText(rider.getCountry());
        holder.tvRiderSponsor.setText(rider.getSponsor());

        Glide.with(context)
                .load(rider.getPhoto())
                .placeholder(R.drawable.baseline_person_32)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        if(riders!=null)
        {
            return riders.size();
        }
        else {
            Toast.makeText(context, "Rider data is not available", Toast.LENGTH_SHORT).show();
            return 0;
        }
    }

    public class HolderRider extends RecyclerView.ViewHolder {

        private final TextView tvRiderId, tvRiderName, tvRiderNumber, tvRiderSponsor,tvRiderCountry;
        ImageView imageView;

        public HolderRider(@NonNull View itemView) {
            super(itemView);
            tvRiderId=itemView.findViewById(R.id.tvRiderId);
            tvRiderName=itemView.findViewById(R.id.tvRiderName);
            tvRiderNumber=itemView.findViewById(R.id.tvRiderNumber);
            tvRiderSponsor=itemView.findViewById(R.id.tvRiderSponsor);
            tvRiderCountry=itemView.findViewById(R.id.tvRiderCountry);
            imageView=itemView.findViewById(R.id.image_rider);

            itemView.setOnLongClickListener(v->{
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(context);
                builder.setTitle("Choose Action");
                builder.setMessage("what action do you want to perform?");
                builder.setPositiveButton("Detail", ((dialog, which) -> {
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("id",tvRiderId.getText());
                    intent.putExtra("name",tvRiderName.getText());
                    intent.putExtra("country",tvRiderCountry.getText());
                    intent.putExtra("number",tvRiderNumber.getText());
                    context.startActivity(intent);
                }));
                builder.setNegativeButton("Delete",((d,w)->{
                    Log.i("info w ", Integer.toString(w));
                    d.dismiss();
                }));
                builder.setIcon(R.drawable.baseline_info_32);
                builder.setCancelable(true);
                builder.show();
                return false;
            });
        }
    }
}
