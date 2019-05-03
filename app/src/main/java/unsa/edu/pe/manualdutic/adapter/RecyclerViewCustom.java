package unsa.edu.pe.manualdutic.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.List;

import unsa.edu.pe.manualdutic.R;
import unsa.edu.pe.manualdutic.recursos.Video;

public class RecyclerViewCustom extends RecyclerView.Adapter<RecyclerViewCustom.MyViewHolder> {

    Context mContext;
    List<Video> mData;

    public RecyclerViewCustom(Context mContext, List<Video> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_video,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.video.loadData(mData.get(position).getVideo(),"text/html", "utf-8");
        holder.title.setText(mData.get(position).getTitle());
        holder.description.setText(mData.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView description;
        private WebView video;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.video_title);
            description = itemView.findViewById(R.id.video_description);
            video = itemView.findViewById(R.id.video_tut);

            video.getSettings().setJavaScriptEnabled(true);
            video.setWebChromeClient(new WebChromeClient(){

            });
        }
    }
}
