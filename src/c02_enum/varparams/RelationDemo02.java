package c02_enum.varparams;

class Point {
    int x, y;
}

class Line {
    //has a (有整体部分关系)：聚合关系
    private Point start;
    private Point end;
}

class Brain {
}//大脑(A)

class Person {//B,假如B和A存在整体关系
    Brain a = new Brain();//A对象的生命周期依赖于B
}


public class RelationDemo02 {

}

