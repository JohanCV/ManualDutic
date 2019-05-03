package unsa.edu.pe.manualdutic.alumno;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import unsa.edu.pe.manualdutic.R;
import unsa.edu.pe.manualdutic.adapter.RecyclerViewCustom;
import unsa.edu.pe.manualdutic.recursos.Video;

public class FragmentVideoStudent extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Video> listVideoStudent;


    public FragmentVideoStudent() {
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.video_fragment_estudiante,container,false);

        myrecyclerview = v.findViewById(R.id.recyclerview_estudiante);
        RecyclerViewCustom recyclerAdapter = new RecyclerViewCustom(getContext(), listVideoStudent);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listVideoStudent = new ArrayList<>();

        listVideoStudent.add(new Video( "<iframe width=\"330\" height=\"180\" src=\"https://www.youtube.com/embed/JaLzSK8Jbok?list=PLqtSFRmgPpYHJ8aEU1AXOlGNv5JcmIBvd\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>","1. Tutorial Estudiante:","Como acceder y personalizar tu aula virtual"));
    }

}
