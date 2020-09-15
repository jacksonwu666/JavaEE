package com.igeek.javaee.ch02.gradecalcula;

public class GradeCalcula {
    private float javaGrade = 0.0f;
    private float csharpGrade = 0.0f;
    private float datebaseGrade = 0.0f;

    public GradeCalcula(){

    }

    public GradeCalcula(float javaGrade,float csharpGrade,float datebaseGrade){
        this.javaGrade= javaGrade;
        this.csharpGrade = csharpGrade;
        this.datebaseGrade = datebaseGrade;
    }

    public float getJavaGrade() {
        return javaGrade;
    }

    public float getCsharpGrade() {
        return csharpGrade;
    }

    public float getDatebaseGrade() {
        return datebaseGrade;
    }

    public void setJavaGrade(float javaGrade) {
        this.javaGrade = javaGrade;
    }

    public void setCsharpGrade(float csharpGrade) {
        this.csharpGrade = csharpGrade;
    }

    public void setDatebaseGrade(float datebaseGrade) {
        this.datebaseGrade = datebaseGrade;
    }
    public void calcual(){
        float sum,average;
        sum = getJavaGrade()+getCsharpGrade()+getDatebaseGrade();
        average = (float) (sum/3.0);
        System.out.println("总分"+sum);
        System.out.println("平均成绩"+average);
    }


    public static void main(String[] args) {
        GradeCalcula gradeCalcula = new GradeCalcula();
        //无参构造函数传入参数
        System.out.println("无参构造函数传入参数");
        gradeCalcula.setCsharpGrade(80.0f);
        gradeCalcula.setJavaGrade(79.0f);
        gradeCalcula.setDatebaseGrade(90.0f);
        System.out.println("C#成绩"+gradeCalcula.getCsharpGrade());
        System.out.println("Java成绩"+gradeCalcula.getJavaGrade());
        System.out.println("数据库成绩"+gradeCalcula.getDatebaseGrade());
        gradeCalcula.calcual();
        //有参构造函数传入参数
        System.out.println("有参构造函数传入参数");
       GradeCalcula gra =  new GradeCalcula(80.8f,90.0f,88.8f);
            gra.calcual();

    }
}
