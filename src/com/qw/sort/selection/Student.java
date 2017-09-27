package com.qw.sort.selection;

/*
* 学生实体类
* */
public class Student implements Comparable<Student>{
    private String  name;
    private int score;

    public Student(String name, int score){
        this.name =  name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public int compareTo(Student comStu) {
        if(this.score > comStu.score){
            return -1;
        }else if (this.score < comStu.score){
            return 1;
        }else{
            return this.name.compareTo(comStu.name);
        }
    }

    @Override
    public String toString() {
        return "Student:" +this.name + Integer.toString(this.score) ;
    }
}
