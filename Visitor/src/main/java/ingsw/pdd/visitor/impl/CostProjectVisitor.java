package ingsw.pdd.visitor.impl;

import ingsw.pdd.visitor.domain.*;

public class CostProjectVisitor implements IVisitor<Number> {

    private double totalCost;

    @Override
    public void project(Project project) {
        for (Activitie act : project.getActivities()) {
            act.accept(this);
        }
    }

    @Override
    public void activitie(ingsw.pdd.visitor.domain.Activitie activitie) {
        activitie.getResponsible().accept(this);
        for (Activitie act : activitie.getActivities()) {
            act.accept(this);
        }
    }

    @Override
    public void employee(Employee employee) {
        totalCost += employee.getPrice();
    }

    @Override
    public Number getResult() {
        return totalCost;
    }
}
