package com.fk.project.graduation.ann;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: gao jw
 * @date: 2021/12/21  16:34
 */

public class DataNode
{
    private List<Float> mAttribList;
    private int type;

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public List<Float> getAttribList()
    {
        return mAttribList;
    }

    public void addAttrib(Float value)
    {
        mAttribList.add(value);
    }

    public DataNode()
    {
        mAttribList = new ArrayList<Float>();
    }

}
