/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chart.base;


import com.chart.animation.Eanimation;
import com.chart.base.style.ECrossStyle;
import com.chart.base.style.ELineStyle;
import com.chart.base.style.EShadowStyle;

/**
 *
 * @author 小黑
 */
public class EAxisPointer extends Eanimation {

    private String type;
    private String axis;
    private ELineStyle lineStyle;
    private EShadowStyle shadowStyle;
    private ECrossStyle crossStyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public EShadowStyle getShadowStyle() {
        return shadowStyle;
    }

    public void setShadowStyle(EShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
    }

    public ECrossStyle getCrossStyle() {
        return crossStyle;
    }

    public void setCrossStyle(ECrossStyle crossStyle) {
        this.crossStyle = crossStyle;
    }

}
