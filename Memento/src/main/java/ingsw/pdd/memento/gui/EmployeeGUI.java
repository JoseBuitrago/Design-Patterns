package ingsw.pdd.memento.gui;

import javax.swing.JOptionPane;
import ingsw.pdd.memento.entity.Employee;
import ingsw.pdd.memento.impl.EmployeeCaretaker;
import ingsw.pdd.memento.impl.EmployeeMemento;

@SuppressWarnings("serial")
public class EmployeeGUI extends javax.swing.JFrame {
    Employee employee = new Employee();
    private EmployeeCaretaker caretaker = new EmployeeCaretaker();
    
    public EmployeeGUI() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        empNumberTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patrón de diseño Memento ");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Numero Empleado");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save(evt);
            }
        });

        prevBtn.setText("Anterior");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous(evt);
            }
        });

        nextBtn.setText("Siguiente");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prevBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 141, Short.MAX_VALUE))
                            .addComponent(lastNameTxt)
                            .addComponent(nameTxt))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(prevBtn)
                    .addComponent(nextBtn))
                .addContainerGap())
        );

        pack();
    }

    private void save(java.awt.event.ActionEvent evt) {
        employee.setName(nameTxt.getText());
        employee.setLastName(lastNameTxt.getText());
        employee.setEmployeeNumber(empNumberTxt.getText());
        
        caretaker.addNewMemento(employee.createMemento());
        
        JOptionPane.showMessageDialog(this, "Estado Guardado");
    }

    private void previous(java.awt.event.ActionEvent evt) {
        
        EmployeeMemento menento = caretaker.getPreviousMemento();
        if(menento==null){
            JOptionPane.showMessageDialog(this, "No existen mas Estados");
            return;
        }
        employee.restoreMemento(menento);
        updateModel();
    }

    private void next(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        
        EmployeeMemento memento = caretaker.getNextMemento();
        if(memento==null){
            JOptionPane.showMessageDialog(this, "No existen mas Estados");
            return;
        }
        employee.restoreMemento(memento);
        updateModel();
    }

    private void updateModel(){
        nameTxt.setText(employee.getName());
        lastNameTxt.setText(employee.getLastName());
        empNumberTxt.setText(employee.getEmployeeNumber());
    }
    
    
    private javax.swing.JTextField empNumberTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton prevBtn;
    
}
