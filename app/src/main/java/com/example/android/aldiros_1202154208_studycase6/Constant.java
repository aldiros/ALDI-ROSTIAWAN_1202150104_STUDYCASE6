package com.example.android.aldiros_1202154208_studycase6;

/**
 * Created by Han on 01/04/2018.
 */

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

//class untuk menyimpan semua variable global untuk memudahkan akses ke firebase dari setiap activity
public class Constant {
    //Firebase Database
    public final static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public final static DatabaseReference refPhoto = database.getReference("photo");

    //Firebase Auth
    public final static FirebaseAuth mAuth = FirebaseAuth.getInstance();
    public static FirebaseUser currentUser;

    //Firebase Storage
    public static FirebaseStorage storage = FirebaseStorage.getInstance();
    public static StorageReference storageRef = storage.getReference();
}
