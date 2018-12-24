/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chart.base;


import com.chart.base.style.EAreaStyle;
import com.chart.base.style.ELineStyle;

/**
 *
 * @author 小黑
 */
public class EDataBackground {
    
    private ELineStyle lineStyle;
    private EAreaStyle areaStyle ;

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public EAreaStyle getAreaStyle() {
        return areaStyle;
    }

    public void setAreaStyle(EAreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }
    
    
    
}
