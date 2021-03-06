package com.shashi.qtvapp.ui.others;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.shashi.qtvapp.R;

public class AboutFragment extends Fragment implements View.OnClickListener {
    public AboutFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        Button button = view.findViewById(R.id.button_mail);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "srianshsankhi@gmail.com"));
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getActivity(), "Could not open mail", Toast.LENGTH_SHORT).show();
        }
    }
}
