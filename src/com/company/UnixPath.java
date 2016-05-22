package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by User on 19.05.2016.
 */
public class UnixPath {
    public String simplify(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        LinkedList<String> stack = new LinkedList<>();
        String[] dir = input.split("/");
        for (String d : dir) {
            if (d.equals("") || d.equals(".")) {
                continue;
            } else if (d.equals("..")){
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(d);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        } else {
            String result = "";
            while (!stack.isEmpty()) {
                result += "/" + stack.removeLast();
            }
            return result;
        }
    }
}