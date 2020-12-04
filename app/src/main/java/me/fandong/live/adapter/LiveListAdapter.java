package me.fandong.live.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import me.fandong.live.PlayerActivity;
import me.fandong.live.R;
import me.fandong.live.model.LiveResponseEntry;

/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class LiveListAdapter extends RecyclerView.Adapter<LiveListAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private LiveResponseEntry.Data.LiveInfo[] mDataSet;

    private Context mContext;

    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;


        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getAdapterPosition() + " clicked.");
                    LiveResponseEntry.Data.LiveInfo liveInfo = LiveListAdapter.this.mDataSet[getAdapterPosition()];
                    Intent playerIntent = new Intent(LiveListAdapter.this.mContext, PlayerActivity.class);
                    playerIntent.putExtra("play_url",liveInfo.getStreamAddr());
                    playerIntent.putExtra("name",liveInfo.getName());
                    LiveListAdapter.this.mContext.startActivity(playerIntent);
                }
            });
            imageView = v.findViewById(R.id.imageView);
        }

        public ImageView getImageView() {
            return imageView;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */

    public LiveListAdapter(Context context,LiveResponseEntry.Data.LiveInfo[] dataSet) {
        this.mContext = context;
        mDataSet = dataSet;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_live_list, viewGroup, false);

        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        if (mDataSet[position] != null){
            LiveResponseEntry.Data.LiveInfo liveInfo = mDataSet[position];
            Glide.with(this.mContext).load(liveInfo.getCreator().getPortrait()).into(viewHolder.getImageView());
        }
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}