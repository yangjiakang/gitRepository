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
public class EAxisTick extends EBase {

    private Boolean alignWithLabel;
    private Boolean inside;
    private String interval;
    private Integer length;
    private ELineStyle lineStyle;

    public Boolean isAlignWithLabel() {
        return alignWithLabel;
    }

    public void setAlignWithLabel(Boolean alignWithLabel) {
        this.alignWithLabel = alignWithLabel;
    }

    public Boolean isInside() {
        return inside;
    }

    public void setInside(Boolean inside) {
        this.inside = inside;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public ELineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(ELineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

}
