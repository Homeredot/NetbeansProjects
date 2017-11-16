/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortest_path_3;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author AnhTu
 */
public class App extends javax.swing.JFrame {
    private final String STR_ALL = "Tất cả";
    
    GraphPanel gp;
    int sourceNode;
    int destNode;       //destNode = 0 nghĩa là chọn tất cả
    
    public App() {
        initComponents();
        this.setTitle("Mô phỏng thuật toán Dijkstra");
        gp = new GraphPanel();
        gp.taOut = this.taOutput;
        gp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 3, true));
        gp.setSize(graphPanel_App.getWidth(), graphPanel_App.getHeight());
        graphPanel_App.add(gp);
        sourceNode = 1;
        destNode = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTravelGraph = new javax.swing.ButtonGroup();
        optionPanel = new javax.swing.JPanel();
        btRandomGraph = new javax.swing.JButton();
        btDemoGraph = new javax.swing.JButton();
        btRun = new javax.swing.JButton();
        btRunStep = new javax.swing.JButton();
        cbSourceNode = new javax.swing.JComboBox<>();
        cbDestNode = new javax.swing.JComboBox<>();
        btClearOutput = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btTraversal = new javax.swing.JButton();
        btSaveGraph = new javax.swing.JButton();
        btTraversalStep = new javax.swing.JButton();
        graphPanel_App = new javax.swing.JPanel();
        outputPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taOutput = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        optionPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 3, true));

        btRandomGraph.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btRandomGraph.setText("Đồ thị ngẫu nhiên");
        btRandomGraph.setToolTipText("Tạo 1 đồ thị ngẫu nhiên");
        btRandomGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRandomGraphActionPerformed(evt);
            }
        });

        btDemoGraph.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btDemoGraph.setText("Đồ thị demo");
        btDemoGraph.setToolTipText("Lấy đồ thị có sẵn từ file");
        btDemoGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDemoGraphActionPerformed(evt);
            }
        });

        btRun.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btRun.setText("Chạy");
        btRun.setToolTipText("Tìm đường đi ngắn nhất");
        btRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRunActionPerformed(evt);
            }
        });

        btRunStep.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btRunStep.setText("Chạy từng bước");
        btRunStep.setToolTipText("");
        btRunStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRunStepActionPerformed(evt);
            }
        });

        cbSourceNode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cbSourceNode.setEnabled(false);
        cbSourceNode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSourceNodeItemStateChanged(evt);
            }
        });

        cbDestNode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "1", "2", "3" }));
        cbDestNode.setEnabled(false);
        cbDestNode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDestNodeItemStateChanged(evt);
            }
        });

        btClearOutput.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btClearOutput.setText("Xóa output");
        btClearOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearOutputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel3.setText("Chọn đồ thị");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel5.setText("Chọn các node nguồn và đích");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel6.setText("Mô phỏng");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel7.setText("Node nguồn");

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel8.setText("Node đích");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel9.setText("Duyệt đồ thị");

        groupTravelGraph.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("DFS");
        jRadioButton1.setToolTipText("Duyệt theo chiều sâu");

        groupTravelGraph.add(jRadioButton2);
        jRadioButton2.setText("BFS");
        jRadioButton2.setToolTipText("Duyệt theo chiều rộng");

        btTraversal.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btTraversal.setText("Duyệt");
        btTraversal.setToolTipText("Tìm đường đi ngắn nhất");
        btTraversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraversalActionPerformed(evt);
            }
        });

        btSaveGraph.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btSaveGraph.setText("Lưu đồ thị");
        btSaveGraph.setToolTipText("Tìm đường đi ngắn nhất");
        btSaveGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveGraphActionPerformed(evt);
            }
        });

        btTraversalStep.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btTraversalStep.setText("Duyệt từng bước");
        btTraversalStep.setToolTipText("Tìm đường đi ngắn nhất");
        btTraversalStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraversalStepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelLayout.createSequentialGroup()
                        .addComponent(btRun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRunStep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelLayout.createSequentialGroup()
                        .addComponent(cbSourceNode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbDestNode, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(optionPanelLayout.createSequentialGroup()
                        .addComponent(btSaveGraph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btClearOutput))
                    .addGroup(optionPanelLayout.createSequentialGroup()
                        .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btDemoGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(btRandomGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(optionPanelLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel9)
                            .addGroup(optionPanelLayout.createSequentialGroup()
                                .addComponent(btTraversal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btTraversalStep)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRandomGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDemoGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSourceNode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDestNode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRun, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRunStep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTraversal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTraversalStep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaveGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClearOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        graphPanel_App.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 3));
        graphPanel_App.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                graphPanel_AppComponentResized(evt);
            }
        });

        javax.swing.GroupLayout graphPanel_AppLayout = new javax.swing.GroupLayout(graphPanel_App);
        graphPanel_App.setLayout(graphPanel_AppLayout);
        graphPanel_AppLayout.setHorizontalGroup(
            graphPanel_AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        graphPanel_AppLayout.setVerticalGroup(
            graphPanel_AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        outputPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 3));

        taOutput.setEditable(false);
        taOutput.setColumns(20);
        taOutput.setRows(5);
        jScrollPane1.setViewportView(taOutput);

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        jLabel10.setText("Output");

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graphPanel_App, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(graphPanel_App, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRandomGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRandomGraphActionPerformed
        cbSourceNode.setEnabled(true);
        cbDestNode.setEnabled(true);
        
        gp.randomGraph();
        gp.repaint();
        setComboBoxData();
    }//GEN-LAST:event_btRandomGraphActionPerformed

    private void btDemoGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDemoGraphActionPerformed
        cbSourceNode.setEnabled(true);
        cbDestNode.setEnabled(true);
        
        gp.readGraphFromFile("D:\\Documents\\NetbeansProjects\\ShortestPathRouting\\demo.txt");
        gp.repaint();
        setComboBoxData();
        this.sourceNode = gp.getSourceNode();
        System.out.println("this.sourceNode = " + this.sourceNode);
        cbSourceNode.setSelectedIndex(this.sourceNode - 1);
    }//GEN-LAST:event_btDemoGraphActionPerformed

    private void btRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRunActionPerformed
        gp.paintDijkstra();
    }//GEN-LAST:event_btRunActionPerformed

    private void btRunStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRunStepActionPerformed
        btTraversal.setEnabled(false);
        btTraversalStep.setEnabled(false);
        btRun.setEnabled(false);
        cbSourceNode.setEnabled(false);
        cbDestNode.setEnabled(false);
        gp.paintDijkstraSteps();
        if(!gp.isRunningStep) {
            btTraversal.setEnabled(true);
            btTraversalStep.setEnabled(true);
            btRun.setEnabled(true);
            cbSourceNode.setEnabled(true);
            cbDestNode.setEnabled(true);
        }
    }//GEN-LAST:event_btRunStepActionPerformed

    private void graphPanel_AppComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_graphPanel_AppComponentResized
        gp.setSize(graphPanel_App.getWidth(), graphPanel_App.getHeight());
    }//GEN-LAST:event_graphPanel_AppComponentResized

    private void btClearOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearOutputActionPerformed
        taOutput.setText("");
    }//GEN-LAST:event_btClearOutputActionPerformed

    private void cbSourceNodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSourceNodeItemStateChanged
        this.sourceNode = cbSourceNode.getSelectedIndex();
    }//GEN-LAST:event_cbSourceNodeItemStateChanged

    private void cbDestNodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDestNodeItemStateChanged
        this.destNode = cbDestNode.getSelectedIndex();
    }//GEN-LAST:event_cbDestNodeItemStateChanged

    private void btTraversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraversalActionPerformed
        gp.traversalDFS(1);
    }//GEN-LAST:event_btTraversalActionPerformed

    private void btSaveGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveGraphActionPerformed
        gp.saveGraph("D:\\Documents\\C,C++\\demo.txt");
    }//GEN-LAST:event_btSaveGraphActionPerformed

    private void btTraversalStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraversalStepActionPerformed
        btRun.setEnabled(false);
        btRunStep.setEnabled(false);
        btTraversal.setEnabled(false);
        cbSourceNode.setEnabled(false);
        cbDestNode.setEnabled(false);
        gp.traversalDFSSteps(1);    //tạm thời cứ duyệt từ node 1
        if(!gp.isRunningStep) {
            btRun.setEnabled(true);
            btRunStep.setEnabled(true);
            btTraversal.setEnabled(true);
            cbSourceNode.setEnabled(true);
            cbDestNode.setEnabled(true);
        }
        
    }//GEN-LAST:event_btTraversalStepActionPerformed

    private void setComboBoxData() {
        int nodeQuantities = gp.nodeQuantites;
        
        String [] str = new String [nodeQuantities];
        for (int i = 0; i < nodeQuantities; i++) {
            str[i] = (i+1) + "";
        }
        cbSourceNode.setModel(new DefaultComboBoxModel<>(str));
        
        String [] str2 = new String [nodeQuantities+1];
        str2[0] = STR_ALL;
        for (int i = 1; i <= nodeQuantities; i++) {
            str2[i] = i + "";
        }
        cbDestNode.setModel(new DefaultComboBoxModel<>(str2));
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClearOutput;
    private javax.swing.JButton btDemoGraph;
    private javax.swing.JButton btRandomGraph;
    private javax.swing.JButton btRun;
    private javax.swing.JButton btRunStep;
    private javax.swing.JButton btSaveGraph;
    private javax.swing.JButton btTraversal;
    private javax.swing.JButton btTraversalStep;
    private javax.swing.JComboBox<String> cbDestNode;
    private javax.swing.JComboBox<String> cbSourceNode;
    private javax.swing.JPanel graphPanel_App;
    private javax.swing.ButtonGroup groupTravelGraph;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JTextArea taOutput;
    // End of variables declaration//GEN-END:variables
}