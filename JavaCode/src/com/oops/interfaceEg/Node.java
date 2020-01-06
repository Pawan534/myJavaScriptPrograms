package com.oops.interfaceEg;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightList;
    }

    @Override
    ListItem setNext(ListItem item) {
       this.rightList = item;
        return this.rightList;
    }

    @Override
    ListItem previous() {
        return this.leftList;
    }

    @Override
    ListItem setPrevios(ListItem item) {
        this.leftList = item;
        return this.leftList;
    }

    @Override
    int compareTo(ListItem item) {
       if(item!=null){
           return ((String)super.getValue()).compareTo((String) item.getValue());
       } else{
           return -1;
       }
    }
}
