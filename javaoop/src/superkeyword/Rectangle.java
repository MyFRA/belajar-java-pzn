package superkeyword;

public class Rectangle extends Shape {

    //  super keyword itu mirip this, tapi dalam konteks inheritence

    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }

}
