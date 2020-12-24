package home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bt4_qh.R;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.shopViewHolder> {
    List<Home> mHomes;
    public void setData(List<Home> list){
        this.mHomes = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public shopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,parent,false);
        return new shopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull shopViewHolder holder, int position) {
        Home home = mHomes.get(position);
        if(home == null){
            return;
        }
        holder.imgShop.setImageResource(home.getResourceId());
        holder.tvTitle.setText(home.getTitle());
    }
    @Override
    public int getItemCount() {
        if (mHomes !=null){
            return mHomes.size();
        }
        return 0;
    }

    public class shopViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgShop;
        private TextView tvTitle;
        public shopViewHolder(@NonNull View itemView) {
            super(itemView);
            imgShop = itemView.findViewById(R.id.img);
            tvTitle = itemView.findViewById(R.id.title);
        }
    }
}
