package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if(left == null) {
            left = new Node(nameOfNewNode);
        } else if (right == null) {
            right = new Node(nameOfNewNode);
        } else if (left != null) {
            left.add(nameOfNewNode);
        } else {
            right.add(nameOfNewNode);
        }
    }

    void populateNamesList(ArrayList namesList) {
        if(left != null) {
            left.populateNamesList(namesList);
        }
        if(right != null) {
            right.populateNamesList(namesList);
        }

        namesList.add(name);
    }

    public List<String> names() {
        ArrayList<String> namesList = new ArrayList<>();
        populateNamesList(namesList);
        Collections.sort(namesList);
        return namesList;
    }
}
