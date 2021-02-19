package kapadokia.nyandoro.covidapp.ui.main;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.MyCountryViewHolder> {


   public class MyCountryViewHolder extends RecyclerView.ViewHolder{

        public MyCountryViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    @NonNull
    @Override
    public CountryAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
