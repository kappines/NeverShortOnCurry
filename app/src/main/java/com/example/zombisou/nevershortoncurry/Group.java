package com.example.zombisou.nevershortoncurry;

/**
 * Created by Zombisou on 10-Apr-16.
 */
public class Group {

    private String name;
    private TodoList todoList;
    private Accounts accounts;

    public Group(String name) {
        this.name = name;
        todoList = new TodoList();
        accounts = new Accounts();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public TodoList getTodoList() {
        return todoList;
    }

    public Accounts getAccounts() {
        return accounts;
    }
}
