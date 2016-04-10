package com.example.zombisou.nevershortoncurry;

import java.util.List;

/**
 * Created by Zombisou on 10-Apr-16.
 */
public class TodoList {

    private List<String> unchecked;
    private List<String> checked;

    public List<String> getUnchecked() {
        return unchecked;
    }

    public List<String> getChecked() {
        return checked;
    }

    public void check(int toCheck){
        if(unchecked.size() > toCheck){
            checked.add(unchecked.get(toCheck));
            unchecked.remove(toCheck);
        }
    }

}
