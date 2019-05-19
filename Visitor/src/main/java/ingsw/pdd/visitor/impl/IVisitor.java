package ingsw.pdd.visitor.impl;

import ingsw.pdd.visitor.domain.Activitie;
import ingsw.pdd.visitor.domain.Employee;
import ingsw.pdd.visitor.domain.Project;

public interface IVisitor<T> {
    public void project(Project project);
    public void activitie(Activitie activitie);
    public void employee(Employee employee);
    public T getResult();
}
