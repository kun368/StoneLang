package com.zzkun.ast;

import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
public class ASTList extends ASTree {

    protected List<ASTree> children;

    public ASTList(List<ASTree> children) {
        this.children = children;
    }

    @Override
    public ASTree child(int i) {
        return children.get(i);
    }

    @Override
    public int numChildren() {
        return children.size();
    }

    @Override
    public Iterator<ASTree> children() {
        return children.iterator();
    }

    @Override
    public String location() {
        for (ASTree child : children) {
            String s = child.location();
            if (s != null)
                return s;
        }
        return null;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ", "(", ")");
        for (ASTree child : children)
            joiner.add(child.toString());
        return joiner.toString();
    }
}
