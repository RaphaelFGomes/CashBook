package com.book.cash.cashbook.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class Post {

    public String uid;
    public String author;
    public String patientName;
    public String patientCPF;
    public String date;
    public String value;
    public int starCount = 0;
    public Map<String, Boolean> stars = new HashMap<>();

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String uid, String author, String patientName, String patientCPF, String date, String value) {
        this.uid = uid;
        this.author = author;
        this.patientName = patientName;
        this.patientCPF = patientCPF;
        this.date = date;
        this.value = value;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("patientName", patientName);
        result.put("patientCPF", patientCPF);
        result.put("date", date);
        result.put("value", value);
        result.put("starCount", starCount);
        result.put("stars", stars);

        return result;
    }
    // [END post_to_map]

}
// [END post_class]
