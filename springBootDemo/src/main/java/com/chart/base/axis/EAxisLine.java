/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chart.base.axis;


import com.chart.base.EBase;
import com.chart.base.style.ELineStyle;

/**
 *
 * @author 小黑
 */
public class EAxisLine extends EBase {
    
    private Boolean onZero ;
    private ELineStyle lineStyle;

    public Boolean isOnZero() {
        return onZero;
    }

    public void setOnZero(Boolean onZero) {
        this.onZero = onZero;
    }

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }
    
    
    
}
