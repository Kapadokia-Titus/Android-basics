package kapadokia.nyandoro.indexfandwallet.ui.frags.rafiki;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kapadokia.nyandoro.indexfandwallet.R;

public class RafikiFragment extends Fragment {

    private RafikiViewModel mViewModel;

    public static RafikiFragment newInstance() {
        return new RafikiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.rafiki_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RafikiViewModel.class);
        // TODO: Use the ViewModel
    }

}