package recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewholder> {
    private Context mContext;

    public LinearAdapter(Context context) {

        this.mContext = context;
    }

    @NonNull
    @Override
    public LinearAdapter.LinearViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new LinearViewholder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewholder holder, final int position) {
                  holder.textView.setText("Hello World!");
                  holder.itemView.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          Toast.makeText(mContext,"click..."+position,Toast.LENGTH_SHORT).show();
                      }

                  });



    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class LinearViewholder extends RecyclerView.ViewHolder {
        private TextView textView;

        public LinearViewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);

        }
    }
}
