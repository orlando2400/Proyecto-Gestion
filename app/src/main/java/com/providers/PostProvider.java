package com.providers;

import android.util.Log;

import androidx.annotation.Nullable;

import com.example.registrarse.Post;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

public class PostProvider {
    CollectionReference mCollection;
    public PostProvider(){
        mCollection = FirebaseFirestore.getInstance().collection("Posts");

    }
    public Task<Void> save(Post post) {
        return mCollection.document().set(post);
    }

    public Query getAll() {
        return mCollection.orderBy("timestamp", Query.Direction.DESCENDING);
    }

    public Query getAdopcion(){
        return mCollection.whereEqualTo("category","ADOPTAR");
    }


    public Query getPostByUser(String id) {
        return mCollection.whereEqualTo("idUser", id);
    }

    public Task <DocumentSnapshot> getPostById(String id){
        return mCollection.document(id).get();
    }

    public Task<Void> delete(String id) {
        return mCollection.document(id).delete();
    }

}
