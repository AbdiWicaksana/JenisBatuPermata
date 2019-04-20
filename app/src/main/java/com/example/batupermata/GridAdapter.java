package com.example.batupermata;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {

    private static final String TAG = "ListView";
    private ArrayList<String> imagejbNames = new ArrayList<>();
    private ArrayList<String> jbImages = new ArrayList<>();
    private ArrayList<String> jbImagesDesc = new ArrayList<>();
    private ArrayList<String> jbDescriptionDetail = new ArrayList<>();

    private Context context;

    public GridAdapter(Context context, ArrayList<String> imagejbNames, ArrayList<String> jbImages, ArrayList<String> jbImagesDesc , ArrayList<String> jbDescriptionDetail ) {

        this.imagejbNames = imagejbNames;
        this.jbImages = jbImages;
        this.jbImagesDesc = jbImagesDesc;
        this.jbDescriptionDetail = jbDescriptionDetail;
        this.context = context;

    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int i) {
        Glide.with(context)
                .asBitmap()
                .load(jbImages.get(i))
                .into(holder.imgPhoto);
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagejbNames.get(i));
                Toast.makeText(context, imagejbNames.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, GalleryActivity.class);
                intent.putExtra("url_image",jbImages.get(i));
                intent.putExtra("name_image",imagejbNames.get(i));
                intent.putExtra("desc_image",jbDescriptionDetail.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return jbImages.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

