package com.firstandroidclass.taskapp;

import java.util.UUID;

/**
 * Created by sarahmcculley on 2/22/17.
 */

public class Task {
    private static final String TAG = Task.class.getSimpleName();
    private UUID mID;
    private String mName;
    private String mDescription;
    private Boolean mCompletion;
    private String mDueDate;
    private String mlocation;


    public Task() {
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public void setID(UUID ID) {
        mID = ID;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Boolean getCompletion() {
        return mCompletion;
    }

    public void setCompletion(Boolean completion) {
        mCompletion = completion;
    }

    public String getDueDate() {
        return mDueDate;
    }

    public void setDueDate(String dueDate) {
        mDueDate = dueDate;
    }

    public String getMlocation() {
        return mlocation;
    }

    public void setMlocation(String mlocation) {
        this.mlocation = mlocation;
    }
}
